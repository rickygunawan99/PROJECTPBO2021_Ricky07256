package process07256;

import entity07256.SepatuEntity07256;

import java.util.ArrayList;

public class SepatuProcess07256 implements Interface07256{

    private ArrayList<SepatuEntity07256> sepatuEntity07256 = new ArrayList<>();

    public void insertSepatu(String nama, int stock){
        SepatuEntity07256 sepatu07256 = new SepatuEntity07256();
        sepatu07256.setNama07256(nama);
        sepatu07256.setStock07256(stock);
        sepatuEntity07256.add(sepatu07256);
    }

    @Override
    public void viewData() {
        if(sepatuEntity07256.size()!=0){
            for(int i=0;i<sepatuEntity07256.size();i++){
                System.out.println("Sepatu ke - " + (i+1));
                System.out.println("Nama sepatu : "+ sepatuEntity07256
                        .get(i).getNama07256());
                System.out.println("Stock sepatu : " + sepatuEntity07256.get(i).getStock07256());
                System.out.println();
            }
        }else{
            System.out.println("Sepatu masih kosong");
        }
    }

    public void updateSepatu(int idx, String nama, int stock){
        SepatuEntity07256 sepatu07256 = new SepatuEntity07256();
        sepatu07256.setNama07256(nama);
        sepatu07256.setStock07256(stock);
        sepatuEntity07256.set(idx,sepatu07256);
    }

    public void deleteSepatu(int idx){
        if(idx<0 || idx>=sepatuEntity07256.size()){
            System.out.println("index tidak ditemukan");
        }else{
            sepatuEntity07256.remove(idx);
        }
    }

    public ArrayList<SepatuEntity07256> getSepatuEntity07256() {
        return sepatuEntity07256;
    }
}
