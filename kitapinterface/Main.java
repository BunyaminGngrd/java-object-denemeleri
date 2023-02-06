public class Main {

    public static void main(String[] args) {

        BilimKurgu bilim = new BilimKurgu();
        Macera macera = new Macera();
        Polisiye polisiye = new Polisiye();

        bilim.tur("BilimKurgu");
        bilim.yazar("J. R. R. Tolkien");
        bilim.fiyat(60);
        bilim.yazdir();

        polisiye.tur("Polisiye");
        polisiye.yazar("Arthur Conan Doyle");
        polisiye.fiyat(85);
        polisiye.yazdir();

        macera.tur("Macera");
        macera.yazar("William Golding");
        macera.fiyat(75);
        macera.yazdir();

    }
}
