/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.ws;

import br.com.wsintegrabolao.dao.WSIntegraBolaoController;
import br.com.wsintegrabolao.util.HibernateProxyTypeAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import br.com.wsintegrabolao.dto.validator.Validator;
import br.com.wsintegrabolao.util.Utils;

/**
 *
 * @author bruno.szczuk
 */
@WebService(serviceName = "bolao")

public class bolao {

    Gson gsonGenerico = new GsonBuilder().registerTypeAdapterFactory(HibernateProxyTypeAdapter.FACTORY).setDateFormat("yyyy-MM-dd HH:mm:ssX").create();
    Gson gsonExpose = new GsonBuilder().registerTypeAdapterFactory(HibernateProxyTypeAdapter.FACTORY).setDateFormat("yyyy-MM-dd HH:mm:ssX").excludeFieldsWithoutExposeAnnotation().create();

    /**
     * Operação de Web service
     * @param cdUsuario
     * @param token
     * @return 
     */
    @WebMethod(operationName = "getUsuario")
    public String getUsuario(@WebParam(name = "cdUsuario") String cdUsuario, @WebParam(name = "token") String token) {
        if (Validator.validaToken(token)) {
           return Utils.getJsonGenerico(WSIntegraBolaoController.buscaUsuario(cdUsuario), gsonGenerico);
        } else {
            return "ERRO: TOKEN inválido.";
        }
    }
}
