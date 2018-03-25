package br.com.wsintegrabolao.dto.funcoes.classificacao;
// Generated 25/03/2018 00:53:08 by Hibernate Tools 3.6.0

import br.com.wsintegrabolao.dao.obj.Classificacaovitoria;
import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Vitoria implements Serializable {

    @SerializedName("qtMandante")
    @Expose
    private int qtMandante;
    @SerializedName("qtTotal")
    @Expose
    private int qtTotal;
    @SerializedName("qtVisitante")
    @Expose
    private int qtVisitante;
    private final static long serialVersionUID = 8925714000083178713L;

    /**
     * No args constructor for use in serialization
     *     
*/
    public Vitoria() {
    }

    /**
     *
     * @param qtMandante
     * @param qtTotal
     * @param qtVisitante
     */
    public Vitoria(int qtMandante, int qtTotal, int qtVisitante) {
        super();
        this.qtMandante = qtMandante;
        this.qtTotal = qtTotal;
        this.qtVisitante = qtVisitante;
    }

    public Vitoria(Classificacaovitoria c) {
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

    public Vitoria withQtMandante(int qtMandante) {
        this.qtMandante = qtMandante;
        return this;
    }

    public int getQtTotal() {
        return qtTotal;
    }

    public void setQtTotal(int qtTotal) {
        this.qtTotal = qtTotal;
    }

    public Vitoria withQtTotal(int qtTotal) {
        this.qtTotal = qtTotal;
        return this;
    }

    public int getQtVisitante() {
        return qtVisitante;
    }

    public void setQtVisitante(int qtVisitante) {
        this.qtVisitante = qtVisitante;
    }

    public Vitoria withQtVisitante(int qtVisitante) {
        this.qtVisitante = qtVisitante;
        return this;
    }

}
