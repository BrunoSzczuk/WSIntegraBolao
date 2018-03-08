package br.com.wsintegrabolao.dao.obj;
// Generated 08/03/2018 16:57:58 by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Rodadajogos generated by hbm2java
 */
@Entity
@Table(name="rodadajogos"
    ,schema="public"
)
public class Rodadajogos  implements java.io.Serializable {


     private RodadajogosId id;
     private Jogoid jogoid;

    public Rodadajogos() {
    }

    public Rodadajogos(RodadajogosId id, Jogoid jogoid) {
       this.id = id;
       this.jogoid = jogoid;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="cdRodada", column=@Column(name="cd_rodada", nullable=false) ), 
        @AttributeOverride(name="cdJogo", column=@Column(name="cd_jogo", nullable=false) ) } )
    public RodadajogosId getId() {
        return this.id;
    }
    
    public void setId(RodadajogosId id) {
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




}


