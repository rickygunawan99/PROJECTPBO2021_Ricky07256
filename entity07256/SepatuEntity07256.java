package entity07256;

public class SepatuEntity07256 extends EntityAbstract07256{
    private int stock07256;

    public SepatuEntity07256(){}

    public SepatuEntity07256(int stock07256) {
        this.stock07256 = stock07256;
    }

    public SepatuEntity07256(String nama07256, int stock07256) {
        super(nama07256);
        this.stock07256 = stock07256;
    }

    public int getStock07256() {
        return stock07256;
    }

    public void setStock07256(int stock07256) {
        this.stock07256 = stock07256;
    }
}
