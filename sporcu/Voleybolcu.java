public class Voleybolcu extends Sporcu {

    private int maas;
    private String kulup;
    private int basari;

    public void bilgi(int maas, String kulup, int basari) {
        isimBelirle("Voleybolcu");
        this.maas = maas;
        this.kulup = kulup;
        this.basari = basari;
    }

    @Override
    public int maas() {
        return (maas);
    }

    @Override
    public String kulup() {

        return (kulup);
    }

    @Override
    public int basari() {
        return (basari);
    }
}
