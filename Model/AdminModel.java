package Model;

import entity07256.AdminEntity07256;
import helper.DataCollections;

public class AdminModel {

    public int cekLogin(String username, String pass){
        int ctr = 0;
        for(AdminEntity07256 admin : DataCollections.listAdmin){
            if(admin.getId07256().equals(username) && admin.getPass07256().equals(pass)){
                return ctr;
            }
            ctr++;
        }
        return -1;
    }

    public void insert(String username, String nama, String pass){
        AdminEntity07256 admin = new AdminEntity07256();
        admin.setId07256(username);
        admin.setNama07256(nama);
        admin.setPass07256(pass);
        DataCollections.listAdmin.add(admin);
    }

    public void view(){
        if(DataCollections.listAdmin.size()!=0){
            for(AdminEntity07256 admin : DataCollections.listAdmin){
                System.out.println("Nama : " + admin.getNama07256());
                System.out.println("Id   : " + admin.getId07256());
            }
        }
    }

}
