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
public class rectangulo extends figura {
    
    Operaciones op = new Operaciones();
    
    double base, altura;
    
    @Override
    public double calculararea() {
        base = op.calcularbase(p2, p1);
        altura = op.calcularaltura(p2, p1);
        area=base*altura;
        return base;
    }

    @Override
    public double calcularperimetro() {
        base = op.calcularbase(p2, p1);
        altura = op.calcularaltura(p2, p1);
        perimetro = (2*base)+(2*altura);
        return perimetro;
    }
    
}
