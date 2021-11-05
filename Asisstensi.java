import java.util.ArrayList;
import java.util.Scanner;

public class Asisstensi {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<String> barang_07256 = new ArrayList<>();
    static ArrayList<Integer> harga_barang_07256 = new ArrayList<>();
    static ArrayList<Integer> stok_barang_07256 = new ArrayList<>();

    static ArrayList<String> list_pembeli_07256 = new ArrayList<>();
    static ArrayList<ArrayList<String>> listBarangDibeli_07256 = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> listHargaBarangDibeli_07256 = new ArrayList<>();
    static ArrayList<Integer> totalPembelian_07256 = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> jmlBarangDibeli_07256 = new ArrayList<>();

    public static void main(String[] args) {
        int inp_07256 = -1;
        defaultData_07256();
        printListBarang_07256();

        while (inp_07256!=3){
            System.out.println("1. Beli barang");
            System.out.println("2. Login admin");
            System.out.println("3. Exit");
            System.out.print("pilih : ");
            inp_07256 = scan.nextInt();
            scan.nextLine();
            switch (inp_07256) {
                case 1 -> beliBarang_07256();
                case 2 -> {
                    System.out.print("Masukan id : ");
                    String id = scan.next();
                    System.out.print("Password : ");
                    String pass = scan.next();
                    if(id.equals("admin")&&pass.equals("admin"))
                        loginAdmin_07256();
                    else
                        System.out.println("Id atau password tidak valid");
                }
            }
        }
    }

    static void defaultData_07256(){
        String[] defaultBarang = {"Charger","Monitor", "Keyboard", "Mouse"};
        Integer[] defaultHarga = {150000, 1000000, 125000, 100000};
        Integer[] defaultStok = {5, 5, 5, 5, 5 };

        for(int i=0;i<defaultBarang.length;i++){
            barang_07256.add(defaultBarang[i]);
            harga_barang_07256.add(defaultHarga[i]);
            stok_barang_07256.add(defaultStok[i]);
        }
    }

    static void printListBarang_07256(){
        System.out.println("===========LIST BARANG===========");
        for(int i=0;i<barang_07256.size();i++){
            System.out.println("=========================================");
            System.out.println("Barang ke-" + (i+1));
            System.out.println("Nama barang     : " + barang_07256.get(i));
            System.out.println("Harga barang    : " + harga_barang_07256.get(i));
            System.out.println("Stok barang     : " + stok_barang_07256.get(i));
        }
    }

    static void beliBarang_07256(){
        int pil_barang_07256 = -1, total_07256 = 0;
        System.out.print("Input nama : ");
        String nama = scan.next();
        list_pembeli_07256.add(nama);
        ArrayList<String> tempNamaBarang = new ArrayList<>();
        ArrayList<Integer> tempHargaBarang = new ArrayList<>();
        ArrayList<Integer> tempJmlBeli = new ArrayList<>();
        printListBarang_07256();
        while(pil_barang_07256!=0){
            System.out.print("Pilih barang (0:exit ) : ");
            pil_barang_07256 = scan.nextInt();
            if(pil_barang_07256>0 && pil_barang_07256-1 < barang_07256.size()){
                System.out.print("Jumlah yang dibeli : ");
                int jml_beli_07256 = scan.nextInt();
                if(jml_beli_07256<0 || jml_beli_07256>stok_barang_07256.get(pil_barang_07256-1)){
                    System.out.println("Input tidak valid");
                }else{
                    total_07256 = total_07256 + (jml_beli_07256*harga_barang_07256.get(pil_barang_07256-1));
                    tempNamaBarang.add(barang_07256.get(pil_barang_07256-1));
                    tempHargaBarang.add(harga_barang_07256.get(pil_barang_07256-1));
                    tempJmlBeli.add(jml_beli_07256);

                    stok_barang_07256.set(pil_barang_07256-1 ,stok_barang_07256.get(pil_barang_07256-1)-jml_beli_07256);
                    System.out.println("Berhasil beli barang");
                    printListBarang_07256();
                }
            }else if(pil_barang_07256==0){
                System.out.println("Terima kasih");
            }else{
                System.out.println("Barang tidak ditemukan");
            }
        }

        System.out.println("Total pembelian anda : " + total_07256);
            if(total_07256>=500000){
                System.out.println("Anda mendapat diskon sebesar 40%");
                total_07256-=(total_07256*40/100);
            }else if(total_07256>=350000){
                System.out.println("Anda mendapat diskon sebesar 35%");
                total_07256-=(total_07256*35/100);
            }else if(total_07256>=200000){
                System.out.println("Anda mendapat diskon sebesar 20%");
                total_07256-=(total_07256*20/100);
            }
        System.out.println("Total bayar : " + total_07256);
        listBarangDibeli_07256.add(tempNamaBarang);
        listHargaBarangDibeli_07256.add(tempHargaBarang);
        jmlBarangDibeli_07256.add(tempJmlBeli);
        totalPembelian_07256.add(total_07256);
    }

    static void loginAdmin_07256(){
        int inp_07256 = -1;
        while (inp_07256!=0){
            System.out.println("1. Tambah barang");
            System.out.println("2. Lihat daftar pembelian");
            System.out.println("3. Lihat daftar barang");
            System.out.println("0. Exit");
            System.out.print("pilih : ");
            inp_07256 = scan.nextInt();

            switch (inp_07256){
                case 1 -> tambahStokBarang_07256();
                case 2 -> viewRiwayat_07256();
                case 3 -> printListBarang_07256();
            }
        }
    }

    static void tambahStokBarang_07256(){
        int inp_07256 = -1;
        while (inp_07256!=0){
            System.out.println("1. Tambah barang baru");
            System.out.println("2. Tambah Stok barang");
            System.out.println("0. Exit");
            System.out.print("pilih : ");
            inp_07256 = scan.nextInt();
            scan.nextLine();

            if(inp_07256==2){
                System.out.print("Pilih barang ke : ");
                int pilih = scan.nextInt();
                if(pilih>0 && pilih-1<barang_07256.size()){
                    System.out.print("Jumlah : ");
                    int add = scan.nextInt();
                    stok_barang_07256.set(pilih-1, stok_barang_07256.get(pilih-1)+add);
                    System.out.println("Berhasil tambah stok barang ke " + pilih);
                }else{
                    System.out.println("Input tidak valid");
                }
            }else if(inp_07256==1){
                System.out.print("Masukan nama barang : ");
                String newName = scan.nextLine();
                barang_07256.add(newName);
                System.out.print("Masukan harga barang : ");
                int harga = scan.nextInt();
                harga_barang_07256.add(harga);
                System.out.print("Masukan stok barang : ");
                int stok = scan.nextInt();
                stok_barang_07256.add(stok);
            }
        }
    }

    static void viewRiwayat_07256(){
        if(list_pembeli_07256.size()!=0){
            for(int i=0; i<list_pembeli_07256.size();i++){
                System.out.println("=====================================");
                System.out.println("Nama : " + list_pembeli_07256.get(i));
                System.out.println("-Daftar pembelian-");
                for(int j=0; j<listBarangDibeli_07256.get(i).size();j++){
                    System.out.println("Nama barang : " + listBarangDibeli_07256.get(i).get(j));
                    System.out.println("Jumlah pembelian : " + jmlBarangDibeli_07256.get(i).get(j) );
                    System.out.println("Harga barang/ea : " + listHargaBarangDibeli_07256.get(i).get(j));
                }
                System.out.println("Total : " + totalPembelian_07256.get(i));
                System.out.println("======================================");
            }
        }else{
            System.out.println("List pembeli masih kosong");
        }
    }
}
