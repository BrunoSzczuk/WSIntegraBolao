package br.com.wsintegrabolao.bolao.dto;

import br.com.wsintegrabolao.dao.obj.PalpiteDAO;
import java.io.Serializable;
import com.google.gson.annotations.Expose;

import com.google.gson.annotations.SerializedName;
import java.util.Date;

public class PalpiteDTO implements Serializable {

    @SerializedName("cdJogo")
    @Expose
    private int cdJogo;
    @SerializedName("cdUsuario")
    @Expose
    private String cdUsuario;
    @SerializedName("cdBolao")
    @Expose
    private Long cdBolao;
    @SerializedName("nrGols1")
    @Expose
    private long nrGols1;
    @SerializedName("dtAposta")
    @Expose
    private Date dtAposta;
    @SerializedName("dtUltimaAtt")
    @Expose
    private Date dtUltimaAtt;
    @SerializedName("nrGols2")
    @Expose
    private long nrGols2;
    @SerializedName("stPalpite")
    @Expose
    private String stPalpite;
    private final static long serialVersionUID = 9026994836276515658L;

    /**
     * No args constructor for use in serialization
     *
     */
    public PalpiteDTO() {
    }

    public PalpiteDTO(int cdJogo, String cdUsuario, Long cdBolao, long nrGols1, Date dtAposta, Date dtUltimaAtt, long nrGols2, String stPalpite) {
        this.cdJogo = cdJogo;
        this.cdUsuario = cdUsuario;
        this.cdBolao = cdBolao;
        this.nrGols1 = nrGols1;
        this.dtAposta = dtAposta;
        this.dtUltimaAtt = dtUltimaAtt;
        this.nrGols2 = nrGols2;
        this.stPalpite = stPalpite;
    }

    public PalpiteDTO(PalpiteDAO p) {
        this.cdJogo = p.getId().getCdJogo();
        this.cdUsuario = p.getId().getCdUsuario();
        this.cdBolao = p.getId().getCdBolao();
        this.nrGols1 = p.getNrGols1();
        this.nrGols2 = p.getNrGols2();
        this.dtAposta = p.getDtAposta();
        this.dtUltimaAtt = p.getDtUltimaatt();
        this.stPalpite = p.getStPalpite();
        
    }

    public int getCdJogo() {
        return cdJogo;
    }

    public void setCdJogo(int cdJogo) {
        this.cdJogo = cdJogo;
    }

    public String getCdUsuario() {
        return cdUsuario;
    }

    public void setCdUsuario(String cdUsuario) {
        this.cdUsuario = cdUsuario;
    }

    public Long getCdBolao() {
        return cdBolao;
    }

    public void setCdBolao(Long cdBolao) {
        this.cdBolao = cdBolao;
    }

    public long getNrGols1() {
        return nrGols1;
    }

    public void setNrGols1(long nrGols1) {
        this.nrGols1 = nrGols1;
    }

    public Date getDtAposta() {
        return dtAposta;
    }

    public void setDtAposta(Date dtAposta) {
        this.dtAposta = dtAposta;
    }

    public Date getDtUltimaAtt() {
        return dtUltimaAtt;
    }

    public void setDtUltimaAtt(Date dtUltimaAtt) {
        this.dtUltimaAtt = dtUltimaAtt;
    }

    public long getNrGols2() {
        return nrGols2;
    }

    public void setNrGols2(long nrGols2) {
        this.nrGols2 = nrGols2;
    }

    public String getStPalpite() {
        return stPalpite;
    }

    public void setStPalpite(String stPalpite) {
        this.stPalpite = stPalpite;
    }

}
