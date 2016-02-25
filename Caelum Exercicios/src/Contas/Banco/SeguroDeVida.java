/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contas.Banco;

import Interface.Tributavel;

/**
 *
 * @author jose
 */
public class SeguroDeVida implements Tributavel{

    @Override
    public double calculaTributos() {
        return 42;
    }
    
    public String toString(){
        return "Classe Seguro de Vida ";
    }
}
