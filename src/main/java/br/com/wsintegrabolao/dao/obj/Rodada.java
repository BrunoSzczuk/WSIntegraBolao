package br.com.wsintegrabolao.dao.obj;
// Generated 25/03/2018 00:53:08 by Hibernate Tools 3.6.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Rodada generated by hbm2java
 */
@Entity
@Table(name = "rodada", schema = "public"
)
public class Rodada implements java.io.Serializable {

    private int cdRodada;

    public Rodada() {
    }

    public Rodada(int cdRodada) {
        this.cdRodada = cdRodada;
    }

    public Rodada(int cdRodada, Set jogoids, Set estatisticausuarios) {
        this.cdRodada = cdRodada;
    }

    @Id

    @Column(name = "cd_rodada", nullable = false)
    public int getCdRodada() {
        return this.cdRodada;
    }

    public void setCdRodada(int cdRodada) {
        this.cdRodada = cdRodada;
    }

}
