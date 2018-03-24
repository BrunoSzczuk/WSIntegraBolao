/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.dao;

import br.com.wsintegrabolao.dao.obj.ClassificacaoDAO;
import br.com.wsintegrabolao.dao.obj.Classificacaoderrota;
import br.com.wsintegrabolao.dao.obj.Classificacaoempate;
import br.com.wsintegrabolao.dao.obj.Classificacaojogo;
import br.com.wsintegrabolao.dao.obj.Classificacaopg;
import br.com.wsintegrabolao.dao.obj.Classificacaovitoria;
import br.com.wsintegrabolao.dao.obj.Equipe;
import br.com.wsintegrabolao.dao.obj.Jogoid;
import br.com.wsintegrabolao.dao.obj.Usuario;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author bruno.szczuk
 */
public class WSIntegraBolaoController {

    public static ClassificacaoDAO buscaClassificacao(String cdEquipe) {
        try {
            ResultSet rs = ConexaoBolao.getStatement().executeQuery("select c.*, \n"
                    + "       ce.qt_mandante as qt_mandanteEmpate, ce.qt_visitante as qt_visitanteEmpate, ce.qt_total as qt_totalEmpate,\n"
                    + "       cd.qt_mandante as qt_mandanteDerrota, cd.qt_visitante as qt_visitanteDerrota, cd.qt_total as qt_totalDerrota,\n"
                    + "       cj.qt_mandante as qt_mandanteJogo, cj.qt_visitante as qt_visitanteJogo, cj.qt_total as qt_totalJogo,\n"
                    + "       cpg.qt_mandante as qt_mandantePontoGols, cpg.qt_visitante as qt_visitantePontoGols, cpg.qt_total as qt_totalPontoGols,\n"
                    + "       cv.qt_mandante as qt_mandanteVitoria, cv.qt_visitante as qt_visitanteVitoria, cv.qt_total as qt_totalVitoria\n"
                    + "  from classificacao as c\n"
                    + " inner join classificacaovitoria as cv on (cv.cd_equipe = c.cd_equipe)\n"
                    + " inner join classificacaoempate as ce on (ce.cd_equipe = c.cd_equipe)\n"
                    + " inner join classificacaoderrota as cd on (cd.cd_equipe = c.cd_equipe)\n"
                    + " inner join classificacaopg as cpg on (cpg.cd_equipe = c.cd_equipe)\n"
                    + " inner join classificacaojogo as cj on (cj.cd_equipe = c.cd_equipe)\n"
                    + " where c.cd_equipe = '" + cdEquipe + "' ");
            while (rs.next()) {
                Equipe e = buscaEquipe(rs.getString("cd_equipe"));
                ClassificacaoDAO c = new ClassificacaoDAO();
                c.setCdEquipe(rs.getString("cd_equipe"));
                c.setEquipe(e);
                c.setAproveitamento(rs.getFloat("pc_aproveitamento"));
                c.setGanho_pos(Integer.toString(rs.getInt("ga_posicao")));
                c.setGolsContra(rs.getInt("go_contra"));
                c.setGolsPro(rs.getInt("go_pro"));
                c.setPos(rs.getString("ps_equipe"));
                c.setSaldoGols(rs.getInt("sd_gols"));
                c.setDerrota(buscaClassificacaoderrota(c.getCdEquipe()));
                c.setEmpate(buscaClassificacaoempate(c.getCdEquipe()));
                c.setJogos(buscaClassificacaojogo(c.getCdEquipe()));
                c.setPontosGols(buscaClassificacaopg(c.getCdEquipe()));
                c.setVitoria(buscaClassificacaovitoria(c.getCdEquipe()));
                rs.close();
                return c;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<ClassificacaoDAO> buscaClassificacaoList(){
        return ConexaoDAO.getInstance().getEm().createQuery("SELECT e FROM ClassificacaoDAO e", ClassificacaoDAO.class).getResultList();
    }
    public static Equipe buscaEquipe(String cdEquipe) {
        return ConexaoDAO.getInstance().getEm().find(Equipe.class, cdEquipe);
    }
    
    public static List<Equipe> buscaEquipeList(){
        return ConexaoDAO.getInstance().getEm().createQuery("SELECT e FROM Equipe e", Equipe.class).getResultList();
    }

    public static Classificacaoderrota buscaClassificacaoderrota(String cdEquipe) {
        return ConexaoDAO.getInstance().getEm().createQuery("SELECT e from Classificacaoderrota e where e.cdEquipe = :cdEquipe", Classificacaoderrota.class).setParameter("cdEquipe", cdEquipe).getSingleResult();
    }

    public static Classificacaoempate buscaClassificacaoempate(String cdEquipe) {
        return ConexaoDAO.getInstance().getEm().createQuery("SELECT e from Classificacaoempate e where e.cdEquipe = :cdEquipe", Classificacaoempate.class).setParameter("cdEquipe", cdEquipe).getSingleResult();
    }

    public static Classificacaojogo buscaClassificacaojogo(String cdEquipe) {
        return ConexaoDAO.getInstance().getEm().createQuery("SELECT e from Classificacaojogo e where e.cdEquipe = :cdEquipe", Classificacaojogo.class).setParameter("cdEquipe", cdEquipe).getSingleResult();
    }

    public static Classificacaovitoria buscaClassificacaovitoria(String cdEquipe) {
        return ConexaoDAO.getInstance().getEm().createQuery("SELECT e from Classificacaovitoria e where e.cdEquipe = :cdEquipe", Classificacaovitoria.class).setParameter("cdEquipe", cdEquipe).getSingleResult();
    }

    public static Classificacaopg buscaClassificacaopg(String cdEquipe) {
        return ConexaoDAO.getInstance().getEm().createQuery("SELECT e from Classificacaopg e where e.cdEquipe = :cdEquipe", Classificacaopg.class).setParameter("cdEquipe", cdEquipe).getSingleResult();
    }

    public static Jogoid buscaJogo(int cdJogo) {
        return ConexaoDAO.getInstance().getEm().find(Jogoid.class,cdJogo);
    }

    public static List<Jogoid> buscaJogoList(){
        return ConexaoDAO.getInstance().getEm().createQuery("SELECT e FROM Jogoid e", Jogoid.class).getResultList();
    }
    public static List<Jogoid> buscaJogoRodada(String nrRodada) {
        return ConexaoDAO.getInstance().getEm().createQuery("SELECT e from Jogoid e where e.nrRodada = :nrRodada", Jogoid.class).setParameter("nrRodada", nrRodada).getResultList();
    }
    public static Usuario buscaUsuario(String cdUsuario){
        return ConexaoDAO.getInstance().getEm().find(Usuario.class, cdUsuario);
    }

}
