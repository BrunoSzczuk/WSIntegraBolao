package br.com.wsintegrabolao.dao.obj;
// Generated 08/03/2018 16:57:58 by Hibernate Tools 4.3.1

import com.google.gson.annotations.Expose;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Equipe generated by hbm2java
 */
@Entity
@Table(name = "equipe",
         schema = "public"
)

public class Equipe implements java.io.Serializable {

    @Expose
    private String cdEquipe;
   
    private String brEquipe;
    
    private String corEquipe;
   
    private String nmEquipe;
    
    private String nmComum;
    
    private String nmSlug;
    
    private String sgEquipe;
    
    private String tgEquipe;
    
    private String tpEquipe;
    
    private String uriEquipe;
    

    public Equipe() {
    }

    public Equipe(String cdEquipe) {
        this.cdEquipe = cdEquipe;
    }

    public Equipe(String cdEquipe, String brEquipe, String corEquipe, String nmEquipe, String nmComum, String nmSlug, String sgEquipe, String tgEquipe, String tpEquipe, String uriEquipe) {
        this.cdEquipe = cdEquipe;
        this.brEquipe = brEquipe;
        this.corEquipe = corEquipe;
        this.nmEquipe = nmEquipe;
        this.nmComum = nmComum;
        this.nmSlug = nmSlug;
        this.sgEquipe = sgEquipe;
        this.tgEquipe = tgEquipe;
        this.tpEquipe = tpEquipe;
        this.uriEquipe = uriEquipe;
    }

    @Id

    @Column(name = "cd_equipe", nullable = false, length = 10)
    public String getCdEquipe() {
        return this.cdEquipe;
    }

    public void setCdEquipe(String cdEquipe) {
        this.cdEquipe = cdEquipe;
    }

    @Column(name = "br_equipe", length = 100)
    public String getBrEquipe() {
        return this.brEquipe;
    }

    public void setBrEquipe(String brEquipe) {
        this.brEquipe = brEquipe;
    }

    @Column(name = "cor_equipe", length = 100)
    public String getCorEquipe() {
        return this.corEquipe;
    }

    public void setCorEquipe(String corEquipe) {
        this.corEquipe = corEquipe;
    }

    @Column(name = "nm_equipe", length = 100)
    public String getNmEquipe() {
        return this.nmEquipe;
    }

    public void setNmEquipe(String nmEquipe) {
        this.nmEquipe = nmEquipe;
    }

    @Column(name = "nm_comum", length = 100)
    public String getNmComum() {
        return this.nmComum;
    }

    public void setNmComum(String nmComum) {
        this.nmComum = nmComum;
    }

    @Column(name = "nm_slug", length = 100)
    public String getNmSlug() {
        return this.nmSlug;
    }

    public void setNmSlug(String nmSlug) {
        this.nmSlug = nmSlug;
    }

    @Column(name = "sg_equipe", length = 10)
    public String getSgEquipe() {
        return this.sgEquipe;
    }

    public void setSgEquipe(String sgEquipe) {
        this.sgEquipe = sgEquipe;
    }

    @Column(name = "tg_equipe", length = 100)
    public String getTgEquipe() {
        return this.tgEquipe;
    }

    public void setTgEquipe(String tgEquipe) {
        this.tgEquipe = tgEquipe;
    }

    @Column(name = "tp_equipe", length = 100)
    public String getTpEquipe() {
        return this.tpEquipe;
    }

    public void setTpEquipe(String tpEquipe) {
        this.tpEquipe = tpEquipe;
    }

    @Column(name = "uri_equipe", length = 100)
    public String getUriEquipe() {
        return this.uriEquipe;
    }

    public void setUriEquipe(String uriEquipe) {
        this.uriEquipe = uriEquipe;
    }

}
