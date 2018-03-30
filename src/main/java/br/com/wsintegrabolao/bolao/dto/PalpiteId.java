/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.bolao.dto;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PalpiteId implements Serializable {

    @SerializedName("cdJogo")
    @Expose
    private long cdJogo;
    @SerializedName("cdUsuario")
    @Expose
    private String cdUsuario;
    @SerializedName("cdBolao")
    @Expose
    private long cdBolao;
    private final static long serialVersionUID = -5959595583706797631L;

    /**
     * No args constructor for use in serialization
     *
     */
    public PalpiteId() {
    }

    /**
     *
     * @param cdBolao
     * @param cdJogo
     * @param cdUsuario
     */
    public PalpiteId(long cdJogo, String cdUsuario, long cdBolao) {
        super();
        this.cdJogo = cdJogo;
        this.cdUsuario = cdUsuario;
        this.cdBolao = cdBolao;
    }

    public long getCdJogo() {
        return cdJogo;
    }

    public void setCdJogo(long cdJogo) {
        this.cdJogo = cdJogo;
    }

    public String getCdUsuario() {
        return cdUsuario;
    }

    public void setCdUsuario(String cdUsuario) {
        this.cdUsuario = cdUsuario;
    }

    public long getCdBolao() {
        return cdBolao;
    }

    public void setCdBolao(long cdBolao) {
        this.cdBolao = cdBolao;
    }

}
