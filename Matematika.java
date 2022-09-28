/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

import java.util.Scanner;
/**
 *
 * @author acer
 */
public class Matematika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pilihan ;
        double angka1, angka2, hasil = 0;
        String operator = "";
        
        System.out.println("Menu Aplikasi Matematika : ");
        System.out.print("1. penambahan " + '\t' + "2. penguragan " + '\t' + "3. perkalian" + '\t' + "4. pembagian" + '\n');
        System.out.print("Pilih Menu : ");
        pilihan = input.nextInt();
        
        if (pilihan > 0 && pilihan < 5){
            System.out.print("Masukan angka pertama = ");
            angka1 = input.nextDouble();
            
            System.out.print("Masukan angka kedua = ");
            angka2 = input.nextDouble();
            
            if (pilihan == 1 ){
                operator = "penambahan";
                hasil = angka1 + angka2;
            }else if (pilihan == 2){
                operator = "pengurangan";
                hasil = angka1 - angka2;
            }else if (pilihan == 3){
                operator = "perkalian";
                hasil = angka1 * angka2;
            }else if (pilihan == 4){
                operator = "pembagian";
                hasil = angka1 / angka2;
            }
            System.out.println("hasil " + operator  +  " antara " + angka1 + " dan " + angka2 + "adalah : " + hasil);
        }else {
            System.out.println("pilihan tidak tersedia");
        }
    }
}
