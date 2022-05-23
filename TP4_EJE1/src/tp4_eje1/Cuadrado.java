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
public class Cuadrado extends Cuadrilatero{
    private int l1;

    public int getL1() {
        return l1;
    }

    public void setL1(int l1) {
        this.l1 = l1;
    }
    
    public double area(){
    return(this.getL1()*this.getL1());
    
    }
}
