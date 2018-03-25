package br.com.wsintegrabolao.dao.obj;
// Generated 25/03/2018 00:53:08 by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Schedule generated by hbm2java
 */
@Entity
@Table(name="schedule"
    ,schema="public"
)
public class Schedule  implements java.io.Serializable {


     private String cdRelatorio;
     private String nmRelatorio;
     private String dsEmail;

    public Schedule() {
    }

	
    public Schedule(String cdRelatorio) {
        this.cdRelatorio = cdRelatorio;
    }
    public Schedule(String cdRelatorio, String nmRelatorio, String dsEmail) {
       this.cdRelatorio = cdRelatorio;
       this.nmRelatorio = nmRelatorio;
       this.dsEmail = dsEmail;
    }
   
     @Id 

    
    @Column(name="cd_relatorio", nullable=false, length=10)
    public String getCdRelatorio() {
        return this.cdRelatorio;
    }
    
    public void setCdRelatorio(String cdRelatorio) {
        this.cdRelatorio = cdRelatorio;
    }

    
    @Column(name="nm_relatorio", length=60)
    public String getNmRelatorio() {
        return this.nmRelatorio;
    }
    
    public void setNmRelatorio(String nmRelatorio) {
        this.nmRelatorio = nmRelatorio;
    }

    
    @Column(name="ds_email")
    public String getDsEmail() {
        return this.dsEmail;
    }
    
    public void setDsEmail(String dsEmail) {
        this.dsEmail = dsEmail;
    }




}


