/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.dao.obj;

import com.google.gson.annotations.Expose;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "classificacao")
public class ClassificacaoDAO implements Serializable {

    @OneToOne(fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn

    private EquipeDAO equipe;

    @Id
    @Column(name = "cd_equipe", insertable = false, updatable = false)
    @Expose
    private String cdEquipe;

    @Column(name = "go_pro")
    @Expose
    private int golsPro;

    public EquipeDAO getEquipe() {
        return equipe;
    }

    public String getCdEquipe() {
        return cdEquipe;
    }

    public void setCdEquipe(String cdEquipe) {
        this.cdEquipe = cdEquipe;
    }

    public void setEquipe(EquipeDAO equipe) {
        this.equipe = equipe;
    }

    @Column(name = "go_contra")
    @Expose
    private int golsContra;

    @Column(name = "sd_gols")
    @Expose
    private int saldoGols;

    @Column(name = "ps_equipe")
    @Expose
    private String pos;

    @Column(name = "ga_posicao")
    @Expose    
    private String ganhoPos;

    @OneToOne
    @Expose
    @JoinColumn(name = "cd_equipe", referencedColumnName = "cd_equipe", insertable = false, updatable = false)
    private Classificacaopg pontosGanhos;

    @ManyToOne
    @Expose
    @JoinColumn(name = "cd_equipe", referencedColumnName = "cd_equipe", insertable = false, updatable = false)
    private Classificacaojogo jogos;

    @ManyToOne
    @Expose
    @JoinColumn(name = "cd_equipe", referencedColumnName = "cd_equipe", insertable = false, updatable = false)
    private Classificacaovitoria vitoria;

    @ManyToOne
    @Expose
    @JoinColumn(name = "cd_equipe", referencedColumnName = "cd_equipe", insertable = false, updatable = false)
    private Classificacaoempate empate;

    @ManyToOne
    @Expose
    @JoinColumn(name = "cd_equipe", referencedColumnName = "cd_equipe", insertable = false, updatable = false)
    private Classificacaoderrota derrota;

    @Column(name = "pc_aproveitamento")
    @Expose
    private float aproveitamento;

    public ClassificacaoDAO() {
    }

    public Classificacaopg getPontosGols() {
        return pontosGanhos;
    }

    public void setPontosGols(Classificacaopg pontosGanhos) {
        this.pontosGanhos = pontosGanhos;
    }

    public Classificacaojogo getJogos() {
        return jogos;
    }

    public void setJogos(Classificacaojogo jogos) {
        this.jogos = jogos;
    }

    public Classificacaovitoria getVitoria() {
        return vitoria;
    }

    public void setVitoria(Classificacaovitoria vitoria) {
        this.vitoria = vitoria;
    }

    public Classificacaoempate getEmpate() {
        return empate;
    }

    public void setEmpate(Classificacaoempate empate) {
        this.empate = empate;
    }

    public Classificacaoderrota getDerrota() {
        return derrota;
    }

    public void setDerrota(Classificacaoderrota derrota) {
        this.derrota = derrota;
    }

    public int getGolsPro() {
        return golsPro;
    }

    public void setGolsPro(int golsPro) {
        this.golsPro = golsPro;
    }

    public int getGolsContra() {
        return golsContra;
    }

    public void setGolsContra(int golsContra) {
        this.golsContra = golsContra;
    }

    public int getSaldoGols() {
        return saldoGols;
    }

    public void setSaldoGols(int saldoGols) {
        this.saldoGols = saldoGols;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getGanho_pos() {
        return ganhoPos;
    }

    public void setGanho_pos(String ganhoPos) {
        this.ganhoPos = ganhoPos;
    }

    public float getAproveitamento() {
        return aproveitamento;
    }

    public void setAproveitamento(float aproveitamento) {
        this.aproveitamento = aproveitamento;
    }

    @Override
    public String toString() {
        return "ClassificacaoDAO{" + "golsPro=" + golsPro + ", equipe=" + equipe + ", golsContra=" + golsContra + ", saldoGols=" + saldoGols + ", pos=" + pos + ", ganhoPos=" + ganhoPos + ", pontosGanhos=" + pontosGanhos + ", jogos=" + jogos + ", vitoria=" + vitoria + ", empate=" + empate + ", derrota=" + derrota + ", aproveitamento=" + aproveitamento + '}';
    }

}
