package br.com.wsintegrabolao.funcoes.dto.classificacao;
// Generated 25/03/2018 00:53:08 by Hibernate Tools 3.6.0

import br.com.wsintegrabolao.dao.obj.Classificacaopg;
import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PontosGanhos implements Serializable {

    @SerializedName("qtMandante")
    @Expose
    private int qtMandante;
    @SerializedName("qtTotal")
    @Expose
    private int qtTotal;
    @SerializedName("qtVisitante")
    @Expose
    private int qtVisitante;
    private final static long serialVersionUID = -2228831585870719673L;

    /**
     * No args constructor for use in serialization
     *     
*/
    public PontosGanhos() {
    }

    /**
     *
     * @param qtMandante
     * @param qtTotal
     * @param qtVisitante
     */
    public PontosGanhos(int qtMandante, int qtTotal, int qtVisitante) {
        super();
        this.qtMandante = qtMandante;
        this.qtTotal = qtTotal;
        this.qtVisitante = qtVisitante;
    }

    public PontosGanhos(Classificacaopg c) {
        super();
        this.qtMandante = c.getQtMandante();
        this.qtTotal = c.getQtTotal();
        this.qtVisitante = c.getQtVisitante();
    }

    public int getQtMandante() {
        return qtMandante;
    }

    public void setQtMandante(int qtMandante) {
        this.qtMandante = qtMandante;
    }

    public PontosGanhos withQtMandante(int qtMandante) {
        this.qtMandante = qtMandante;
        return this;
    }

    public int getQtTotal() {
        return qtTotal;
    }

    public void setQtTotal(int qtTotal) {
        this.qtTotal = qtTotal;
    }

    public PontosGanhos withQtTotal(int qtTotal) {
        this.qtTotal = qtTotal;
        return this;
    }

    public int getQtVisitante() {
        return qtVisitante;
    }

    public void setQtVisitante(int qtVisitante) {
        this.qtVisitante = qtVisitante;
    }

    public PontosGanhos withQtVisitante(int qtVisitante) {
        this.qtVisitante = qtVisitante;
        return this;
    }

}
