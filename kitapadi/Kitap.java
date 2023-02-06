
public class Kitap {

    private String isim;

    public Kitap(String isim) {
        this.isim = isim;
    }

    public void ciktiyaz() {
        System.out.println("\n----------------------------------------------------------------------\n İsim: " + isim);
    }

    public void setIsim(String isim) {
        this.isim = isim;

    }

    public String getIsim() {
        return isim;

    }
}