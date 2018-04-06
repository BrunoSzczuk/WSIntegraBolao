/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.bolao.service;

import br.com.wsintegrabolao.bolao.dto.UsuarioDTO;
import br.com.wsintegrabolao.dao.ConexaoDAO;
import br.com.wsintegrabolao.dao.WSIntegraBolaoController;
import br.com.wsintegrabolao.dao.obj.TipousuarioDAO;
import br.com.wsintegrabolao.dao.obj.UsuarioDAO;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author bruno.szczuk
 */
public class UsuarioService {

    private UsuarioDAO usuarioDAO;
    private UsuarioDTO usuarioDTO;

    public UsuarioService(UsuarioDTO usuarioDTO) {
        this.usuarioDTO = usuarioDTO;
    }

    public UsuarioDAO getUsuarioDAO() {
        return usuarioDAO;
    }

    public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    public UsuarioDTO getUsuarioDTO() {
        return usuarioDTO;
    }

    public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
        this.usuarioDTO = usuarioDTO;
    }

    public void validar() throws Exception {
        try {
            if (usuarioDTO == null) {
                throw new Exception("Formato inválido do JSON de Usuario.");
            }
            if (usuarioDTO.getCdUsuario().trim().length() < 0) {
                throw new Exception("O código do usuário não pode ser nulo.");
            }
            if (usuarioDTO.getDsEmail().trim().length() < 0) {
                throw new Exception("O e-mail é um campo obrigatório.");
            }
            if (usuarioDTO.getDtNascimento().after(new Date())) {
                throw new Exception("Data de nascimento inválida");
            }
            if (usuarioDTO.getNmUsuario().trim().length() < 0) {
                throw new Exception("O nome do usuário deve ter um valor");
            }
            if (usuarioDTO.getTipousuario().getCdTipo() < 0) {
                throw new Exception("O tipo do usuário não pode ser nulo");
            }
        } catch (Exception e) {
            throw new Exception("Json em formato Inválido");
        }
        try {
            if ((usuarioDAO = WSIntegraBolaoController.buscaUsuario(usuarioDTO.getCdUsuario())) == null) {
                usuarioDAO = new UsuarioDAO();
                usuarioDAO.setCdUsuario(usuarioDTO.getCdUsuario());
                usuarioDAO.setDtCadastro(new Date());
                usuarioDAO.setNrPontuacao(new BigDecimal(0));
            }
            usuarioDAO.setDsEmail(usuarioDTO.getDsEmail());
            usuarioDAO.setDtNascimento(usuarioDTO.getDtNascimento());
            usuarioDAO.setNmUsuario(usuarioDTO.getNmUsuario());
            usuarioDAO.setDsEmail(usuarioDTO.getDsEmail());
            usuarioDAO.setStAtivo(usuarioDTO.isStAtivo());
            usuarioDAO.setTipousuario(new TipousuarioDAO(usuarioDTO.getTipousuario()));
            usuarioDAO.setSnUsuario(usuarioDTO.getSnUsuario());
            
            
            ConexaoDAO.getInstance().persist(usuarioDAO);
        } catch (Exception e) {
            throw new Exception("Erro ao transformar em classe DAO -> Usuario.");
        }

    }
}
