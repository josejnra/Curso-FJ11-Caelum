/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author jose
 */
public class Retangulo extends Quadrado implements AreaCalculavel{

    private int altura;
    
    public Retangulo(int largura, int altura){
        super(largura);
        this.altura = altura;
    }
    
    @Override
    public double calculaArea() {
        return super.getLado() * altura;
    }
    
}
