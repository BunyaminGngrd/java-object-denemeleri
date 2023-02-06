public abstract class Sporcu {

    private String isim;

    public void isimBelirle(String isim) {

        this.isim = isim;

    }

    public String isimGetir() {

        return this.isim;
    }

    public abstract int maas();

    public abstract String kulup();

    public abstract int basari();

}
