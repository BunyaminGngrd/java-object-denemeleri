package alancevre;

public class Main {
    

    public static void main(String[] args) {
        
        Ucgen ucgenn=new Ucgen(9.0, 8.0, 13.0, 27.0);
        ucgenn.alanHesap();
        ucgenn.cevreHesap();

        Kare karee=new Kare(5.0);
        karee.alanHesap();
        karee.cevreHesap();

        Dikdortgen dikdortgenn=new Dikdortgen(6.0, 14.6);
        dikdortgenn.alanHesap();
        dikdortgenn.cevreHesap();

        Daire dairee=new Daire(7.0);
        dairee.alanHesap();
        dairee.cevreHesap();

        ucgenn.yazdir();
        karee.yazdir();
        dikdortgenn.yazdir();
        dairee.yazdir();

    }
}

