/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.ws;

import br.com.wsintegrabolao.dao.WSIntegraBolaoController;
import br.com.wsintegrabolao.dao.obj.ClassificacaoDAO;
import br.com.wsintegrabolao.dao.obj.EquipeDAO;
import br.com.wsintegrabolao.dao.obj.JogoidDAO;
import br.com.wsintegrabolao.dto.HibernateProxyTypeAdapter;
import br.com.wsintegrabolao.dto.funcoes.EquipeDTO;
import br.com.wsintegrabolao.dto.funcoes.JogoidDTO;
import br.com.wsintegrabolao.dto.funcoes.classificacao.ClassificacaoDTO;
import br.com.wsintegrabolao.util.Utils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author bruno.szczuk
 */
@WebService(serviceName = "funcoes")
public class funcoes {

    Gson gsonGenerico = new GsonBuilder().registerTypeAdapterFactory(HibernateProxyTypeAdapter.FACTORY).setDateFormat("yyyy-MM-dd HH:mm:ss").create();
    Gson gsonExpose = new GsonBuilder().registerTypeAdapterFactory(HibernateProxyTypeAdapter.FACTORY).setDateFormat("yyyy-MM-dd HH:mm:ss").excludeFieldsWithoutExposeAnnotation().create();

    /**
     * Operação de Web service
     *
     * @param cdEquipe
     * @return
     */
    @WebMethod(operationName = "getEquipe")
    public String getEquipe(@WebParam(name = "cdEquipe") String cdEquipe) {
        try {
            return Utils.getJsonGenerico(new EquipeDTO(WSIntegraBolaoController.buscaEquipe(cdEquipe)), gsonGenerico);
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    /**
     * Operação de Web service
     *
     * @return
     */
    @WebMethod(operationName = "getEquipeList")
    public String getEquipeList() {
        List<EquipeDTO> equipes = new ArrayList<>();
        try {
            for (EquipeDAO e : WSIntegraBolaoController.buscaEquipeList()) {
                equipes.add(new EquipeDTO(e));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Utils.getJsonGenerico(equipes, gsonGenerico);
    }

    /**
     * Operação de Web service
     *
     * @param id
     * @return
     */
    @WebMethod(operationName = "getClassificacao")
    public String getClassificacao(@WebParam(name = "id") String id) {
        try {
            return Utils.getJsonGenerico(new ClassificacaoDTO(WSIntegraBolaoController.buscaClassificacao(id)), gsonExpose);
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    /**
     * Operação de Web service
     *
     * @return
     */
    @WebMethod(operationName = "getClassificacaoList")
    public String getClassificacaoList() {
        List<ClassificacaoDTO> lista = new ArrayList<>();
        try {
            for (ClassificacaoDAO c : WSIntegraBolaoController.buscaClassificacaoList()) {
                lista.add(new ClassificacaoDTO(c));
            }
        } catch (Exception e) {
            return e.getMessage();
        }
        return Utils.getJsonGenerico(lista, gsonExpose);
    }

    /**
     * Operação de Web service
     * @param cdJogo
     * @return 
     */
    @WebMethod(operationName = "getJogo")
    public String getJogo(@WebParam(name = "cdJogo") int cdJogo) {
        try {
            return Utils.getJsonGenerico(new JogoidDTO(WSIntegraBolaoController.buscaJogo(cdJogo)), gsonExpose);
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    /**
     * Operação de Web service
     *
     * @param nrRodada
     * @return String
     */
    @WebMethod(operationName = "getJogoRodada")
    public String getJogoRodada(@WebParam(name = "nrRodada") String nrRodada) {
        List<JogoidDTO> lista = new ArrayList<>();
        try {
            for (JogoidDAO j : WSIntegraBolaoController.buscaJogoRodada(nrRodada)){
                lista.add(new JogoidDTO(j));
            }
        } catch (Exception e) {
            return e.getMessage();
        }
        return Utils.getJsonGenerico(lista, gsonExpose);

    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "getJogoList")
    public String getJogoList() {
        List<JogoidDTO> lista = new ArrayList<>();
        try {
            for (JogoidDAO j : WSIntegraBolaoController.buscaJogoList()){
                lista.add(new JogoidDTO(j));
            }
        } catch (Exception e) {
            return e.getMessage();
        }
        return Utils.getJsonGenerico(lista, gsonExpose);
    }
}
