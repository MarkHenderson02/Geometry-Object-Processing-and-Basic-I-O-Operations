/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percobaan3_52020007;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import static javax.swing.text.html.HTML.Tag.P;

public class Percobaan3_52020007 {

    public static void main(String[] args) throws IOException{
        BufferedReader key=new BufferedReader(new
        InputStreamReader(System.in));
        System.out.println("Menu Pilihan");
        System.out.println("1. Operasi Geometri Lingkaran");
        System.out.println("2. Operasi Geometri SegiTiga");
        System.out.println("3. Operasi Geometri Persegi Panjang");
        System.out.println("4. Exit");
        System.out.print("Pilihan anda? ");
        String pilihan=key.readLine();
            if(pilihan.equals("1")){
        System.out.print("Masukkan jari-jari lingkaran:");
        double r=Double.parseDouble(key.readLine());
        Lingkaran p=new Lingkaran(r);
        p.display();
            }else if(pilihan.equals("2")){
            System.out.println("Lengkapi untuk Operasi Segitiga....");
            System.out.print("Masukkan alas Segitiga:");
            double a=Double.parseDouble(key.readLine());
            System.out.print("Masukkan tinggi Segitiga:");
            double t=Double.parseDouble(key.readLine());
            Segitiga q=new Segitiga(a,t);
            q.display();
                }else if(pilihan.equals("3")){
                System.out.println("Lengkapi untuk Operasi PersegiPanjang....");
                System.out.print("Masukkan panjang:");
                double p=Double.parseDouble(key.readLine());
                System.out.print("Masukkan lebar:");
                double l=Double.parseDouble(key.readLine());
                PersegiPanjang pp=new PersegiPanjang(p,l);
                pp.display();
                    }else if(pilihan.equals("4"(){
                    System.out.println("Bye-Bye");
                    System.exit(0);
                    }else{
                    System.out.println("Pilihan salah");
            
        }
    }
}