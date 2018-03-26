package br.com.wsintegrabolao.dto.bolao;

import br.com.wsintegrabolao.dao.obj.TipousuarioDAO;
import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TipousuarioDTO implements Serializable {

    @SerializedName("cdTipo")
    @Expose
    private int cdTipo;
    @SerializedName("dsTipo")
    @Expose
    private String dsTipo;
    private final static long serialVersionUID = -9183498749667668442L;

    /**
     * No args constructor for use in serialization
     *     
*/
    public TipousuarioDTO() {
    }

    /**
     *
     * @param cdTipo
     * @param dsTipo
     */
    public TipousuarioDTO(int cdTipo, String dsTipo) {
        super();
        this.cdTipo = cdTipo;
        this.dsTipo = dsTipo;
    }
    
    public TipousuarioDTO(TipousuarioDAO t){
        super();
        this.cdTipo = t.getCdTipo();
        this.dsTipo = t.getDsTipo();
    }

    public int getCdTipo() {
        return cdTipo;
    }

    public void setCdTipo(int cdTipo) {
        this.cdTipo = cdTipo;
    }

    public TipousuarioDTO withCdTipo(int cdTipo) {
        this.cdTipo = cdTipo;
        return this;
    }

    public String getDsTipo() {
        return dsTipo;
    }

    public void setDsTipo(String dsTipo) {
        this.dsTipo = dsTipo;
    }

    public TipousuarioDTO withDsTipo(String dsTipo) {
        this.dsTipo = dsTipo;
        return this;
    }

}
