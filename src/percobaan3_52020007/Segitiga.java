/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan3_52020007;

/**
 *
 * @author Lab20703
 */
public class Segitiga {
    private double alas;
    private double tinggi;
    public Segitiga(double a,double t){
           alas=a;
           tinggi=t;
    }
    
    public double getluas(){
        return(alas*tinggi/2);
    }
    
    public void display(){
        System.out.println("Luas segitiga = "+getluas());
    }
}
