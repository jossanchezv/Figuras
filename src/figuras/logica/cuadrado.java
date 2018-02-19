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

    public cuadrado(punto pa, punto pb) {
        p1 = pa;
        p2 = pb;
    }
    
    
    @Override
    public float calculararea() {
        float lado = this.p1.calculardistancia(this.p2);
        this.area=lado*lado;
        System.out.println("El area es:"+area);      
        return 0;
    }

    @Override
    public float calcularperimetro() {
        float lado = this.p1.calculardistancia(this.p2);
        this.perimetro=lado*4;
        System.out.println("El area es:"+perimetro);   
       return 0;
    }
    
    
}
