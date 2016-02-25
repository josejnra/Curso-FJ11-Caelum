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
public class Conta {
    protected double saldo;
    protected double limite;
    protected int numero;
    protected String nome;


    /*Para definir os atributor de comparação de dois objetos é preciso reescrever
    o método equals. O método hashCode é necessário para definir se salva o item em um Set, por exemplo,
    sendo necessário os dois métodos.*/
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if ( obj instanceof Conta){
            if (((Conta) obj).getNumero() != this.numero){
                return false;
            }
        }
        
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public double getLimite() {
        return this.limite;
    }
    
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public void saca(double quantidade) {
        //posso sacar até saldo+limite
        if (quantidade > this.saldo + this.limite){
            System.out.println("Não posso sacar fora do limite!");
        } else {
            this.saldo = this.saldo - quantidade;
        }
    }
    
    public void deposita(double quantidade) {
        this.saldo += quantidade;
    }
    
}
