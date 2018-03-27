/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.ws;

import br.com.wsintegrabolao.dao.WSIntegraBolaoController;
import br.com.wsintegrabolao.dao.obj.TipousuarioDAO;
import br.com.wsintegrabolao.dto.HibernateProxyTypeAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import br.com.wsintegrabolao.dto.Validator;
import br.com.wsintegrabolao.bolao.dto.TipousuarioDTO;
import br.com.wsintegrabolao.bolao.dto.UsuarioDTO;
import br.com.wsintegrabolao.funcoes.dto.EquipeDTO;
import br.com.wsintegrabolao.util.Utils;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno.szczuk
 */
@WebService(serviceName = "bolao")

public class bolao {

    Gson gsonGenerico = new GsonBuilder().registerTypeAdapterFactory(HibernateProxyTypeAdapter.FACTORY).setDateFormat("yyyy-MM-dd HH:mm:ss").create();
    Gson gsonExpose = new GsonBuilder().registerTypeAdapterFactory(HibernateProxyTypeAdapter.FACTORY).setDateFormat("yyyy-MM-dd HH:mm:ss").excludeFieldsWithoutExposeAnnotation().create();

    /**
     * Operação de Web service
     *
     * @param cdUsuario
     * @param token
     * @return
     */
    @WebMethod(operationName = "getUsuario")
    public String getUsuario(@WebParam(name = "cdUsuario") String cdUsuario, @WebParam(name = "token") String token) {
        if (Validator.validaToken(token)) {
            return Utils.getJsonGenerico(new UsuarioDTO(WSIntegraBolaoController.buscaUsuario(cdUsuario)), gsonGenerico);
        } else {
            return "ERRO: TOKEN inválido.";
        }
    }

    /**
     * Operação de Web service
     *
     * @param token
     * @return
     */
    @WebMethod(operationName = "getTipoUsuario")
    public String getTipoUsuario(@WebParam(name = "token") String token) {
        List<TipousuarioDTO> lista = new ArrayList<>();
        if (Validator.validaToken(token)) {
            for (TipousuarioDAO d : WSIntegraBolaoController.buscaTipoUsuario()) {
                lista.add(new TipousuarioDTO(d));
            }
            return Utils.getJsonGenerico(lista, gsonGenerico);
        } else {
            return "ERRO: TOKEN inválido.";
        }
    }

    /**
     * Operação de Web service
     */
    
    
    @WebMethod(operationName = "setPalpite")
    public String setPalpite(@WebParam(name = "palpite") String palpite, @WebParam(name = "token") String token) {
        if (Validator.validaToken(token)) {
            try {
                
            } catch (Exception e) {

            }
        } else {
            return "ERRO: TOKEN inválido.";
        }
        return null;
    }
}
