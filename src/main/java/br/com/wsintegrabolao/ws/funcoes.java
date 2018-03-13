/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.ws;

import br.com.wsintegrabolao.dao.ConexaoDAO;
import br.com.wsintegrabolao.dao.WSIntegraBolaoController;
import br.com.wsintegrabolao.dao.obj.Equipe;
import br.com.wsintegrabolao.dao.obj.Usuario;
import br.com.wsintegrabolao.exp.ExceptionDAO;
import br.com.wsintegrabolao.util.Utils;
import com.google.gson.Gson;
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
            return Utils.getJsonGenerico(Utils.getGenerico(cdEquipe, Equipe.class));
        } catch (ExceptionDAO e) {
            e.printStackTrace();
            return "Erro";
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
            return Utils.getJsonGenerico(Utils.getGenerico(id, Usuario.class));
        } catch (ExceptionDAO e) {
            return e.getMessage();
        }
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "getClassificacao")
    public String getClassificacao(@WebParam(name = "id") String id) {
        try{
            //return Utils.getJsonGenerico(new ArrayList<>(ConexaoDAO.getInstance().getEm().createQuery("SELECT c FROM Classificacao c", Classificacao.class).getResultList()));
            //return Utils.getJsonGenerico(Utils.getGenerico(id, Classificacao.class));
            return Utils.getJsonGenerico(WSIntegraBolaoController.getClassificacao(id));
        }catch (Exception e){
            return e.getMessage();
        }
   /*     List<ClassificacaoDAO> equipes = null;
        try{
            equipes = ConexaoDAO.getInstance().getEm().createQuery("SELECT e FROM ClassificacaoDAO e", ClassificacaoDAO.class).getResultList();
            ResultSet rs = ConexaoDAO.getInstance().
        }catch(Exception e) {
            return e.getMessage();
        }
        return g.toJson(equipes);*/
        
    }
    
    
}
