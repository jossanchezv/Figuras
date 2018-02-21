/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras.logica;

/**
 *
 * @author Estudiantes
 */
public abstract class figura {
    double area, perimetro;
    punto p1;
    punto p2;
    
    double dist;
    
    public void SetDist(double dist) {
        this.dist = dist;
    }
    
    public abstract double calculararea();
    public abstract double calcularperimetro();

}
