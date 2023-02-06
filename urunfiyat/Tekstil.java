package urunfiyat;

public class Tekstil extends Urun {
    String urunBeden;
    String tur;
    
    
public Tekstil(String urunAd, Double fiyat, String urunBeden, String tur){

super(urunAd, fiyat);

this.urunBeden=urunBeden;
this.tur=tur;
}
@Override
public Double kdv(Double kdv){
    this.kdv=kdv;
    yeniFiyat=fiyat+(fiyat*this.kdv);
    return (yeniFiyat);
    
    }
@Override
    public void yazdir(){

        System.out.println("\nAdı:"+" "+urunAd+"\nFiyatı:"+" "+yeniFiyat);
        System.out.println("Bedeni:"+" "+urunBeden+"\nTürü:"+" "+tur);
        }
}
