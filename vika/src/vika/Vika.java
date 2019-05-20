package vika;

import java.util.Scanner;

public class Vika{
    public static void main (String [] args){
        Scanner hasil = new Scanner(System.in);
        
        System.out.println("                               HASIL NILAI");
        System.out.println();
        System.out.print("Nilai UTS    : ");
        byte UTS = hasil.nextByte();
        
        System.out.print("Nilai UAS    : ");
        byte UAS = hasil.nextByte();
        
        double nilai = (0.7*UTS) + (0.3*UAS);
        System.out.println("Nilai Akhir  : "+nilai);
        System.out.println("");
        
        if (nilai >= 90){
            System.out.println("Wow Keren Nilai Akhirnya");
        }
        else if (nilai >= 80 & nilai < 90){
            System.out.println("Bagus, Pertahankan ataubahkan Tingkatan Lagi");
        }
        else if(nilai >= 70 & nilai < 80){
            System.out.println("Cukup, Tingkatan Lagi");
        }
        else if (nilai < 70){
            System.out.println("You're Failed");
        }
        
    }
}