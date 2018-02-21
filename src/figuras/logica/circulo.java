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
public class circulo extends figura {

    
    
    @Override
    public double calculararea() {
        area = (Math.PI)*(dist*dist);
        
        return area;
    }

    @Override
    public double calcularperimetro() {
        perimetro = 2*(Math.PI)*dist;
        
        return perimetro;
    }
    
}
