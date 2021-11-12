import Controller.AllObjectModel;
import entity07256.AdminEntity07256;
import entity07256.SepatuEntity07256;

import java.util.Scanner;

public class Main07256 {
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
                    AllObjectModel.sepatuModel.view();
                    break;
                }
                case 0-> System.out.println("~Exit~");
            }
        }while (pil07256!=0);
    }

    static void defaultData07256(){
        AllObjectModel.adminModel.insert("abc","Budi","123");
    }

    static void loginAdmin07256(){
        System.out.print("Id : ");
        String id07256 = scan07256.next();
        System.out.print("Password : ");
        String pass07256 = scan07256.next();
        int cek = AllObjectModel.adminModel.cekLogin(id07256,pass07256);

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
                        AllObjectModel.sepatuModel.insert(nama07256,stock07256);
                    break;
                    }
                    case 2 :
                        AllObjectModel.sepatuModel.view();
                    break;
                    case 3 : {
                        System.out.print("Pilih sepatu yang ingin di edit : ");
                        int pilihs07256 = scan07256.nextInt();
                        if(pilihs07256>=0 && pilihs07256-1<AllObjectModel.
                                sepatuModel.getSepatu().size()){
                            System.out.println("1. Edit nama");
                            System.out.println("2. Edit stock");
                            System.out.print("Pilih : ");
                            int pilih = scan07256.nextInt();
                            if(pilih == 1){
                                System.out.print("Masukan nama sepatu baru : ");
                                String newName = scan07256.next();
                                AllObjectModel.sepatuModel.update(pilihs07256-1,newName);
                                System.out.println("Update berhasil\n");
                            }else if(pilih == 2){
                                System.out.print("Masukan stock sepatu baru : ");
                                int newStock = scan07256.nextInt();
                                AllObjectModel.sepatuModel.update(pilihs07256-1,newStock);
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
                        if(pilih07256>=0 && pilih07256-1<AllObjectModel.sepatuModel.getSepatu().size()){
                            AllObjectModel.sepatuModel.delete(pilih07256-1);
                            System.out.println("Delete berhasil\n");
                        }else{
                            System.out.println("Pilihan tidak ditemukan");
                        }
                        break;
                    }
                    case 5 :
                        AllObjectModel.adminModel.view();
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
