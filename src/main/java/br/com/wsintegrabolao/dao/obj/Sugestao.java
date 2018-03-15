package br.com.wsintegrabolao.dao.obj;
// Generated 08/03/2018 16:57:58 by Hibernate Tools 4.3.1


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
 * Sugestao generated by hbm2java
 */
@Entity
@Table(name="sugestao"
    ,schema="public"
)
public class Sugestao  implements java.io.Serializable {


     private long nrSugestao;
     private Usuario usuario;
     private String dsSugestao;
     private Date dtSugestao;

    public Sugestao() {
    }

    public Sugestao(long nrSugestao, Usuario usuario, String dsSugestao, Date dtSugestao) {
       this.nrSugestao = nrSugestao;
       this.usuario = usuario;
       this.dsSugestao = dsSugestao;
       this.dtSugestao = dtSugestao;
    }
   
     @Id 

    
    @Column(name="nr_sugestao", nullable=false)
    public long getNrSugestao() {
        return this.nrSugestao;
    }
    
    public void setNrSugestao(long nrSugestao) {
        this.nrSugestao = nrSugestao;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cd_usuario", nullable=false)
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    @Column(name="ds_sugestao", nullable=false)
    public String getDsSugestao() {
        return this.dsSugestao;
    }
    
    public void setDsSugestao(String dsSugestao) {
        this.dsSugestao = dsSugestao;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_sugestao", nullable=false, length=29)
    public Date getDtSugestao() {
        return this.dtSugestao;
    }
    
    public void setDtSugestao(Date dtSugestao) {
        this.dtSugestao = dtSugestao;
    }




}

