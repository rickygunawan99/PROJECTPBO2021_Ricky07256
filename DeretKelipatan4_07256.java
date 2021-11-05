package deretkelipatan4_07256;

import java.util.Scanner;

public class DeretKelipatan4_07256 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int banyak_07256;

        System.out.print("Banyak deret : " );
        banyak_07256 = scan.nextInt();

        int[] deret_07256 = new int[banyak_07256];

        for(int i=0; i<banyak_07256; i++){
            deret_07256[i] = i*4+2;
        }
        for(int i:deret_07256){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
}
