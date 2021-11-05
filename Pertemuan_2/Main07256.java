import process07256.AdminProcess07256;
import process07256.SepatuProcess07256;

import java.util.Scanner;

public class Main07256 {
    private static Scanner scan07256 = new Scanner(System.in);
    private static AdminProcess07256 adminProcess07256 = new AdminProcess07256();
    private static SepatuProcess07256 sepatuProcess07256 = new SepatuProcess07256();

    public static void main(String[] args) {
        defaultData07256();
        int pil07256 = -1;

        do{
            System.out.println("""
                    1. Login admin
                    2. Lihat daftar sepatu
                    0. Exit
                    """);
            System.out.print("Pilih : ");
            pil07256 = scan07256.nextInt();
            scan07256.nextLine();

            switch (pil07256){
                case 1-> loginAdmin07256();
                case 2-> sepatuProcess07256.viewData();
                case 0-> System.out.println("~Exit~");
            }
        }while (pil07256!=0);
    }

    static void defaultData07256(){
        adminProcess07256.insertData("Rakha","Rakha","123");
    }

    static void loginAdmin07256(){
        System.out.print("Id : ");
        String id07256 = scan07256.next();
        System.out.print("Password : ");
        String pass07256 = scan07256.next();
        int cek = adminProcess07256.cekLogin(id07256,pass07256);

        if(cek!=-1){
            int pil07256 = -1;
            do {
                System.out.println("""
                    1. Tambah sepatu baru
                    2. Lihat daftar sepatu
                    3. Update data sepatu
                    4. Delete data sepatu
                    5. Lihat data admin
                    0. Exit
                    """);
                pil07256 = scan07256.nextInt();

                switch (pil07256){
                    case 1 :{
                        System.out.print("Nama sepatu : ");
                        String nama07256 = scan07256.next();
                        System.out.print("Stock sepatu : ");
                        int stock07256 = scan07256.nextInt();
                        sepatuProcess07256.insertSepatu(nama07256,stock07256);
                    break;
                    }
                    case 2 :
                        sepatuProcess07256.viewData();
                    break;
                    case 3 : {
                        System.out.print("Pilih sepatu yang ingin di edit : ");
                        int pilihs07256 = scan07256.nextInt();
                        if(pilihs07256>=0 && pilihs07256<SepatuProcess07256.jumSepatu07256){
                            System.out.print("Masukan nama sepatu baru : ");
                            String nama07256 = scan07256.next();
                            System.out.print("Masukan stock sepatu baru : ");
                            int stock07256 = scan07256.nextInt();
                            sepatuProcess07256.updateSepatu(pilihs07256,nama07256,stock07256);
                        }else{
                            System.out.println("Pilihan tidak ditemukan");
                        }
                        break;
                    }
                    case 4 : {
                        System.out.print("Pilih sepatu yang ingin dihapus : ");
                        int pilih07256 = scan07256.nextInt();
                        if(pilih07256>=0 && pilih07256<SepatuProcess07256.jumSepatu07256){
                            sepatuProcess07256.deleteSepatu(pilih07256);
                            System.out.println("Delete berhasil");
                        }else{
                            System.out.println("Pilihan tidak ditemukan");
                        }
                        break;
                    }
                    case 5 :
                        adminProcess07256.viewData();
                        break;
                    case 0 :
                        System.out.println("-Exit-");
                        break;
                    default :
                        System.out.println("Input tidak ditemukan");
                }
            }while (pil07256!=0);
        }else{
            System.out.println("Data tidak valid");
        }
    }
}
