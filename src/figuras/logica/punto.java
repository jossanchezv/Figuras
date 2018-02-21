
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
public class punto {

    double x1, y1;

    
    public double calcularbase(punto p2) {
        double distancia = (double) Math.sqrt((Math.pow(p2.x1-x1,2)+(Math.pow(p2.y1-y1,2))));
        double base = (double) Math.sqrt((Math.pow(distancia, 2)-(Math.pow(p2.y1-y1,2))));
        return base;
    }
    public double calcularperimetro(punto p2) {
    double distancia = (double) Math.sqrt((Math.pow(p2.x1-x1,2)+(Math.pow(p2.y1-y1,2))));
    double perimetro = (double) Math.sqrt((Math.pow(distancia, 2)-(Math.pow(p2.y1-y1,2))));
    return perimetro;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }
}
