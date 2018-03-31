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
import br.com.wsintegrabolao.bolao.dto.*;
import br.com.wsintegrabolao.bolao.service.PalpiteService;
import br.com.wsintegrabolao.dao.ConexaoDAO;
import br.com.wsintegrabolao.dao.obj.PalpiteDAO;
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
    ConexaoDAO conn = ConexaoDAO.getInstance();
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
            try {
                return Utils.getJsonGenerico(new UsuarioDTO(WSIntegraBolaoController.buscaUsuario(cdUsuario)), gsonGenerico);
            } catch (Exception e) {
                return "ERRO:" + e.getMessage();
            }
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
            try {
                for (TipousuarioDAO d : WSIntegraBolaoController.buscaTipoUsuario()) {
                    lista.add(new TipousuarioDTO(d));
                }
                return Utils.getJsonGenerico(lista, gsonGenerico);
            } catch (Exception e) {
                return "ERRO:" + e.getMessage();
            }
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
                PalpiteService p = new PalpiteService(gsonExpose.fromJson(palpite, PalpiteDTO.class));
                p.validar();
                conn.persist(p);                
            } catch (Exception e) {
                e.printStackTrace();
                return "ERRO:" + e.getMessage();
            }
        } else {
            return "ERRO: TOKEN inválido.";
        }
        return " ";
    }

    /**
     * Operação de Web service
     *
     * @param cdUsuario
     * @param token
     * @return
     */
    @WebMethod(operationName = "getPalpiteUsuario")
    public String getPalpiteUsuario(@WebParam(name = "cdUsuario") String cdUsuario, @WebParam(name = "cdBolao") String cdBolao, @WebParam(name = "token") String token) {
        List<PalpiteDTO> lista = new ArrayList<>();
        if (Validator.validaToken(token)) {
            try {
                for (PalpiteDAO p : WSIntegraBolaoController.buscaPalpiteUsuario(cdUsuario, cdBolao)) {
                    lista.add(new PalpiteDTO(p));
                }
                return Utils.getJsonGenerico(lista, gsonExpose);
            } catch (Exception e) {
                e.printStackTrace();
                return "ERRO:" + e.getMessage();
            }
        } else {
            return "ERRO: TOKEN inválido.";
        }
    }

    /**
     * Operação de Web service
     *
     * @param nrRodada
     * @param cdBolao
     * @param token
     * @return
     */
    @WebMethod(operationName = "getPalpiteRodada")
    public String getPalpiteRodada(@WebParam(name = "nrRodada") String nrRodada, @WebParam(name = "cdBolao") String cdBolao, @WebParam(name = "token") String token) {
        List<PalpiteDTO> lista = new ArrayList<>();
        if (Validator.validaToken(token)) {
            try {
                for (PalpiteDAO p : WSIntegraBolaoController.buscaPalpiteRodada(nrRodada, cdBolao)) {
                    lista.add(new PalpiteDTO(p));
                }
                return Utils.getJsonGenerico(lista, gsonExpose);
            } catch (Exception e) {
                e.printStackTrace();
                return "ERRO:" + e.getMessage();
            }
        } else {
            return "ERRO: TOKEN inválido.";
        }
    }
}
