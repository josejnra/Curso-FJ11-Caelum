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
public class Circulo implements AreaCalculavel{
    private int raio;

    public Circulo(int raio){
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public int getRaio() {
        return raio;
    }
    
}
