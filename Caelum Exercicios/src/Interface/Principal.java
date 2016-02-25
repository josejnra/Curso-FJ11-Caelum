/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Contas.Banco.*;

/**
 *
 * @author jose
 */
public class Principal {

    public static void main(String[] args){
        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
        
        SeguroDeVida sv = new SeguroDeVida();
        
        gerenciador.adiciona(sv);
        System.out.println(gerenciador.getTotal());
        
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);        
        gerenciador.adiciona(cc);
        
        System.out.println(gerenciador.getTotal());
    }
}
