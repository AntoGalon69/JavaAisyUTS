/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menghitung.kalor.jenis;


import java util.Scanner;

public class MenghitungKalorJenis {

    public static void main(String[] args) {
      Scanner myObj = new Scanner(System.in);
      System.out.println("Masukkan Massa Benda : ");
      float massa_benda = myObj.nextFloat();
      System.out.println("Masukkan Kalor Jenis : ");
      float kalor_jenis = myObj.nextFloat();
      System.out.println("Masukkan Perubahan Suhu : ");
      float perubahan_suhu = myObj.nextFloat();

      float kalor_diserap = massa_benda * kalor_jenis * perubahan_suhu;
      
      System.out.print("Kalor yang diserap =" + kalor_diserap + " J");
    }
    
}
