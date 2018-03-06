package br.com.wsintegrabolao.dao.obj;
// Generated 23/02/2018 15:56:58 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RodadajogosId generated by hbm2java
 */
@Embeddable
public class RodadajogosId  implements java.io.Serializable {


     private int cdRodada;
     private int cdJogo;

    public RodadajogosId() {
    }

    public RodadajogosId(int cdRodada, int cdJogo) {
       this.cdRodada = cdRodada;
       this.cdJogo = cdJogo;
    }
   


    @Column(name="cd_rodada", nullable=false)
    public int getCdRodada() {
        return this.cdRodada;
    }
    
    public void setCdRodada(int cdRodada) {
        this.cdRodada = cdRodada;
    }


    @Column(name="cd_jogo", nullable=false)
    public int getCdJogo() {
        return this.cdJogo;
    }
    
    public void setCdJogo(int cdJogo) {
        this.cdJogo = cdJogo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RodadajogosId) ) return false;
		 RodadajogosId castOther = ( RodadajogosId ) other; 
         
		 return (this.getCdRodada()==castOther.getCdRodada())
 && (this.getCdJogo()==castOther.getCdJogo());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCdRodada();
         result = 37 * result + this.getCdJogo();
         return result;
   }   


}

