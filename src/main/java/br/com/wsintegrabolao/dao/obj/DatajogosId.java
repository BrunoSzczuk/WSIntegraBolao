package br.com.wsintegrabolao.dao.obj;
// Generated 25/03/2018 00:53:08 by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DatajogosId generated by hbm2java
 */
@Embeddable
public class DatajogosId  implements java.io.Serializable {


     private Date data;
     private int cdJogo;

    public DatajogosId() {
    }

    public DatajogosId(Date data, int cdJogo) {
       this.data = data;
       this.cdJogo = cdJogo;
    }
   


    @Column(name="data", nullable=false, length=29)
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
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
		 if ( !(other instanceof DatajogosId) ) return false;
		 DatajogosId castOther = ( DatajogosId ) other; 
         
		 return ( (this.getData()==castOther.getData()) || ( this.getData()!=null && castOther.getData()!=null && this.getData().equals(castOther.getData()) ) )
 && (this.getCdJogo()==castOther.getCdJogo());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getData() == null ? 0 : this.getData().hashCode() );
         result = 37 * result + this.getCdJogo();
         return result;
   }   


}


