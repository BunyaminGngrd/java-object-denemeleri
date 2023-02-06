
public class Main {

    public static void main(String[] args) {

        Kitap ders = new Kitap("Cebir");
        ders.ciktiyaz();

        DersKitabi konu = new DersKitabi("Matematik", "Türev");
        konu.ciktiyaz();

        LiseKitabi fiyat = new LiseKitabi("Kimya", "Organik Kimya", 115);
        fiyat.ciktiyaz();

    }
}
