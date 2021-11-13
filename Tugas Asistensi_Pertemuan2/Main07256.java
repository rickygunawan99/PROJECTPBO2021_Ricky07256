import Controller.*;

import java.util.Scanner;

public class Main07256 {
    private static SepatuController07256 sepatuController = new SepatuController07256();
    private static AdminController07256 adminController = new AdminController07256();
    private static Scanner scan07256 = new Scanner(System.in);

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
                case 2-> {
                    sepatuController.view_07256();
                    break;
                }
                case 0-> System.out.println("~Exit~");
            }
        }while (pil07256!=0);
    }

    static void defaultData07256(){
        adminController.insert_07256("abc","Budi","123");
    }

    static void loginAdmin07256(){
        System.out.print("Id : ");
        String id07256 = scan07256.next();
        System.out.print("Password : ");
        String pass07256 = scan07256.next();
        int cek = adminController.cekLogin_07256(id07256,pass07256);

        if(cek!=-1){
            int pil07256;
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
                        sepatuController.insert_07256(nama07256,stock07256);
                    break;
                    }
                    case 2 :
                        sepatuController.view_07256();
                    break;
                    case 3 : {
                        System.out.print("Pilih sepatu yang ingin di edit : ");
                        int pilihs07256 = scan07256.nextInt();
                        if(pilihs07256>=0 && pilihs07256-1<sepatuController.getSepatu_07256().size()){
                            System.out.println("1. Edit nama");
                            System.out.println("2. Edit stock");
                            System.out.print("Pilih : ");
                            int pilih = scan07256.nextInt();
                            if(pilih == 1){
                                System.out.print("Masukan nama sepatu baru : ");
                                String newName = scan07256.next();
                                sepatuController.update_07256(pilihs07256-1,newName);
                                System.out.println("Update berhasil\n");
                            }else if(pilih == 2){
                                System.out.print("Masukan stock sepatu baru : ");
                                int newStock = scan07256.nextInt();
                                sepatuController.update_07256(pilihs07256-1,newStock);
                                System.out.println("Update berhasil\n");
                            }else{
                                System.out.println("Pilihan tidak ditemukan");
                            }
                        }else{
                            System.out.println("Pilihan tidak ditemukan");
                        }
                        break;
                    }
                    case 4 : {
                        System.out.print("Pilih sepatu yang akan dihapus : ");
                        int pilih07256 = scan07256.nextInt();
                        if(pilih07256>=0 && pilih07256-1<sepatuController.getSepatu_07256().size()){
                            sepatuController.delete_07256(pilih07256-1);
                            System.out.println("Delete berhasil\n");
                        }else{
                            System.out.println("Pilihan tidak ditemukan");
                        }
                        break;
                    }
                    case 5 :
                        adminController.view_07256();
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
