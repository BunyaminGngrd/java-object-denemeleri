
public class DersKitabi extends Kitap {

    private String konu;

    public DersKitabi(String isim, String konu) {
        super(isim);
        this.konu = konu;
    }

    public void reset(String yeniIsim, String yeniKonu) {

        setIsim(yeniIsim);
        this.konu = yeniKonu;

    }

    public void setKonu(String yeniKonu) {
        this.konu = yeniKonu;

    }

    public String getKonu() {

        return konu;
    }

    public void ciktiyaz() {
        super.ciktiyaz();
        System.out.println(" Konu: " + konu);
    }

}