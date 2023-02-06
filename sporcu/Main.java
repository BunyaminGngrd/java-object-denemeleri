public class Main {

    public static void main(String[] args) {
        Futbolcu futbol = new Futbolcu();
        futbol.bilgi(500000, "Manchester City", 3);
        System.out.println(futbol.isimGetir());
        System.out.println("Futbolcunun maaşı: " + futbol.maas());
        System.out.println("Futbolcunun kulubü: " + futbol.kulup());
        System.out.println("Futbolcunun başarı sıralaması: " + futbol.basari()
                + "\n-----------------------------------------------------------------");

        Basketbolcu basketbol = new Basketbolcu();
        basketbol.bilgi(25000, "Beşiktaş", 1);
        System.out.println(basketbol.isimGetir());
        System.out.println("Basketbolcunun maaşı: " + basketbol.maas());
        System.out.println("Basketbolcunun kulubü: " + basketbol.kulup());
        System.out.println("Basketbolcunun başarı sıralaması: " + basketbol.basari()
                + "\n-----------------------------------------------------------------");

        Voleybolcu voleybol = new Voleybolcu();
        voleybol.bilgi(1000, "Galatasaray", 4);
        System.out.println(voleybol.isimGetir());
        System.out.println("Voleybolcunun maaşı: " + voleybol.maas());
        System.out.println("Voleybolcunun kulubü: " + voleybol.kulup());
        System.out.println("Voleybolcunun başarı sıralaması: " + voleybol.basari()
                + "\n-----------------------------------------------------------------");
    }
}
