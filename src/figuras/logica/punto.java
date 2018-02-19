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
public class punto {
    float x1,y1;
    public float calculardistancia(punto p2){
       float distancia =  (float) Math.sqrt(Math.pow(p2.x1-x1,2)+(Math.pow(p2.y1-y1,2)));
    
    return distancia;    
    }

    public void setX1(float x1) {
        this.x1 = x1;
    }

    public void setY1(float y1) {
        this.y1 = y1;
    }

    public float getX1() {
        return x1;
    }

    public float getY1() {
        return y1;
    }
    public float getarea(){
        return area;
    }
    
    
}
