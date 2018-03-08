/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.ws;

import br.com.wsintegrabolao.dao.ConexaoDAO;
import br.com.wsintegrabolao.dao.obj.Equipe;
import br.com.wsintegrabolao.dao.obj.Usuario;
import br.com.wsintegrabolao.exp.ExceptionDAO;
import com.google.gson.Gson;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.NoResultException;

/**
 *
 * @author bruno.szczuk
 */
@WebService(serviceName = "funcoes")
public class funcoes {

    Gson g = new Gson();

    /**
     * Operação de Web service
     *
     * @param cdEquipe
     * @return
     */
    @WebMethod(operationName = "getEquipe")
    public String getEquipe(@WebParam(name = "cdEquipe") String cdEquipe) {
        try {
            return getJsonGenerico(getGenerico(cdEquipe, Equipe.class));
        } catch (ExceptionDAO e) {
            return e.getMessage();
        }
    }

    @WebMethod(operationName = "getEquipeList")
    public String getEquipeList() {
        List<Equipe> equipes = null;
        try {
            equipes = ConexaoDAO.getInstance().getEm().createQuery("SELECT e FROM Equipe e", Equipe.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return g.toJson(equipes);
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "getUsuario")
    public String getUsuario(@WebParam(name = "id") String id) {
        try {
            return getJsonGenerico(getGenerico(id, Usuario.class));
        } catch (ExceptionDAO e) {
            return e.getMessage();
        }
    }

    private Object getGenerico(String id, Class classe) throws ExceptionDAO {
        Object objeto = null;
        try {
            objeto = ConexaoDAO.getInstance().getEm().find(classe, id);
        } catch (NoResultException n) {
            throw new ExceptionDAO("Não há nenhum registro com esse código");
        } catch (Exception ex) {
            throw new ExceptionDAO(ex.getMessage());
        }
        return objeto;
    }

    private String getJsonGenerico(Object obj) {
        if (obj != null) {
            try {
                return g.toJson(obj);
            } catch (Exception ex) {
                return "ERRO: Erro ao gerar Json.";
            }
        }
        return "ERRO: Objeto nulo ou vazio.";
    }
}
