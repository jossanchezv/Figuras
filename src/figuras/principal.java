/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import figuras.logica.*;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion,x1,x2,y1,y2,q;
        double area=0, perimetro=0;
        System.out.println("Que figura desea utilizar?");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Rectangulo");
        System.out.println("4. triangulo");
        Scanner sc = new Scanner (System.in);
        opcion = sc.nextInt();
        figura s;
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
        
        Operaciones OP = new Operaciones();
        double dist = OP.calculardistancia(p2, p1);
        
        switch (opcion){
            case 1:
            circulo circulo = new circulo(); 
            circulo.SetDist(dist);
            area = circulo.calculararea();
            perimetro = circulo.calcularperimetro();
            break;
            default:
            cuadrado cuadrado = new cuadrado();
            cuadrado.SetDist(dist);
            area = cuadrado.calculararea();
            perimetro = cuadrado.calcularperimetro();
            
            break;
            case 3:
            rectangulo rectangulo = new rectangulo();  
            area = rectangulo.calculararea();
            perimetro = rectangulo.calcularperimetro();
            break;
             case 4:
            //s = new triangulo(p1,p2);    
            break;
        }
        
        System.out.println("El area es: "+area);
        System.out.println("El perimetro es: "+perimetro);
    }


}
    

