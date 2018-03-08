/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.exp;

/**
 *
 * @author Bruno
 */
public class ExceptionDAO extends Exception {

    public ExceptionDAO() {
        super("Não foi possível buscar o registro.");
    }

    public ExceptionDAO(String mensagem) {
        super("Não foi possível buscar o registro.\n" + mensagem);
    }

}
