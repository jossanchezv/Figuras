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
public abstract class ops {
    float area, perimetro,distancia;
    punto p1;
    punto p2;
    
    public abstract float calculararea();
    public abstract float calcularperimetro();
    public float getarea(){
        return area;
    }
     public float getperimetro(){
        return perimetro;
    }
}
