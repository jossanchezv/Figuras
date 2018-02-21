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
public class cuadrado extends figura {
    
    @Override
    public double calculararea() {
        area = dist*dist;
        return area;
    }

    @Override
    public double calcularperimetro() {
        perimetro = dist*4;
        
       return perimetro;
    }
    
    
    public void imprimir () {
        
    }
    
    
    
}
