/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contas.Banco;

/**
 *
 * @author jose
 */
public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{

    public void atualiza(double taxa) {
        saldo += saldo * taxa * 3;
    }

    @Override
    public int compareTo(ContaPoupanca c) {
        return Integer.compare(this.numero, c.getNumero());
    }
    
    @Override
    public String toString(){
        return "Conta = " +  this.numero;
    }
}
