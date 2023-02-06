package urunfiyat;

public class Teknoloji extends Urun {
    String marka;
    String model;
    
public Teknoloji(String urunAd, Double fiyat, String marka, String model){

super(urunAd, fiyat);

this.marka=marka;
this.model=model;

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
        System.out.println("Markası:"+" "+marka+"\nModeli:"+" "+model);
        }

}


