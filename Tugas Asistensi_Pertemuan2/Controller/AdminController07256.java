package Controller;

public class AdminController07256 implements Interface07256{

    public void view_07256(){
        AllObjectModel07256.adminModel07256.view_07256();
    }

    public int cekLogin_07256(String username, String pass){
        return AllObjectModel07256.adminModel07256.cekLogin_07256(username,pass);
    }

    public void insert_07256(String username, String nama, String pass){
        AllObjectModel07256.adminModel07256.insert_07256(username,nama,pass);
    }
}
