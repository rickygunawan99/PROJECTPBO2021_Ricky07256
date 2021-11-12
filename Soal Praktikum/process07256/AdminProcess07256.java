package process07256;

import entity07256.AdminEntity07256;
import java.util.ArrayList;

public class AdminProcess07256 implements Interface07256{
    private ArrayList<AdminEntity07256> adminEntity07256 = new ArrayList<>();
    public void insertData(String nama, String id, String password){
        AdminEntity07256 admin07256 = new AdminEntity07256(nama,id,password);
        adminEntity07256.add(admin07256);
    }

    public int cekLogin(String id, String password){
        for(int i=0;i<adminEntity07256.size();i++){
            if(adminEntity07256.get(i).getId07256().equals(id) && adminEntity07256.get(i).getPass07256()
                    .equals(password)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void viewData() {
        if(adminEntity07256.size()!=0){
            for (AdminEntity07256 entity07256 : adminEntity07256) {
                System.out.println("Nama admin : " + entity07256.getNama07256());
                System.out.println("Id admin : " + entity07256.getId07256());
            }
        }
    }
}
