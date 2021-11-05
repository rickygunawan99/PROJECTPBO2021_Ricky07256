package pengujiansegitiga_07256;

import java.util.Scanner;

public class PengujianSegitiga_07256 {
    public static void main(String[] args) {
        int a_07256,b_07256,c_07256;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukan ketiga panjang sisi segitiga");
        a_07256 = scan.nextInt();
        b_07256 = scan.nextInt();
        c_07256 = scan.nextInt();

        if(Math.pow(c_07256,2) < Math.pow(a_07256,2) + Math.pow(b_07256,2)) {
            System.out.println("SEGITIGA LANCIP");
        }else if (Math.pow(c_07256,2)  > Math.pow(a_07256,2) + Math.pow(b_07256,2)) {
            System.out.println("SEGITIGA TUMPUL");
        }else {
            System.out.println("SEGITIGA SIKU SIKU");
        }
    }
}
