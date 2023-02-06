public class Macera implements Kitap {
    int yenifiyat;
    String yenitur;
    String yeniyazar;

    @Override
    public void tur(String yenitur) {
        this.yenitur = yenitur;
    }

    @Override
    public void yazar(String yeniyazar) {
        this.yeniyazar = yeniyazar;
    }

    @Override
    public void fiyat(int yenifiyat) {
        this.yenifiyat = yenifiyat;
    }

    @Override
    public void yazdir() {
        System.out.println(this.yenitur);
        System.out.println(this.yeniyazar);
        System.out.println(this.yenifiyat + "\n");
    }

}
