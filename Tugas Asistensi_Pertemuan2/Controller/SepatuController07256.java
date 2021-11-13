package Controller;

import entity07256.SepatuEntity07256;

import java.util.ArrayList;

public class SepatuController07256 implements Interface07256
{
    public void insert_07256(String nama, int stock){
        AllObjectModel07256.sepatuModel07256.insert_07256(nama,stock);
    }

    public void update_07256(int idx, String nama){
        AllObjectModel07256.sepatuModel07256.update_07256(idx, nama);
    }

    public void update_07256(int idx, int stock){
        AllObjectModel07256.sepatuModel07256.update_07256(idx,stock);
    }

    public void delete_07256(int idx){
        AllObjectModel07256.sepatuModel07256.delete_07256(idx);
    }

    @Override
    public void view_07256(){
        AllObjectModel07256.sepatuModel07256.view_07256();
    }

    public ArrayList<SepatuEntity07256> getSepatu_07256(){
        return AllObjectModel07256.sepatuModel07256.getSepatu_07256();
    }
}
