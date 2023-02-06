package alancevre;

public class Ucgen implements Sekil {

    double alan;
    double cevre;
    double kenar1;
    double kenar2;
    double taban;
    double yukseklik;

    public Ucgen(double kenar1, double kenar2, double taban, double yukseklik) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.taban = taban;
        this.yukseklik = yukseklik;

    }

    @Override
    public void alanHesap() {

        this.alan = taban * yukseklik / 2;

    }

    @Override
    public void cevreHesap() {

        this.cevre = kenar1 + kenar2 + taban;

    }

    @Override
    public void yazdir() {

        System.out.println("Üçgenin alanı: " + this.alan);
        System.out.println("Üçgenin çevresi: " + this.cevre + "\n");

    }

}
