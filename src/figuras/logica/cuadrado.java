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
public class cuadrado extends ops {
    
    @Override
    public float calculararea() {
        float lado = this.p1.calculardistancia(this.p2);
        this.area=lado*lado;
        System.out.println("El area es:");
       
    }

    @Override
    public float calcularperimetro() {
       return
    }
    
    
}
