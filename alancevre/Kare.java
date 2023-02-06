package alancevre;

public class Kare implements Sekil {

    double alan;
    double cevre;
    double kenar1;

    public Kare(double kenar1) {
        this.kenar1 = kenar1;

    }

    @Override
    public void alanHesap() {

        this.alan = kenar1 * kenar1;

    }

    @Override
    public void cevreHesap() {

        this.cevre = kenar1 * 4;

    }

    @Override
    public void yazdir() {

        System.out.println("Karenin alanı: " + this.alan);
        System.out.println("Karenin çevresi: " + this.cevre + "\n");

    }

}
