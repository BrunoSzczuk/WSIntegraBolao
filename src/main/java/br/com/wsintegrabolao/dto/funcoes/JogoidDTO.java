package br.com.wsintegrabolao.dto.funcoes;

import br.com.wsintegrabolao.dao.obj.JogoidDAO;
import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Date;

public class JogoidDTO implements Serializable {

    @SerializedName("cdJogo")
    @Expose
    private int cdJogo;
    @SerializedName("cdEquipe2")
    @Expose
    private String cdEquipe2;
    @SerializedName("cdEquipe1")
    @Expose
    private String cdEquipe1;
    @SerializedName("stClassificougolsfora")
    @Expose
    private boolean stClassificougolsfora;
    @SerializedName("dtJogo")
    @Expose
    private Date dtJogo;
    @SerializedName("dspTime1")
    @Expose
    private String dspTime1;
    @SerializedName("dspTime2")
    @Expose
    private String dspTime2;
    @SerializedName("stEliminoujogovolta")
    @Expose
    private boolean stEliminoujogovolta;
    @SerializedName("dsEstadio")
    @Expose
    private String dsEstadio;
    @SerializedName("hrJogo")
    @Expose
    private String hrJogo;
    @SerializedName("dsLocal")
    @Expose
    private String dsLocal;
    @SerializedName("nrJogo")
    @Expose
    private String nrJogo;
    @SerializedName("psJogo")
    @Expose
    private String psJogo;
    @SerializedName("nrRodada")
    @Expose
    private String nrRodada;
    @SerializedName("urlPosjogo")
    @Expose
    private String urlPosjogo;
    @SerializedName("urlPrejogo")
    @Expose
    private String urlPrejogo;
    @SerializedName("urlVideo")
    @Expose
    private String urlVideo;
    private final static long serialVersionUID = 5622089951278833143L;

    /**
     * No args constructor for use in serialization
     *     
*/
    public JogoidDTO() {
    }

    /**
     *
     * @param dsEstadio
     * @param cdEquipe1
     * @param cdEquipe2
     * @param psJogo
     * @param stEliminoujogovolta
     * @param dspTime1
     * @param dsLocal
     * @param hrJogo
     * @param stClassificougolsfora
     * @param urlVideo
     * @param dspTime2
     * @param nrJogo
     * @param urlPosjogo
     * @param nrRodada
     * @param cdJogo
     * @param dtJogo
     * @param urlPrejogo
     */
    public JogoidDTO(int cdJogo, String cdEquipe2, String cdEquipe1, boolean stClassificougolsfora, Date dtJogo, String dspTime1, String dspTime2, boolean stEliminoujogovolta, String dsEstadio, String hrJogo, String dsLocal, String nrJogo, String psJogo, String nrRodada, String urlPosjogo, String urlPrejogo, String urlVideo) {
        super();
        this.cdJogo = cdJogo;
        this.cdEquipe2 = cdEquipe2;
        this.cdEquipe1 = cdEquipe1;
        this.stClassificougolsfora = stClassificougolsfora;
        this.dtJogo = dtJogo;
        this.dspTime1 = dspTime1;
        this.dspTime2 = dspTime2;
        this.stEliminoujogovolta = stEliminoujogovolta;
        this.dsEstadio = dsEstadio;
        this.hrJogo = hrJogo;
        this.dsLocal = dsLocal;
        this.nrJogo = nrJogo;
        this.psJogo = psJogo;
        this.nrRodada = nrRodada;
        this.urlPosjogo = urlPosjogo;
        this.urlPrejogo = urlPrejogo;
        this.urlVideo = urlVideo;
    }

    public JogoidDTO(JogoidDAO j) {
        super();
        this.cdJogo = j.getCdJogo();
        this.cdEquipe2 = j.getEquipeByCdEquipe2().getCdEquipe();
        this.cdEquipe1 = j.getEquipeByCdEquipe1().getCdEquipe();
        this.stClassificougolsfora = j.getStClassificougolsfora();
        this.dtJogo = j.getDtJogo();
        this.dspTime1 = j.getDspTime1();
        this.dspTime2 = j.getDspTime2();
        this.stEliminoujogovolta = j.getStEliminoujogovolta();
        this.dsEstadio = j.getDsEstadio();
        this.hrJogo = j.getHrJogo();
        this.dsLocal = j.getDsLocal();
        this.nrJogo = j.getNrJogo();
        this.psJogo = j.getPsJogo();
        this.nrRodada = j.getNrRodada();
        this.urlPosjogo = j.getUrlPosjogo();
        this.urlPrejogo = j.getUrlPrejogo();
        this.urlVideo = j.getUrlVideo();
    }

    public int getCdJogo() {
        return cdJogo;
    }

    public void setCdJogo(int cdJogo) {
        this.cdJogo = cdJogo;
    }

    public JogoidDTO withCdJogo(int cdJogo) {
        this.cdJogo = cdJogo;
        return this;
    }

    public boolean isStClassificougolsfora() {
        return stClassificougolsfora;
    }

    public void setStClassificougolsfora(boolean stClassificougolsfora) {
        this.stClassificougolsfora = stClassificougolsfora;
    }

    public JogoidDTO withStClassificougolsfora(boolean stClassificougolsfora) {
        this.stClassificougolsfora = stClassificougolsfora;
        return this;
    }

    public Date getDtJogo() {
        return dtJogo;
    }

    public void setDtJogo(Date dtJogo) {
        this.dtJogo = dtJogo;
    }

    public String getDspTime1() {
        return dspTime1;
    }

    public void setDspTime1(String dspTime1) {
        this.dspTime1 = dspTime1;
    }

    public JogoidDTO withDspTime1(String dspTime1) {
        this.dspTime1 = dspTime1;
        return this;
    }

    public String getCdEquipe2() {
        return cdEquipe2;
    }

    public void setCdEquipe2(String cdEquipe2) {
        this.cdEquipe2 = cdEquipe2;
    }

    public String getCdEquipe1() {
        return cdEquipe1;
    }

    public void setCdEquipe1(String cdEquipe1) {
        this.cdEquipe1 = cdEquipe1;
    }

    public String getDspTime2() {
        return dspTime2;
    }

    public void setDspTime2(String dspTime2) {
        this.dspTime2 = dspTime2;
    }

    public JogoidDTO withDspTime2(String dspTime2) {
        this.dspTime2 = dspTime2;
        return this;
    }

    public boolean isStEliminoujogovolta() {
        return stEliminoujogovolta;
    }

    public void setStEliminoujogovolta(boolean stEliminoujogovolta) {
        this.stEliminoujogovolta = stEliminoujogovolta;
    }

    public JogoidDTO withStEliminoujogovolta(boolean stEliminoujogovolta) {
        this.stEliminoujogovolta = stEliminoujogovolta;
        return this;
    }

    public String getDsEstadio() {
        return dsEstadio;
    }

    public void setDsEstadio(String dsEstadio) {
        this.dsEstadio = dsEstadio;
    }

    public JogoidDTO withDsEstadio(String dsEstadio) {
        this.dsEstadio = dsEstadio;
        return this;
    }

    public String getHrJogo() {
        return hrJogo;
    }

    public void setHrJogo(String hrJogo) {
        this.hrJogo = hrJogo;
    }

    public JogoidDTO withHrJogo(String hrJogo) {
        this.hrJogo = hrJogo;
        return this;
    }

    public String getDsLocal() {
        return dsLocal;
    }

    public void setDsLocal(String dsLocal) {
        this.dsLocal = dsLocal;
    }

    public JogoidDTO withDsLocal(String dsLocal) {
        this.dsLocal = dsLocal;
        return this;
    }

    public String getNrJogo() {
        return nrJogo;
    }

    public void setNrJogo(String nrJogo) {
        this.nrJogo = nrJogo;
    }

    public JogoidDTO withNrJogo(String nrJogo) {
        this.nrJogo = nrJogo;
        return this;
    }

    public String getPsJogo() {
        return psJogo;
    }

    public void setPsJogo(String psJogo) {
        this.psJogo = psJogo;
    }

    public JogoidDTO withPsJogo(String psJogo) {
        this.psJogo = psJogo;
        return this;
    }

    public String getNrRodada() {
        return nrRodada;
    }

    public void setNrRodada(String nrRodada) {
        this.nrRodada = nrRodada;
    }

    public JogoidDTO withNrRodada(String nrRodada) {
        this.nrRodada = nrRodada;
        return this;
    }

    public String getUrlPosjogo() {
        return urlPosjogo;
    }

    public void setUrlPosjogo(String urlPosjogo) {
        this.urlPosjogo = urlPosjogo;
    }

    public JogoidDTO withUrlPosjogo(String urlPosjogo) {
        this.urlPosjogo = urlPosjogo;
        return this;
    }

    public String getUrlPrejogo() {
        return urlPrejogo;
    }

    public void setUrlPrejogo(String urlPrejogo) {
        this.urlPrejogo = urlPrejogo;
    }

    public JogoidDTO withUrlPrejogo(String urlPrejogo) {
        this.urlPrejogo = urlPrejogo;
        return this;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public JogoidDTO withUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
        return this;
    }

}
