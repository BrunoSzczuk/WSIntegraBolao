package br.com.wsintegrabolao.dto.funcoes;

import br.com.wsintegrabolao.dao.obj.EquipeDAO;
import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EquipeDTO implements Serializable {

    @SerializedName("cdEquipe")
    @Expose
    private String cdEquipe;
    @SerializedName("brEquipe")
    @Expose
    private String brEquipe;
    @SerializedName("corEquipe")
    @Expose
    private String corEquipe;
    @SerializedName("nmEquipe")
    @Expose
    private String nmEquipe;
    @SerializedName("nmComum")
    @Expose
    private String nmComum;
    @SerializedName("nmSlug")
    @Expose
    private String nmSlug;
    @SerializedName("sgEquipe")
    @Expose
    private String sgEquipe;
    @SerializedName("tgEquipe")
    @Expose
    private String tgEquipe;
    @SerializedName("tpEquipe")
    @Expose
    private String tpEquipe;
    @SerializedName("uriEquipe")
    @Expose
    private String uriEquipe;
    private final static long serialVersionUID = -7173600404490557872L;

    /**
     * No args constructor for use in serialization
     *     
*/
    public EquipeDTO() {
    }

    /**
     *
     * @param nmSlug
     * @param uriEquipe
     * @param cdEquipe
     * @param nmEquipe
     * @param brEquipe
     * @param tgEquipe
     * @param corEquipe
     * @param nmComum
     * @param sgEquipe
     * @param tpEquipe
     */
    public EquipeDTO(String cdEquipe, String brEquipe, String corEquipe, String nmEquipe, String nmComum, String nmSlug, String sgEquipe, String tgEquipe, String tpEquipe, String uriEquipe) {
        super();
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

    public EquipeDTO(EquipeDAO e) {
        super();
        this.cdEquipe = e.getCdEquipe();
        this.brEquipe = e.getBrEquipe();
        this.corEquipe = e.getCorEquipe();
        this.nmEquipe = e.getNmEquipe();
        this.nmComum = e.getNmComum();
        this.nmSlug = e.getNmSlug();
        this.sgEquipe = e.getSgEquipe();
        this.tgEquipe = e.getTgEquipe();
        this.tpEquipe = e.getTpEquipe();
        this.uriEquipe = e.getUriEquipe();
    }

    public String getCdEquipe() {
        return cdEquipe;
    }

    public void setCdEquipe(String cdEquipe) {
        this.cdEquipe = cdEquipe;
    }

    public EquipeDTO withCdEquipe(String cdEquipe) {
        this.cdEquipe = cdEquipe;
        return this;
    }

    public String getBrEquipe() {
        return brEquipe;
    }

    public void setBrEquipe(String brEquipe) {
        this.brEquipe = brEquipe;
    }

    public EquipeDTO withBrEquipe(String brEquipe) {
        this.brEquipe = brEquipe;
        return this;
    }

    public String getCorEquipe() {
        return corEquipe;
    }

    public void setCorEquipe(String corEquipe) {
        this.corEquipe = corEquipe;
    }

    public EquipeDTO withCorEquipe(String corEquipe) {
        this.corEquipe = corEquipe;
        return this;
    }

    public String getNmEquipe() {
        return nmEquipe;
    }

    public void setNmEquipe(String nmEquipe) {
        this.nmEquipe = nmEquipe;
    }

    public EquipeDTO withNmEquipe(String nmEquipe) {
        this.nmEquipe = nmEquipe;
        return this;
    }

    public String getNmComum() {
        return nmComum;
    }

    public void setNmComum(String nmComum) {
        this.nmComum = nmComum;
    }

    public EquipeDTO withNmComum(String nmComum) {
        this.nmComum = nmComum;
        return this;
    }

    public String getNmSlug() {
        return nmSlug;
    }

    public void setNmSlug(String nmSlug) {
        this.nmSlug = nmSlug;
    }

    public EquipeDTO withNmSlug(String nmSlug) {
        this.nmSlug = nmSlug;
        return this;
    }

    public String getSgEquipe() {
        return sgEquipe;
    }

    public void setSgEquipe(String sgEquipe) {
        this.sgEquipe = sgEquipe;
    }

    public EquipeDTO withSgEquipe(String sgEquipe) {
        this.sgEquipe = sgEquipe;
        return this;
    }

    public String getTgEquipe() {
        return tgEquipe;
    }

    public void setTgEquipe(String tgEquipe) {
        this.tgEquipe = tgEquipe;
    }

    public EquipeDTO withTgEquipe(String tgEquipe) {
        this.tgEquipe = tgEquipe;
        return this;
    }

    public String getTpEquipe() {
        return tpEquipe;
    }

    public void setTpEquipe(String tpEquipe) {
        this.tpEquipe = tpEquipe;
    }

    public EquipeDTO withTpEquipe(String tpEquipe) {
        this.tpEquipe = tpEquipe;
        return this;
    }

    public String getUriEquipe() {
        return uriEquipe;
    }

    public void setUriEquipe(String uriEquipe) {
        this.uriEquipe = uriEquipe;
    }

    public EquipeDTO withUriEquipe(String uriEquipe) {
        this.uriEquipe = uriEquipe;
        return this;
    }

}
