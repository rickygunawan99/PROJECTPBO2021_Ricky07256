package cekangka_07256;

import java.util.Scanner;

public class CekAngka_07256 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int angka_07256;

        System.out.print("Masukan angka : ");
        angka_07256 = scan.nextInt();


        while (angka_07256 > 0){
            angka_07256 = angka_07256-2;
        }

        System.out.println(angka_07256);

        if(angka_07256==0){
            System.out.println("GENAP");
        }else{
            System.out.println("GANJIL");
        }
    }
}
