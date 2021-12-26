package Controller07256;

import Entites07256.SepatuEntity07256;
import Model07256.SepatuModel07256;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Objects;

public class SepatuController07256 extends Controller {

    public ArrayList<SepatuEntity07256> getSepatu07256(){
        return Objects.requireNonNull(model(SepatuModel07256.class)).getSepatu07256();
    }

    public SepatuEntity07256 getSepatu07256(int id){
        return Objects.requireNonNull(model(SepatuModel07256.class)).getSepatu07256(id);
    }

    public int createSepatu07256(SepatuEntity07256 sepatu){
        return Objects.requireNonNull(model(SepatuModel07256.class)).createSepatu07256(sepatu);
    }

    public int updateSepatu07256(int id, String sepatu){
        return Objects.requireNonNull(model(SepatuModel07256.class)).updateSepatu07256(id,sepatu);
    }

    public int updateSepatu07256(int id, int stock){
        return Objects.requireNonNull(model(SepatuModel07256.class)).updateSepatu07256(id,stock);
    }

    public int deleteSepatu07256(int id){
        return Objects.requireNonNull(model(SepatuModel07256.class)).deleteSepatu07256(id);
    }
}
