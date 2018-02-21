/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras.logica;

/**
 *
 * @author ASUS
 */


public class Operaciones {
    double distancia, base,altura;
    
    public double calculardistancia(punto p2,punto p1) {
        distancia = (double) Math.sqrt((Math.pow(p2.x1-p1.x1,2)+(Math.pow(p2.y1-p1.y1,2))));
        return distancia;
    }
    
    public double calcularbase (punto p2,punto p1){
        base = (p2.x1-p1.x1);
        return base;
    }
    
    public double calcularaltura (punto p2,punto p1){
        base = (p2.y1-p1.y1);
        return altura;
    }
    
}
