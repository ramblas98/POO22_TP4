/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4_eje1;

/**
 *
 * @author alumno
 */
public class Triangulo {
    private double l1;
    private double l2;
    private double b;
    public Triangulo(double l1, double l2, double b) {
        this.l1 = l1;
        this.l2 = l2;
        this.b = b;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    
 private String tipoTriangulo(){
 if (this.getL1()==this.getL2()== this.getB())
      return "Equilatero";
         else
     if(this.getL1()==this.getL2())
           return "isoseles";
          else
           if(this.getL1()!= this.getL2()!= this.getB())
             return "Escaleno";
        
 
 }


}
