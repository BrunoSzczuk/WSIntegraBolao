package br.com.wsintegrabolao.dao.obj;
// Generated 25/03/2018 00:53:08 by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Palpite generated by hbm2java
 */
@Entity
@Table(name="palpite"
    ,schema="public"
)
public class Palpite  implements java.io.Serializable {


     private PalpiteId id;
     private Jogoid jogoid;
     private Usuario usuario;
     private Bolao bolao;
     private int nrGols1;
     private Date dtAposta;
     private Date dtUltimaatt;
     private int nrGols2;
     private String stPalpite;
     private Resultadopalpite resultadopalpite;

    public Palpite() {
    }

	
    public Palpite(PalpiteId id, Jogoid jogoid, Usuario usuario, Bolao bolao, int nrGols1, Date dtAposta, int nrGols2) {
        this.id = id;
        this.jogoid = jogoid;
        this.usuario = usuario;
        this.bolao = bolao;
        this.nrGols1 = nrGols1;
        this.dtAposta = dtAposta;
        this.nrGols2 = nrGols2;
    }
    public Palpite(PalpiteId id, Jogoid jogoid, Usuario usuario, Bolao bolao, int nrGols1, Date dtAposta, Date dtUltimaatt, int nrGols2, String stPalpite, Resultadopalpite resultadopalpite) {
       this.id = id;
       this.jogoid = jogoid;
       this.usuario = usuario;
       this.bolao = bolao;
       this.nrGols1 = nrGols1;
       this.dtAposta = dtAposta;
       this.dtUltimaatt = dtUltimaatt;
       this.nrGols2 = nrGols2;
       this.stPalpite = stPalpite;
       this.resultadopalpite = resultadopalpite;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="cdJogo", column=@Column(name="cd_jogo", nullable=false) ), 
        @AttributeOverride(name="cdUsuario", column=@Column(name="cd_usuario", nullable=false, length=20) ), 
        @AttributeOverride(name="cdBolao", column=@Column(name="cd_bolao", nullable=false) ) } )
    public PalpiteId getId() {
        return this.id;
    }
    
    public void setId(PalpiteId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cd_jogo", nullable=false, insertable=false, updatable=false)
    public Jogoid getJogoid() {
        return this.jogoid;
    }
    
    public void setJogoid(Jogoid jogoid) {
        this.jogoid = jogoid;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cd_usuario", nullable=false, insertable=false, updatable=false)
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cd_bolao", nullable=false, insertable=false, updatable=false)
    public Bolao getBolao() {
        return this.bolao;
    }
    
    public void setBolao(Bolao bolao) {
        this.bolao = bolao;
    }

    
    @Column(name="nr_gols1", nullable=false)
    public int getNrGols1() {
        return this.nrGols1;
    }
    
    public void setNrGols1(int nrGols1) {
        this.nrGols1 = nrGols1;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_aposta", nullable=false, length=29)
    public Date getDtAposta() {
        return this.dtAposta;
    }
    
    public void setDtAposta(Date dtAposta) {
        this.dtAposta = dtAposta;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_ultimaatt", length=29)
    public Date getDtUltimaatt() {
        return this.dtUltimaatt;
    }
    
    public void setDtUltimaatt(Date dtUltimaatt) {
        this.dtUltimaatt = dtUltimaatt;
    }

    
    @Column(name="nr_gols2", nullable=false)
    public int getNrGols2() {
        return this.nrGols2;
    }
    
    public void setNrGols2(int nrGols2) {
        this.nrGols2 = nrGols2;
    }

    
    @Column(name="st_palpite")
    public String getStPalpite() {
        return this.stPalpite;
    }
    
    public void setStPalpite(String stPalpite) {
        this.stPalpite = stPalpite;
    }

@OneToOne(fetch=FetchType.LAZY, mappedBy="palpite")
    public Resultadopalpite getResultadopalpite() {
        return this.resultadopalpite;
    }
    
    public void setResultadopalpite(Resultadopalpite resultadopalpite) {
        this.resultadopalpite = resultadopalpite;
    }




}


