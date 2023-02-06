
public class LiseKitabi extends DersKitabi {

    int fiyat;

    public LiseKitabi(String isim, String konu, int ilkFiyat) {
        super(isim, konu);
        fiyat = ilkFiyat;
    }

    public void reset(String yeniIsim, String yeniKonu, int yeniFiyat) {

        reset(yeniIsim, yeniKonu);
        setFiyat(fiyat);
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int yeniFiyat) {
        fiyat = yeniFiyat;
    }

    public void ciktiyaz() {
        super.ciktiyaz();
        System.out.println(
                " Fiyat: " + fiyat + "\n----------------------------------------------------------------------");
    }

}