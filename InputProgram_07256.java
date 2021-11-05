package inputprogram_07256;

import java.util.Scanner;

public class InputProgram_07256 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nINPUT");

        System.out.print("Masukkan Nama : ");
        String nama_07256 = scan.nextLine();

        System.out.print("Masukkan Umur: ");
        int umur_07256 = scan.nextInt();

        System.out.println("\nOUTPUT");
        System.out.println("Nama : " + nama_07256);
        System.out.print("Umur : ");
        System.out.println(umur_07256);

    }
}
