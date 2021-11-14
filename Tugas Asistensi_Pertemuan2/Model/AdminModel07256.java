package Model;

import entity07256.AdminEntity07256;
import helper.DataCollections07256;

public class AdminModel07256 {

    public int cekLogin_07256(String username, String pass){
        int ctr = 0;
        for(AdminEntity07256 admin : DataCollections07256.listAdmin07256){
            if(admin.getId07256().equals(username) && admin.getPass07256().equals(pass)){
                return ctr;
            }
            ctr++;
        }
        return -1;
    }

    public void insert_07256(String username, String nama, String pass){
        AdminEntity07256 admin = new AdminEntity07256();
        admin.setId07256(username);
        admin.setNama07256(nama);
        admin.setPass07256(pass);
        DataCollections07256.listAdmin07256.add(admin);
    }

    public void view_07256(){
        if(DataCollections07256.listAdmin07256.size()!=0){
            for(AdminEntity07256 admin : DataCollections07256.listAdmin07256){
                System.out.println("Nama : " + admin.getNama07256());
                System.out.println("Id   : " + admin.getId07256());
            }
        }
    }
}
