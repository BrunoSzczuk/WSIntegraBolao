package br.com.wsintegrabolao.dao.obj;
// Generated 25/03/2018 00:53:08 by Hibernate Tools 3.6.0

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * EquipeDAO generated by hbm2java
 */
@Entity
@Table(name = "equipe", schema = "public"
)
public class EquipeDAO implements java.io.Serializable {

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
    private Classificacao classificacao;
    private Classificacaopg classificacaopg;
    private Classificacaojogo classificacaojogo;
    private Classificacaoderrota classificacaoderrota;
    private Classificacaoempate classificacaoempate;
    private Classificacaovitoria classificacaovitoria;

    public EquipeDAO() {
    }

    public EquipeDAO(String cdEquipe) {
        this.cdEquipe = cdEquipe;
    }

    public EquipeDAO(String cdEquipe, String brEquipe, String corEquipe, String nmEquipe, String nmComum, String nmSlug, String sgEquipe, String tgEquipe, String tpEquipe, String uriEquipe, Classificacao classificacao, Classificacaopg classificacaopg, Classificacaojogo classificacaojogo, Set jogoidsForCdEquipe2, Classificacaoderrota classificacaoderrota, Set jogoidsForCdEquipe1, Classificacaoempate classificacaoempate, Classificacaovitoria classificacaovitoria) {
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
        this.classificacao = classificacao;
        this.classificacaopg = classificacaopg;
        this.classificacaojogo = classificacaojogo;
        this.classificacaoderrota = classificacaoderrota;
        this.classificacaoempate = classificacaoempate;
        this.classificacaovitoria = classificacaovitoria;
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

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "equipe")
    public Classificacao getClassificacao() {
        return this.classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "equipe")
    public Classificacaopg getClassificacaopg() {
        return this.classificacaopg;
    }

    public void setClassificacaopg(Classificacaopg classificacaopg) {
        this.classificacaopg = classificacaopg;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "equipe")
    public Classificacaojogo getClassificacaojogo() {
        return this.classificacaojogo;
    }

    public void setClassificacaojogo(Classificacaojogo classificacaojogo) {
        this.classificacaojogo = classificacaojogo;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "equipe")
    public Classificacaoderrota getClassificacaoderrota() {
        return this.classificacaoderrota;
    }

    public void setClassificacaoderrota(Classificacaoderrota classificacaoderrota) {
        this.classificacaoderrota = classificacaoderrota;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "equipe")
    public Classificacaoempate getClassificacaoempate() {
        return this.classificacaoempate;
    }

    public void setClassificacaoempate(Classificacaoempate classificacaoempate) {
        this.classificacaoempate = classificacaoempate;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "equipe")
    public Classificacaovitoria getClassificacaovitoria() {
        return this.classificacaovitoria;
    }

    public void setClassificacaovitoria(Classificacaovitoria classificacaovitoria) {
        this.classificacaovitoria = classificacaovitoria;
    }

}
