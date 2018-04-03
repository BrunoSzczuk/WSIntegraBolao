/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.bolao.service;

import br.com.wsintegrabolao.bolao.dto.PalpiteDTO;
import br.com.wsintegrabolao.dao.ConexaoDAO;
import br.com.wsintegrabolao.dao.WSIntegraBolaoController;
import br.com.wsintegrabolao.dao.obj.PalpiteDAO;
import br.com.wsintegrabolao.dao.obj.PalpiteId;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;

/**
 *
 * @author Bruno
 */
public class PalpiteService {

    private PalpiteDTO palpiteDTO;
    private PalpiteDAO palpiteDAO;
    private EntityManager em = ConexaoDAO.getInstance().getEm();

    public PalpiteService(PalpiteDTO palpiteDTO) {
        this.palpiteDTO = palpiteDTO;
    }

    public PalpiteDTO getPalpiteDTO() {
        return palpiteDTO;
    }

    public void setPalpiteDTO(PalpiteDTO palpiteDTO) {
        this.palpiteDTO = palpiteDTO;
    }

    public PalpiteDAO getPalpiteDAO() {
        return palpiteDAO;
    }

    public void setPalpiteDAO(PalpiteDAO palpiteDAO) {
        this.palpiteDAO = palpiteDAO;
    }

    public void validar() throws Exception {
        //Validações do DTO (Json)
        try {
            if (palpiteDTO == null) {
                throw new Exception("Formato inválido do json de Palpite");
            }
            if (palpiteDTO.getCdUsuario().trim().length() < 0) {
                throw new Exception("Usuário vazio");
            }
            if (palpiteDTO.getCdJogo() == 0) {
                throw new Exception("Codigo do jogo deve conter um valor");
            }
            if (palpiteDTO.getNrGols1() < 0 || palpiteDTO.getNrGols2() < 0) {
                throw new Exception("O número de gols deve ser um número positivo");
            }
        } catch (Exception e) {
            throw new Exception("Formato inválido do Json");
        }

        try {
            if (WSIntegraBolaoController.buscaBolao(String.valueOf(palpiteDTO.getCdBolao())) == null) {
                throw new Exception("Código de bolão inexistente");
            }
            if (WSIntegraBolaoController.buscaUsuario(palpiteDTO.getCdUsuario()) == null) {
                throw new Exception("Código de usuário inexistente");
            }
            if (WSIntegraBolaoController.buscaJogo(palpiteDTO.getCdJogo()) == null) {
                throw new Exception("O jogo informado não existe");
            }
            PalpiteId pk = new PalpiteId(palpiteDTO.getCdJogo(), palpiteDTO.getCdUsuario(), palpiteDTO.getCdBolao());
            this.palpiteDAO = WSIntegraBolaoController.buscaPalpitePK(pk);
            if (this.palpiteDAO == null){
                this.palpiteDAO = new PalpiteDAO();
                this.palpiteDAO.setId(pk);
                this.palpiteDAO.setUsuario(WSIntegraBolaoController.buscaUsuario(pk.getCdUsuario()));
                this.palpiteDAO.setJogoid(WSIntegraBolaoController.buscaJogo(pk.getCdJogo()));
            }
            this.palpiteDAO.setDtAposta(palpiteDTO.getDtAposta());
            this.palpiteDAO.setNrGols1((int)palpiteDTO.getNrGols1());
            this.palpiteDAO.setNrGols2((int)palpiteDTO.getNrGols2());
            this.palpiteDAO.setDtUltimaatt(new Date());
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Erro ao transformar em classe DAO -> Palpite.");
        }
    }

}
