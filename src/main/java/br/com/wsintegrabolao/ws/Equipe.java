/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.ws;

import br.com.wsintegrabolao.dao.ConexaoDAO;
import com.google.gson.Gson;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author bruno.szczuk
 */
@WebService(serviceName = "Equipe")
public class Equipe {

    Gson g = new Gson();

    /**
     * This is a sample web service operation
     *
     * @param cdEquipe
     * @return String
     */
    @WebMethod(operationName = "getEquipe")

    public String getEquipe(@WebParam(name = "cdEquipe") String cdEquipe) {
        return g.toJson(ConexaoDAO.getInstance().getEm().find(Equipe.class, cdEquipe));
    }
}
