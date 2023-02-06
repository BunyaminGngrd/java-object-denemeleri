package alancevre;

public class Dikdortgen implements Sekil {

    double alan;
    double cevre;
    double kenar1;
    double kenar2;

    public Dikdortgen(double kenar1, double kenar2) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;

    }

    @Override
    public void alanHesap() {

        this.alan = kenar1 * kenar2;

    }

    @Override
    public void cevreHesap() {

        this.cevre = kenar1 * 2 + kenar2 * 2;

    }

    @Override
    public void yazdir() {

        System.out.println("Dikdörtgenin alanı: " + this.alan);
        System.out.println("Dikdörtgenin çevresi: " + this.cevre + "\n");

    }

}
