package entity07256;

public class AdminEntity07256 extends EntityAbstract07256{
    private String id07256, pass07256;

    public AdminEntity07256(){}

    public AdminEntity07256(String id07256, String pass07256) {
        this.id07256 = id07256;
        this.pass07256 = pass07256;
    }

    public AdminEntity07256(String nama07256, String id07256, String pass07256) {
        super(nama07256);
        this.id07256 = id07256;
        this.pass07256 = pass07256;
    }

    public String getId07256() {
        return id07256;
    }

    public void setId07256(String id07256) {
        this.id07256 = id07256;
    }

    public String getPass07256() {
        return pass07256;
    }

    public void setPass07256(String pass07256) {
        this.pass07256 = pass07256;
    }
}
