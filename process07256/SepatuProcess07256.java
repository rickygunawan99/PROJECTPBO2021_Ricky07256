package process07256;

import entity07256.SepatuEntity07256;

import java.util.ArrayList;

public class SepatuProcess07256 implements Interface07256{

    SepatuEntity07256[] sepatuEntity07256 = new SepatuEntity07256[100];
    public static int jumSepatu07256 = 0;

    public void insertSepatu(String nama, int stock){
        SepatuEntity07256 sepatu07256 = new SepatuEntity07256();
        sepatu07256.setNama07256(nama);
        sepatu07256.setStock07256(stock);
        sepatuEntity07256[jumSepatu07256] = sepatu07256;
        jumSepatu07256+=1;
    }

    @Override
    public void viewData() {
        if(jumSepatu07256!=0){
            for(int i=0;i<jumSepatu07256;i++){
                System.out.println("Sepatu ke - " + i);
                System.out.println("Nama sepatu : "+ sepatuEntity07256[i].getNama07256());
                System.out.println("Stock sepatu : " + sepatuEntity07256[i].getStock07256());
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
        sepatuEntity07256[idx] = sepatu07256;
    }

    public void deleteSepatu(int idx){
        if(idx == jumSepatu07256-1){
            jumSepatu07256-=1;
        }else{
            for(int i=idx;i<jumSepatu07256;i++){
                sepatuEntity07256[i] = sepatuEntity07256[i+1];
            }
            jumSepatu07256-=1;
        }
    }
}
