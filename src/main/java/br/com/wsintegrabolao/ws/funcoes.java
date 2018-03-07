/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.ws;

import br.com.wsintegrabolao.dao.ConexaoDAO;
import br.com.wsintegrabolao.dao.obj.Equipe;
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

    /**
     * This is a sample web service operation
     */
    Gson g = new Gson();

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Operação de Web service
     *
     * @param cdEquipe
     * @return
     */
    @WebMethod(operationName = "getEquipe")
    public String getEquipe(@WebParam(name = "cdEquipe") String cdEquipe) {
        Equipe e = null;
        try {
            e = ConexaoDAO.getInstance().getEm().find(Equipe.class, cdEquipe);
            return g.toJson(e);
        } catch (NoResultException n) {
            return "Não há nenhuma equipe com esse código";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return g.toJson(e);
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
}
