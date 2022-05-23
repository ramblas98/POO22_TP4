/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4_ejercicio1;

/**
 *
 * @author Matias
 */
public class Figura {
    
    public Figura() {
    }
    
    public double area(){
        return 0;
    }
    
    public double perimetro(){
        return 0;
    }
    
    public boolean mismaArea(Figura f){
        double area1 = area();
        double area2 = f.area();
        
        if(area1 == area2){
            return true;
        }
        else{
            return false;
        }
    }
    
    
}
