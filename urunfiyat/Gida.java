package urunfiyat;

public class Gida extends Urun {
    String tur;
    int gramaj;

    public Gida(String urunAd, Double fiyat, String tur, int gramaj) {

        super(urunAd, fiyat);

        this.tur = tur;
        this.gramaj = gramaj;

    }

    @Override
    public Double kdv(Double kdv) {
        this.kdv = kdv;
        yeniFiyat = gramaj * fiyat + (fiyat * this.kdv);
        return (yeniFiyat);

    }

    @Override
    public void yazdir() {

        System.out.println("\nAdı:" + " " + urunAd + "\nFiyatı:" + "" + yeniFiyat);
        System.out.println("Türü:" + " " + tur + "\nGramajı:" + "" + gramaj);

    }

}
