package Model;

import entity07256.SepatuEntity07256;
import helper.DataCollections;

import java.util.ArrayList;

public class SepatuModel {

    public void insert(String nama, int stock){
        DataCollections.listSepatu.add(new SepatuEntity07256(nama,stock));
    }

    public void update(int id, String nama){
        DataCollections.listSepatu.get(id).setNama07256(nama);
    }

    public void update(int id, int stock){
        DataCollections.listSepatu.get(id).setStock07256(stock);
    }

    public void delete(int id){
        DataCollections.listSepatu.remove(id);
    }

    public void view(){
        if(DataCollections.listSepatu.size()!=0){
            int ctr = 1;
            for(SepatuEntity07256 sepatu : DataCollections.listSepatu){
                System.out.println("--Sepatu ke - " +ctr++ + "--" );
                System.out.println("Nama sepatu  : " + sepatu.getNama07256());
                System.out.println("Stock sepatu : " + sepatu.getStock07256());
                System.out.println("------------------------------------------");
            }
        }else{
            System.out.println("Sepatu masih kosong");
        }
    }

    public ArrayList<SepatuEntity07256> getSepatu(){
        return DataCollections.listSepatu;
    }
}
