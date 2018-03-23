package br.com.wsintegrabolao.dao.obj;
// Generated 08/03/2018 16:57:58 by Hibernate Tools 4.3.1

import com.google.gson.annotations.Expose;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Classificacaoempate generated by hbm2java
 */
@Entity
@Table(name = "classificacaoempate",
         schema = "public"
)
public class Classificacaoempate implements java.io.Serializable {
    private String cdEquipe;

    private Equipe equipe;

    @Expose
    private Integer qtMandante;
    @Expose
    private Integer qtTotal;
    @Expose
    private Integer qtVisitante;

    public Classificacaoempate() {
    }

    public Classificacaoempate(Equipe equipe) {
        this.equipe = equipe;
    }

    public Classificacaoempate(Equipe equipe, Integer qtMandante, Integer qtTotal, Integer qtVisitante) {
        this.equipe = equipe;
        this.qtMandante = qtMandante;
        this.qtTotal = qtTotal;
        this.qtVisitante = qtVisitante;
    }

    @GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "equipe"))
    @Id
    @GeneratedValue(generator = "generator")

    @Column(name = "cd_equipe", nullable = false, length = 10)
    public String getCdEquipe() {
        return this.cdEquipe;
    }

    public void setCdEquipe(String cdEquipe) {
        this.cdEquipe = cdEquipe;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn
    public Equipe getEquipe() {
        return this.equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    @Column(name = "qt_mandante")
    public Integer getQtMandante() {
        return this.qtMandante;
    }

    public void setQtMandante(Integer qtMandante) {
        this.qtMandante = qtMandante;
    }

    @Column(name = "qt_total")
    public Integer getQtTotal() {
        return this.qtTotal;
    }

    public void setQtTotal(Integer qtTotal) {
        this.qtTotal = qtTotal;
    }

    @Column(name = "qt_visitante")
    public Integer getQtVisitante() {
        return this.qtVisitante;
    }

    public void setQtVisitante(Integer qtVisitante) {
        this.qtVisitante = qtVisitante;
    }

}
