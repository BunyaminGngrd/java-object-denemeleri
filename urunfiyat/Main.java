package urunfiyat;

public class Main {
    public static void main(String[] args) {

        Tekstil teks = new Tekstil("Tekstil", 45.0, "Lcw", "Kazak");
        teks.kdv(0.18);
        teks.yazdir();

        Teknoloji tekno = new Teknoloji("Teknoloji", 500.0, "Lenovo", "Laptop");
        tekno.kdv(0.18);
        tekno.yazdir();

        Gida gidaa = new Gida("Gida", 2.0, "Elma", 3);
        gidaa.kdv(0.18);
        gidaa.yazdir();

    }
}
