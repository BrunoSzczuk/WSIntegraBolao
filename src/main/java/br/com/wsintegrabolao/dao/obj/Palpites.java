package br.com.wsintegrabolao.dao.obj;
// Generated 08/03/2018 16:57:58 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Palpites generated by hbm2java
 */
@Entity
@Table(name="palpites"
    ,schema="public"
)
public class Palpites  implements java.io.Serializable {


     private PalpitesId id;
     private Jogoid jogoid;
     private Usuario usuario;
     private int nrGols1;
     private Date dtAposta;
     private Date dtUltimaatt;
     private int nrGols2;
     private String stPalpite;

    public Palpites() {
    }

	
    public Palpites(PalpitesId id, Jogoid jogoid, Usuario usuario, int nrGols1, Date dtAposta, int nrGols2) {
        this.id = id;
        this.jogoid = jogoid;
        this.usuario = usuario;
        this.nrGols1 = nrGols1;
        this.dtAposta = dtAposta;
        this.nrGols2 = nrGols2;
    }
    public Palpites(PalpitesId id, Jogoid jogoid, Usuario usuario, int nrGols1, Date dtAposta, Date dtUltimaatt, int nrGols2, String stPalpite) {
       this.id = id;
       this.jogoid = jogoid;
       this.usuario = usuario;
       this.nrGols1 = nrGols1;
       this.dtAposta = dtAposta;
       this.dtUltimaatt = dtUltimaatt;
       this.nrGols2 = nrGols2;
       this.stPalpite = stPalpite;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="cdJogo", column=@Column(name="cd_jogo", nullable=false) ), 
        @AttributeOverride(name="cdUsuario", column=@Column(name="cd_usuario", nullable=false, length=10) ) } )
    public PalpitesId getId() {
        return this.id;
    }
    
    public void setId(PalpitesId id) {
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




}

