package urunfiyat;

public class Urun {

    String urunAd;
    Double fiyat;
    Double kdv;
    Double yeniFiyat;

    public Urun(String urunAd, Double fiyat) {

        this.urunAd = urunAd;
        this.fiyat = fiyat;

    }

    public Double kdv(Double kdv) {
        this.kdv = kdv;
        yeniFiyat = fiyat + (fiyat * this.kdv);
        return (yeniFiyat);

    }

    public void yazdir() {

        System.out.println("\nAdı:" + " " + urunAd + "\nFiyatı:" + "" + yeniFiyat);

    }
}
