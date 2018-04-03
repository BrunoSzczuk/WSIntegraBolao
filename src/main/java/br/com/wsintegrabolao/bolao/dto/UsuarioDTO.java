package br.com.wsintegrabolao.bolao.dto;

import br.com.wsintegrabolao.dao.obj.UsuarioDAO;
import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.Date;

public class UsuarioDTO implements Serializable {

    @SerializedName("cdUsuario")
    @Expose
    private String cdUsuario;
    @SerializedName("tipousuario")
    @Expose
    private TipousuarioDTO tipousuario;
    @SerializedName("stAtivo")
    @Expose
    private boolean stAtivo;
    @SerializedName("nmUsuario")
    @Expose
    private String nmUsuario;
    @SerializedName("snUsuario")
    @Expose
    private String snUsuario;
    @SerializedName("dsEmail")
    @Expose
    private String dsEmail;
    @SerializedName("nrPontuacao")
    @Expose
    private BigDecimal nrPontuacao;
    @SerializedName("dtNascimento")
    @Expose
    private Date dtNascimento;
    @SerializedName("dtCadastro")
    @Expose
    private Date dtCadastro;
    @Expose

    private final static long serialVersionUID = -4064195173492234320L;

    /**
     * No args constructor for use in serialization
     *     
*/
    public UsuarioDTO() {
    }

    /**
     *
     * @param nmUsuario
     * @param stAtivo
     * @param dtCadastro
     * @param dsEmail
     * @param nrPontuacao
     * @param tipousuario
     * @param dtNascimento
     * @param cdUsuario
     * @param snUsuario
     */
    public UsuarioDTO(String cdUsuario, TipousuarioDTO tipousuario, boolean stAtivo, String nmUsuario, String snUsuario, String dsEmail, BigDecimal nrPontuacao, Date dtNascimento, Date dtCadastro) {
        super();
        this.cdUsuario = cdUsuario;
        this.tipousuario = tipousuario;
        this.stAtivo = stAtivo;
        this.nmUsuario = nmUsuario;
        this.snUsuario = snUsuario;
        this.dsEmail = dsEmail;
        this.nrPontuacao = nrPontuacao;
        this.dtNascimento = dtNascimento;
        this.dtCadastro = dtCadastro;
    }

    public UsuarioDTO(UsuarioDAO u) {
        super();
        this.cdUsuario = u.getCdUsuario();
        this.tipousuario = new TipousuarioDTO(u.getTipousuario());
        this.stAtivo = u.isStAtivo();
        this.nmUsuario = u.getNmUsuario();
        this.snUsuario = u.getSnUsuario();
        this.dsEmail = u.getDsEmail();
        this.nrPontuacao = u.getNrPontuacao();
        this.dtNascimento = u.getDtNascimento();
        this.dtCadastro = u.getDtCadastro();
        
    }

    public String getCdUsuario() {
        return cdUsuario;
    }

    public void setCdUsuario(String cdUsuario) {
        this.cdUsuario = cdUsuario;
    }

    public UsuarioDTO withCdUsuario(String cdUsuario) {
        this.cdUsuario = cdUsuario;
        return this;
    }


    public boolean isStAtivo() {
        return stAtivo;
    }

    public void setStAtivo(boolean stAtivo) {
        this.stAtivo = stAtivo;
    }

    public UsuarioDTO withStAtivo(boolean stAtivo) {
        this.stAtivo = stAtivo;
        return this;
    }

    public String getNmUsuario() {
        return nmUsuario;
    }

    public void setNmUsuario(String nmUsuario) {
        this.nmUsuario = nmUsuario;
    }

    public UsuarioDTO withNmUsuario(String nmUsuario) {
        this.nmUsuario = nmUsuario;
        return this;
    }

    public String getSnUsuario() {
        return snUsuario;
    }

    public void setSnUsuario(String snUsuario) {
        this.snUsuario = snUsuario;
    }

    public UsuarioDTO withSnUsuario(String snUsuario) {
        this.snUsuario = snUsuario;
        return this;
    }

    public String getDsEmail() {
        return dsEmail;
    }

    public void setDsEmail(String dsEmail) {
        this.dsEmail = dsEmail;
    }

    public UsuarioDTO withDsEmail(String dsEmail) {
        this.dsEmail = dsEmail;
        return this;
    }

    public TipousuarioDTO getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(TipousuarioDTO tipousuario) {
        this.tipousuario = tipousuario;
    }

    public BigDecimal getNrPontuacao() {
        return nrPontuacao;
    }

    public void setNrPontuacao(BigDecimal nrPontuacao) {
        this.nrPontuacao = nrPontuacao;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

}
