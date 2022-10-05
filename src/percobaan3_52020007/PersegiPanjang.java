/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan3_52020007;

public class PersegiPanjang {
private double panjang;
private double lebar;
public PersegiPanjang(double p,double l){
       panjang=p;
       lebar=l;
    }

public double getluas(){
        return(panjang*lebar);
    }

public void display(){
        System.out.println("Luas PersegiPan = "+getluas());
    }
}
