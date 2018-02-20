/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.dao;

import java.util.HashMap;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import javax.persistence.Persistence;

/**
 *
 * @author bruno.szczuk
 */
public class ConexaoDAO {

    private static ConexaoDAO instance = null;
    private EntityManager em;
    private EntityTransaction tx;

    public ConexaoDAO() {
        try {
            HashMap<String, String> map = new HashMap<String, String>();
            map.put("hibernate.connection.username", "aplicacao");
            map.put("hibernate.connection.driver_class", "org.postgresql.Driver");
            map.put("hibernate.connection.password", "aplicacao01");
            map.put("hibernate.connection.url", "jdbc:postgresql://localhost:5432/bolao");
            map.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");

            map.put("hibernate.connection.lc_ctype", "LATIN1");
            map.put("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");
            
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("WSIntegraBolaoPU", map);
            em = emf.createEntityManager();
            em.setFlushMode(FlushModeType.AUTO);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static ConexaoDAO getInstance() {
        if (instance == null) {
            instance = new ConexaoDAO();
        }
        return instance;
    }

    public EntityManager getEm() {
        return em;
    }

    public EntityTransaction getTx() {
        return tx;
    }
    
    public boolean remove(Object obj) {
        try {
            em.remove(obj);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public void startTransaction() {
        tx = em.getTransaction();
        if (tx.isActive() && tx.getRollbackOnly()) {
            tx.rollback();
        }
        if (!tx.isActive()) {
            tx.begin();
        }
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
    }

    public void commit() {
//        startTransaction();
        if (tx != null && tx.isActive()) {
            try {
                tx.commit();
            } catch (Exception cex) {
                try {
                    cex.printStackTrace();
                    tx.rollback();
                } catch (Exception rex) {
                    System.out.println("Erro RollBack ");
                    rex.printStackTrace();
                }
                throw new RuntimeException("Erro gravando alteraçoes no Banco de Dados. "+ cex);
            }
        }
    }

    public void rollback() {
        if (tx != null && tx.isActive()) {
            try {
                tx.rollback();
            } catch (Exception rex) {
                rex.printStackTrace();
            }
        }
    }

    public Object persist(Object obj) {
        startTransaction();
        try {
            Object novo = em.merge(obj);
            obj = novo;
        } catch (Exception ex) {
            try {
                em.persist(obj);
            } catch (Exception pex) {
                rollback();
                pex.printStackTrace();
                return null;
            }
        }
        return obj;
    }
}
