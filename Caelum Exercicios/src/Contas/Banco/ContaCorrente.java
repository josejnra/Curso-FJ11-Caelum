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
public class ContaCorrente extends Conta implements Tributavel, Comparable<ContaCorrente>{

    public void atualiza(double taxa) {
        saldo += saldo * taxa * 2;
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.1;
    }
    
    public String toString(){
        return "Conta = " +  this.numero;
    }

    @Override
    public int compareTo(ContaCorrente o) {
        if(saldo < o.getSaldo())
            return -1;
        else if(saldo > o.getSaldo())
            return 1;
        else
            return 0;
    }    
}
