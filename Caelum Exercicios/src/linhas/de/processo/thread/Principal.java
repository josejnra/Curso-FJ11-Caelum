/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linhas.de.processo.thread;

/**
 *
 * @author jose
 */
public class Principal {
    
    public static void main (String[] args){

        /*Trabalhando com processos paralelos (threads), utiliza-se a classe Thread*/
        /*Para serem threads as classes dos objeto precisam implementar a interface Runnable*/
        Programa p1 = new Programa(1);
        Thread t1 = new Thread(p1);
        
        Programa p2 = new Programa(2);
        Thread t2 = new Thread(p2);
        
        t1.start();
        t2.start();
        
        
        /*Utilizando classes Anonimas*/
        Thread t3 = new Thread(){
            public void run(){
                for(int a = 0; a < 10; a++){
                    System.out.println("Programa : "+ 3 +" id : "+ a);
                }
            }
        };
        
        (new Thread(){
            public void run(){
                for(int a = 0; a < 10; a++){
                    System.out.println("Programa : "+ 4 +" id : "+ a);
                }
            }
        }).start();
        
        
        t3.start();
    }    
}
