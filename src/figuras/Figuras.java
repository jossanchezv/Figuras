/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import figuras.logica.circulo;
import figuras.logica.cuadrado;
import figuras.logica.ops;
import figuras.logica.punto;
import figuras.logica.rectangulo;
import figuras.logica.triangulo;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion,x1,x2,y1,y2,q;
        System.out.println("Que figura desea utilizar?");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Rectangulo");
        System.out.println("4. triangulo");
        Scanner sc =  new Scanner (System.in);
        opcion = sc.nextInt();
        ops s;
        switch (opcion){
            case '1':
            s = new circulo();    
            break;
            case '2':
            s = new cuadrado();    
            break;
            case '3':
            s = new rectangulo();    
            break;
             case '4':
            s = new triangulo();    
            break;
        }
        
        punto p1 = new punto();
        punto p2 = new punto();
        System.out.println("Ingrese X1");
        p1.setX1(sc.nextInt());
        System.out.println("Ingrese Y1");
        p1.setY1(sc.nextInt());
        System.out.println("Ingreser X2");
        p2.setX1(sc.nextInt());
        System.out.println("Ingrese y2");
        p2.setY1(sc.nextInt());
        
    }

    private static void Switch(int opcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
