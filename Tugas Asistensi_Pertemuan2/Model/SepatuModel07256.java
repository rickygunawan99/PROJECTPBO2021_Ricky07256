package Model;

import entity07256.SepatuEntity07256;
import helper.DataCollections07256;

import java.util.ArrayList;

public class SepatuModel07256 {

    public void insert_07256(String nama, int stock){
        DataCollections07256.listSepatu07256.add(new SepatuEntity07256(nama,stock));
    }

    public void update_07256(int id, String nama){
        DataCollections07256.listSepatu07256.get(id).setNama07256(nama);
    }

    public void update_07256(int id, int stock){
        DataCollections07256.listSepatu07256.get(id).setStock07256(stock);
    }

    public void delete_07256(int id){
        DataCollections07256.listSepatu07256.remove(id);
    }

    public void view_07256(){
        if(DataCollections07256.listSepatu07256.size()!=0){
            int ctr = 1;
            for(SepatuEntity07256 sepatu : DataCollections07256.listSepatu07256){
                System.out.println("--Sepatu ke - " +ctr++ + "--" );
                System.out.println("Nama sepatu  : " + sepatu.getNama07256());
                System.out.println("Stock sepatu : " + sepatu.getStock07256());
                System.out.println("------------------------------------------");
            }
        }else{
            System.out.println("Sepatu masih kosong");
        }
    }

    public ArrayList<SepatuEntity07256> getSepatu_07256(){
        return DataCollections07256.listSepatu07256;
    }
}
