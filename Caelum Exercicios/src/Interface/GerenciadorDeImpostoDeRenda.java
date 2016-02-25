/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Contas.Banco.ContaCorrente;

/**
 *
 * @author jose
 */

public class GerenciadorDeImpostoDeRenda {
    private double total;

    public double getTotal() {
        return total;
    }
    
    public void adiciona(Tributavel t){
        System.out.println("Adicionando tributavel: " + t.calculaTributos());
        
        this.total += t.calculaTributos();
    }
    
    
}
