/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.dto.validator;

/**
 *
 * @author bruno.szczuk
 */
public class Validator {

    private static final String UUID = "3d23a08c-c7b4-4497-befa-fa2968de43a9";
    
    public static boolean validaToken(String token){
        return UUID.equals(token);
    }
}
