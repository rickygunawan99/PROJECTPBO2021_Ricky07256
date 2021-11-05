import java.util.Scanner;

public class Main07256 {
    public static void main(String[] args) {
        int status07256 = -1;
        int max07256 = 100;
        Scanner scan07256 = new Scanner(System.in);
        System.out.print("Masukan Nilai : ");
        double nilai07256 = scan07256.nextDouble();

        if(nilai07256 <= max07256 && nilai07256>=0){
            if(nilai07256 > 90){
                status07256 = 1;
                System.out.println("Grade A");
            }else if(nilai07256 <=90 && nilai07256>=81){
                status07256 = 1;
                System.out.println("Grade B");
            }else if(nilai07256 <=80 && nilai07256>=70){
                for(int i=80;i>=70;i--){
                    if(i >= 75){
                        if(nilai07256 == i){
                            status07256 = 1;
                            i = 69;
                        }
                    }else{
                        if(nilai07256 == i){
                            status07256 = 2;
                            i = 69;
                        }
                    }
                }
                System.out.println("Grade C");
            }else if(nilai07256 <=69 && nilai07256>=60){
                status07256 = 2;
                System.out.println("Grade D");
            }else{
                status07256 = 2;
                System.out.println("Grade E");
            }
        }else{
            System.out.println("Nilai lebih dari 100 atau kurang dari 0");
        }

        switch (status07256){
        case 1:
            System.out.println("LULUS");
            break;
        case 2:
            System.out.println("TIDAK LULUS");
            break;
        }
    }
}
