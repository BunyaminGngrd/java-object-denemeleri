package alancevre;

public class Daire implements Sekil {

    double alan;
    double cevre;
    double pi = 3.14;
    double yarıcap;

    public Daire(double yarıcap) {
        this.yarıcap = yarıcap;

    }

    @Override
    public void alanHesap() {

        this.alan = pi * yarıcap * yarıcap;

    }

    @Override
    public void cevreHesap() {

        this.cevre = 2 * pi * yarıcap;

    }

    @Override
    public void yazdir() {

        System.out.println("Dairenin alanı: " + this.alan);
        System.out.println("Dairenin çevresi: " + this.cevre + "\n");

    }

}
