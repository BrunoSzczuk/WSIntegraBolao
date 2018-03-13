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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "classificacao")
public class ClassificacaoDAO implements Serializable {

    @Column(name = "go_pro")
    @Expose
    private int golsPro;

    @OneToOne
    @JoinColumn(name = "cd_equipe")
    @Expose
    private Equipe equipe;
    
    @Id
    @Column(name = "cd_equipe")
    @Expose
    private String cdEquipe;

    public Equipe getEquipe() {
        return equipe;
    }

    public String getCdEquipe() {
        return cdEquipe;
    }

    public void setCdEquipe(String cdEquipe) {
        this.cdEquipe = cdEquipe;
    }

    public void setEquipe(Equipe equipe) {
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
    private String ganho_pos;

    @OneToOne(mappedBy = "cdEquipe")
    @Expose
    @JoinColumn(name = "cd_equipe", referencedColumnName = "cd_equipe", insertable = true, updatable = true)
    private Classificacaopg pontosGols;

    @OneToOne(mappedBy = "cdEquipe")
    @Expose
    @JoinColumn(name = "cd_equipe", referencedColumnName = "cd_equipe", insertable = true, updatable = true)
    private Classificacaojogo jogos;

    @OneToOne(mappedBy = "cdEquipe")
    @Expose
    @JoinColumn(name = "cd_equipe", referencedColumnName = "cd_equipe", insertable = true, updatable = true)
    private Classificacaovitoria vitoria;

    @OneToOne(mappedBy = "cdEquipe")
    @Expose
    @JoinColumn(name = "cd_equipe", referencedColumnName = "cd_equipe", insertable = true, updatable = true)
    private Classificacaoempate empate;

    @OneToOne(mappedBy = "cdEquipe")
    @Expose
    @JoinColumn(name = "cd_equipe", referencedColumnName = "cd_equipe", insertable = true, updatable = true)
    private Classificacaoderrota derrota;

    @Column(name = "pc_aproveitamento")
    @Expose
    private float aproveitamento;

    public ClassificacaoDAO() {
    }

    public Classificacaopg getPontosGols() {
        return pontosGols;
    }

    public void setPontosGols(Classificacaopg pontosGols) {
        this.pontosGols = pontosGols;
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
        return ganho_pos;
    }

    public void setGanho_pos(String ganho_pos) {
        this.ganho_pos = ganho_pos;
    }


    public float getAproveitamento() {
        return aproveitamento;
    }

    public void setAproveitamento(float aproveitamento) {
        this.aproveitamento = aproveitamento;
    }

    @Override
    public String toString() {
        return "ClassificacaoDAO{" + "golsPro=" + golsPro + ", equipe=" + equipe + ", golsContra=" + golsContra + ", saldoGols=" + saldoGols + ", pos=" + pos + ", ganho_pos=" + ganho_pos + ", pontosGols=" + pontosGols + ", jogos=" + jogos + ", vitoria=" + vitoria + ", empate=" + empate + ", derrota=" + derrota + ", aproveitamento=" + aproveitamento + '}';
    }

}
