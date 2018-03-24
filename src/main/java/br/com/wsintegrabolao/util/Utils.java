/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.util;

import br.com.wsintegrabolao.dao.ConexaoDAO;
import br.com.wsintegrabolao.exp.ExceptionDAO;
import com.google.gson.Gson;
import javax.persistence.NoResultException;

/**
 *
 * @author bruno.szczuk
 */
public class Utils {

    public static Object getGenerico(String id, Class classe) throws ExceptionDAO {
        Object objeto = null;
        try {
            objeto = ConexaoDAO.getInstance().getEm().find(classe, id);
        } catch (NoResultException n) {
            throw new ExceptionDAO("ERRO: Não há nenhum registro com esse código");
        } catch (Exception ex) {
            throw new ExceptionDAO(ex.getMessage());
        }
        return objeto;
    }

    public static String getJsonGenerico(Object obj, Gson gson) {
        if (obj == null) {
            return "ERRO: Objeto não encontrado";
        }
        try {
            return gson.toJson(obj);
        } catch (Exception ex) {
            ex.printStackTrace();
            return "ERRO: Erro ao gerar Json. " + ex.getMessage();
        }
    }

}
