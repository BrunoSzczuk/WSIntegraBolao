/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.dto.funcoes.classificacao;

import br.com.wsintegrabolao.dao.obj.ClassificacaoDAO;
import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClassificacaoDTO implements Serializable {

    @SerializedName("cdEquipe")
    @Expose
    private String cdEquipe;
    @SerializedName("golsPro")
    @Expose
    private int golsPro;
    @SerializedName("golsContra")
    @Expose
    private int golsContra;
    @SerializedName("saldoGols")
    @Expose
    private int saldoGols;
    @SerializedName("pos")
    @Expose
    private String pos;
    @SerializedName("ganhoPos")
    @Expose
    private String ganhoPos;
    @SerializedName("pontosGanhos")
    @Expose
    private PontosGanhos pontosGanhos;
    @SerializedName("jogos")
    @Expose
    private Jogos jogos;
    @SerializedName("vitoria")
    @Expose
    private Vitoria vitoria;
    @SerializedName("empate")
    @Expose
    private Empate empate;
    @SerializedName("derrota")
    @Expose
    private Derrota derrota;
    @SerializedName("aproveitamento")
    @Expose
    private double aproveitamento;
    private final static long serialVersionUID = -7238606942353686564L;

    /**
     * No args constructor for use in serialization
     *     
*/
    public ClassificacaoDTO() {
    }

    /**
     *
     * @param golsContra
     * @param empate
     * @param derrota
     * @param golsPro
     * @param jogos
     * @param pontosGanhos
     * @param ganhoPos
     * @param cdEquipe
     * @param saldoGols
     * @param aproveitamento
     * @param vitoria
     * @param pos
     */
    public ClassificacaoDTO(String cdEquipe, int golsPro, int golsContra, int saldoGols, String pos, String ganhoPos, PontosGanhos pontosGanhos, Jogos jogos, Vitoria vitoria, Empate empate, Derrota derrota, double aproveitamento) {
        super();
        this.cdEquipe = cdEquipe;
        this.golsPro = golsPro;
        this.golsContra = golsContra;
        this.saldoGols = saldoGols;
        this.pos = pos;
        this.ganhoPos = ganhoPos;
        this.pontosGanhos = pontosGanhos;
        this.jogos = jogos;
        this.vitoria = vitoria;
        this.empate = empate;
        this.derrota = derrota;
        this.aproveitamento = aproveitamento;
    }

    public ClassificacaoDTO(ClassificacaoDAO c) {
        super();
        this.cdEquipe = c.getCdEquipe();
        this.golsPro = c.getGolsPro();
        this.golsContra = c.getGolsContra();
        this.saldoGols = c.getSaldoGols();
        this.pos = c.getPos();
        this.ganhoPos = c.getGanho_pos();
        this.pontosGanhos = new PontosGanhos(c.getPontosGols());
        this.jogos = new Jogos(c.getJogos());
        this.vitoria = new Vitoria(c.getVitoria());
        this.empate = new Empate(c.getEmpate());
        this.derrota = new Derrota(c.getDerrota());
        this.aproveitamento = c.getAproveitamento();

    }

    public String getCdEquipe() {
        return cdEquipe;
    }

    public void setCdEquipe(String cdEquipe) {
        this.cdEquipe = cdEquipe;
    }

    public ClassificacaoDTO withCdEquipe(String cdEquipe) {
        this.cdEquipe = cdEquipe;
        return this;
    }

    public int getGolsPro() {
        return golsPro;
    }

    public void setGolsPro(int golsPro) {
        this.golsPro = golsPro;
    }

    public ClassificacaoDTO withGolsPro(int golsPro) {
        this.golsPro = golsPro;
        return this;
    }

    public int getGolsContra() {
        return golsContra;
    }

    public void setGolsContra(int golsContra) {
        this.golsContra = golsContra;
    }

    public ClassificacaoDTO withGolsContra(int golsContra) {
        this.golsContra = golsContra;
        return this;
    }

    public int getSaldoGols() {
        return saldoGols;
    }

    public void setSaldoGols(int saldoGols) {
        this.saldoGols = saldoGols;
    }

    public ClassificacaoDTO withSaldoGols(int saldoGols) {
        this.saldoGols = saldoGols;
        return this;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public ClassificacaoDTO withPos(String pos) {
        this.pos = pos;
        return this;
    }

    public String getGanhoPos() {
        return ganhoPos;
    }

    public void setGanhoPos(String ganhoPos) {
        this.ganhoPos = ganhoPos;
    }

    public ClassificacaoDTO withGanhoPos(String ganhoPos) {
        this.ganhoPos = ganhoPos;
        return this;
    }

    public PontosGanhos getPontosGanhos() {
        return pontosGanhos;
    }

    public void setPontosGanhos(PontosGanhos pontosGanhos) {
        this.pontosGanhos = pontosGanhos;
    }

    public ClassificacaoDTO withPontosGanhos(PontosGanhos pontosGanhos) {
        this.pontosGanhos = pontosGanhos;
        return this;
    }

    public Jogos getJogos() {
        return jogos;
    }

    public void setJogos(Jogos jogos) {
        this.jogos = jogos;
    }

    public Vitoria getVitoria() {
        return vitoria;
    }

    public void setVitoria(Vitoria vitoria) {
        this.vitoria = vitoria;
    }

    public ClassificacaoDTO withVitoria(Vitoria vitoria) {
        this.vitoria = vitoria;
        return this;
    }

    public Empate getEmpate() {
        return empate;
    }

    public void setEmpate(Empate empate) {
        this.empate = empate;
    }

    public ClassificacaoDTO withEmpate(Empate empate) {
        this.empate = empate;
        return this;
    }

    public Derrota getDerrota() {
        return derrota;
    }

    public void setDerrota(Derrota derrota) {
        this.derrota = derrota;
    }

    public ClassificacaoDTO withDerrota(Derrota derrota) {
        this.derrota = derrota;
        return this;
    }

    public double getAproveitamento() {
        return aproveitamento;
    }

    public void setAproveitamento(double aproveitamento) {
        this.aproveitamento = aproveitamento;
    }

    public ClassificacaoDTO withAproveitamento(double aproveitamento) {
        this.aproveitamento = aproveitamento;
        return this;
    }

}
