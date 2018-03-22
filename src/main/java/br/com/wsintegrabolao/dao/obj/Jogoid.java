package br.com.wsintegrabolao.dao.obj;
// Generated 08/03/2018 16:57:58 by Hibernate Tools 4.3.1

import com.google.gson.annotations.Expose;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Jogoid generated by hbm2java
 */
@Entity
@Table(name = "jogoid", schema = "public"
)
public class Jogoid implements java.io.Serializable {

    @Expose
    private int cdJogo;
    
    @Expose
    private Equipe cdEquipe2;
    
    @Expose
    private Equipe cdEquipe1;
    
    @Expose
    private Boolean stClassificougolsfora;
    
    @Expose
    private Date dtJogo;
    
    @Expose
    private String dspTime1;
    
    @Expose
    private String dspTime2;
    
    @Expose
    private Boolean stEliminoujogovolta;
    
    @Expose
    private String dsEstadio;
    
    @Expose
    private String hrJogo;
    
    @Expose
    private String dsLocal;
    
    @Expose
    private String nrJogo;
    
    @Expose
    private String plPenalti1;
    
    @Expose
    private String plPenalti2;
    
    @Expose
    private String plTime1;
    
    @Expose
    private String plTime2;
    
    @Expose
    private String psJogo;
    
    @Expose
    private String nrRodada;
    
    @Expose
    private String urlPosjogo;
    
    @Expose
    private String urlPrejogo;
    
    @Expose
    private String urlVideo;

    public Jogoid() {
    }

    public Jogoid(int cdJogo, Equipe cdEquipe2, Equipe cdEquipe1) {
        this.cdJogo = cdJogo;
        this.cdEquipe2 = cdEquipe2;
        this.cdEquipe1 = cdEquipe1;
    }

    public Jogoid(int cdJogo, Equipe cdEquipe2, Equipe cdEquipe1, Boolean stClassificougolsfora, Date dtJogo, String dspTime1, String dspTime2, Boolean stEliminoujogovolta, String dsEstadio, String hrJogo, String dsLocal, String nrJogo, String plPenalti1, String plPenalti2, String plTime1, String plTime2, String psJogo, String nrRodada, String urlPosjogo, String urlPrejogo, String urlVideo) {
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
        this.plPenalti1 = plPenalti1;
        this.plPenalti2 = plPenalti2;
        this.plTime1 = plTime1;
        this.plTime2 = plTime2;
        this.psJogo = psJogo;
        this.nrRodada = nrRodada;
        this.urlPosjogo = urlPosjogo;
        this.urlPrejogo = urlPrejogo;
        this.urlVideo = urlVideo;
    }

    @Id

    @Column(name = "cd_jogo", nullable = false)
    public int getCdJogo() {
        return this.cdJogo;
    }

    public void setCdJogo(int cdJogo) {
        this.cdJogo = cdJogo;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cd_equipe2", nullable = false)
    public Equipe getEquipeByCdEquipe2() {
        return this.cdEquipe2;
    }

    public void setEquipeByCdEquipe2(Equipe cdEquipe2) {
        this.cdEquipe2 = cdEquipe2;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cd_equipe1", nullable = false)
    public Equipe getEquipeByCdEquipe1() {
        return this.cdEquipe1;
    }

    public void setEquipeByCdEquipe1(Equipe cdEquipe1) {
        this.cdEquipe1 = cdEquipe1;
    }

    @Column(name = "st_classificougolsfora")
    public Boolean getStClassificougolsfora() {
        return this.stClassificougolsfora;
    }

    public void setStClassificougolsfora(Boolean stClassificougolsfora) {
        this.stClassificougolsfora = stClassificougolsfora;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "dt_jogo", length = 13)
    public Date getDtJogo() {
        return this.dtJogo;
    }

    public void setDtJogo(Date dtJogo) {
        this.dtJogo = dtJogo;
    }

    @Column(name = "dsp_time1", length = 2)
    public String getDspTime1() {
        return this.dspTime1;
    }

    public void setDspTime1(String dspTime1) {
        this.dspTime1 = dspTime1;
    }

    @Column(name = "dsp_time2", length = 2)
    public String getDspTime2() {
        return this.dspTime2;
    }

    public void setDspTime2(String dspTime2) {
        this.dspTime2 = dspTime2;
    }

    @Column(name = "st_eliminoujogovolta")
    public Boolean getStEliminoujogovolta() {
        return this.stEliminoujogovolta;
    }

    public void setStEliminoujogovolta(Boolean stEliminoujogovolta) {
        this.stEliminoujogovolta = stEliminoujogovolta;
    }

    @Column(name = "ds_estadio", length = 100)
    public String getDsEstadio() {
        return this.dsEstadio;
    }

    public void setDsEstadio(String dsEstadio) {
        this.dsEstadio = dsEstadio;
    }

    @Column(name = "hr_jogo", length = 15)
    public String getHrJogo() {
        return this.hrJogo;
    }

    public void setHrJogo(String hrJogo) {
        this.hrJogo = hrJogo;
    }

    @Column(name = "ds_local", length = 100)
    public String getDsLocal() {
        return this.dsLocal;
    }

    public void setDsLocal(String dsLocal) {
        this.dsLocal = dsLocal;
    }

    @Column(name = "nr_jogo", length = 5)
    public String getNrJogo() {
        return this.nrJogo;
    }

    public void setNrJogo(String nrJogo) {
        this.nrJogo = nrJogo;
    }

    @Column(name = "pl_penalti1", length = 5)
    public String getPlPenalti1() {
        return this.plPenalti1;
    }

    public void setPlPenalti1(String plPenalti1) {
        this.plPenalti1 = plPenalti1;
    }

    @Column(name = "pl_penalti2", length = 5)
    public String getPlPenalti2() {
        return this.plPenalti2;
    }

    public void setPlPenalti2(String plPenalti2) {
        this.plPenalti2 = plPenalti2;
    }

    @Column(name = "pl_time1", length = 5)
    public String getPlTime1() {
        return this.plTime1;
    }

    public void setPlTime1(String plTime1) {
        this.plTime1 = plTime1;
    }

    @Column(name = "pl_time2", length = 5)
    public String getPlTime2() {
        return this.plTime2;
    }

    public void setPlTime2(String plTime2) {
        this.plTime2 = plTime2;
    }

    @Column(name = "ps_jogo", length = 5)
    public String getPsJogo() {
        return this.psJogo;
    }

    public void setPsJogo(String psJogo) {
        this.psJogo = psJogo;
    }

    @Column(name = "nr_rodada", length = 10)
    public String getNrRodada() {
        return this.nrRodada;
    }

    public void setNrRodada(String nrRodada) {
        this.nrRodada = nrRodada;
    }

    @Column(name = "url_posjogo")
    public String getUrlPosjogo() {
        return this.urlPosjogo;
    }

    public void setUrlPosjogo(String urlPosjogo) {
        this.urlPosjogo = urlPosjogo;
    }

    @Column(name = "url_prejogo")
    public String getUrlPrejogo() {
        return this.urlPrejogo;
    }

    public void setUrlPrejogo(String urlPrejogo) {
        this.urlPrejogo = urlPrejogo;
    }

    @Column(name = "url_video")
    public String getUrlVideo() {
        return this.urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

}
