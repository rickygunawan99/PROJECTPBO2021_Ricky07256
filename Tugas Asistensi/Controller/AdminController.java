package Controller;

import entity07256.AdminEntity07256;

public class AdminController {


    public int cekLogin(String username, String pass){
        return AllObjectModel.adminModel.cekLogin(username,pass);
    }

    public void insert(String username, String nama, String pass){
        AllObjectModel.adminModel.insert(username,nama,pass);
    }
}
