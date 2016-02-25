/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import Contas.Banco.Conta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jose
 */
public class Banco {
    private List<Conta> contas = new ArrayList<>();
    private static Banco controlador;
    
    private Banco(){}
    
    public static Banco getInstance(){
        if(controlador == null){
            controlador = new Banco();
        }
        return controlador;
    }
    
    public void adiciona(Conta c){
        contas.add(c);
    }
    
    public Conta pega(int x){
        return contas.get(x);
    }
    
    public int pegaQuantidadeDeContas(){
        return contas.size();
    }
    
    public List<Conta> conta(){
        return this.contas;
    }
    
    public Conta buscaPorNome(String nome){
        Conta pegar;        
            Iterator<Conta> i = contas.iterator();
            while(i.hasNext()){
                pegar = i.next();
                if(pegar.getNome().equals(nome)){
                    return pegar;
                }
            }
        return null;
    }
}
