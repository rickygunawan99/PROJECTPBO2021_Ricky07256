package cekplatnomor_07256;

import java.util.Scanner;

public class CekPlatnomor_07256 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char plat_07256;

        System.out.print("Masukan Kode Plat : ");
        plat_07256 = scan.next().charAt(0);

        switch (plat_07256){
            case 'L':
                System.out.println("Plat Surabaya");
                break;
            case 'B':
                System.out.println("Plat Jakarta");
                break;
            case 'N':
                System.out.println("Plat Malang");
                break;
            case 'D':
                System.out.println("Plat Bandung");
                break;
            default:
                System.out.println("Plat tidak dikenal oleh sistem");
        }
    }
}
