package br.com.wsintegrabolao.funcoes.dto.classificacao;

import br.com.wsintegrabolao.dao.obj.Classificacaoderrota;
import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Derrota implements Serializable {

    @SerializedName("qtMandante")
    @Expose
    private int qtMandante;
    @SerializedName("qtTotal")
    @Expose
    private int qtTotal;
    @SerializedName("qtVisitante")
    @Expose
    private int qtVisitante;
    private final static long serialVersionUID = -3839355860251056776L;

    /**
     * No args constructor for use in serialization
     *     
*/
    public Derrota() {
    }

    /**
     *
     * @param qtMandante
     * @param qtTotal
     * @param qtVisitante
     */
    public Derrota(int qtMandante, int qtTotal, int qtVisitante) {
        super();
        this.qtMandante = qtMandante;
        this.qtTotal = qtTotal;
        this.qtVisitante = qtVisitante;
    }

    public Derrota(Classificacaoderrota c) {
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

    public Derrota withQtMandante(int qtMandante) {
        this.qtMandante = qtMandante;
        return this;
    }

    public int getQtTotal() {
        return qtTotal;
    }

    public void setQtTotal(int qtTotal) {
        this.qtTotal = qtTotal;
    }

    public Derrota withQtTotal(int qtTotal) {
        this.qtTotal = qtTotal;
        return this;
    }

    public int getQtVisitante() {
        return qtVisitante;
    }

    public void setQtVisitante(int qtVisitante) {
        this.qtVisitante = qtVisitante;
    }

    public Derrota withQtVisitante(int qtVisitante) {
        this.qtVisitante = qtVisitante;
        return this;
    }

}
