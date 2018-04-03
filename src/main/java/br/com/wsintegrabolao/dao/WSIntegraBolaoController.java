/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.dao;

import br.com.wsintegrabolao.dao.obj.*;
import java.sql.ResultSet;
import java.util.ArrayList;
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
                EquipeDAO e = buscaEquipe(rs.getString("cd_equipe"));
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

    public static List<ClassificacaoDAO> buscaClassificacaoList() {
        return buscaListGenerico(ClassificacaoDAO.class);
    }

    public static EquipeDAO buscaEquipe(String cdEquipe) {
        return ConexaoDAO.getInstance().getEm().find(EquipeDAO.class, cdEquipe);
    }

    public static List<EquipeDAO> buscaEquipeList() {
        return (List<EquipeDAO>) buscaListGenerico(EquipeDAO.class);
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

    public static JogoidDAO buscaJogo(int cdJogo) {
        return ConexaoDAO.getInstance().getEm().find(JogoidDAO.class, cdJogo);
    }

    public static List<JogoidDAO> buscaJogoList() {
        return (List<JogoidDAO>) buscaListGenerico(JogoidDAO.class);
    }

    public static List<JogoidDAO> buscaJogoRodada(String nrRodada) {
        return ConexaoDAO.getInstance().getEm().createQuery("SELECT e from JogoidDAO e where e.nrRodada = :nrRodada", JogoidDAO.class).setParameter("nrRodada", nrRodada).getResultList();
    }

    public static UsuarioDAO buscaUsuario(String cdUsuario) {
        return ConexaoDAO.getInstance().getEm().find(UsuarioDAO.class, cdUsuario);
    }

    public static List<TipousuarioDAO> buscaTipoUsuario() {
        return (List<TipousuarioDAO>) buscaListGenerico(TipousuarioDAO.class);
    }

    public static ArrayList buscaListGenerico(Class c) {
        return new ArrayList(ConexaoDAO.getInstance().getEm().createQuery("SELECT e FROM " + c.getName() + " e", c).getResultList());
    }

    public static List<PalpiteDAO> buscaPalpiteUsuario(String cdUsuario, String cdBolao) {
        return ConexaoDAO.getInstance().getEm().createQuery("SELECT e from PalpiteDAO e where e.usuario.cdUsuario = :cdUsuario and e.bolao.cdBolao = :cdBolao", PalpiteDAO.class)
                .setParameter("cdUsuario", cdUsuario).setParameter("cdBolao", Long.valueOf(cdBolao)).getResultList();
    }

    public static List<PalpiteDAO> buscaPalpiteRodada(String nrRodada, String cdBolao) {
        return ConexaoDAO.getInstance().getEm().createQuery("SELECT e from PalpiteDAO e where e.jogoid.nrRodada = :nrRodada and e.bolao.cdBolao = :cdBolao", PalpiteDAO.class)
                .setParameter("nrRodada", nrRodada).setParameter("cdBolao", Long.valueOf(cdBolao)).getResultList();
    }

    public static Bolao buscaBolao(String cdBolao) {
        return ConexaoDAO.getInstance().getEm().find(Bolao.class, Long.valueOf(cdBolao));
    }

    public static PalpiteDAO buscaPalpitePK(PalpiteId pk) {
        return ConexaoDAO.getInstance().getEm().createQuery("SELECT e from PalpiteDAO e where e.id = :id", PalpiteDAO.class).setParameter("id", pk).getSingleResult();
    }

}
