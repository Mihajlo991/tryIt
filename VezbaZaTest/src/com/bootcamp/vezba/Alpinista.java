package com.bootcamp.vezba;
/*Kreirati klasu Alpinista koji dodatno pamti koliko poena je alpinista ostvario (celobrojna vrednost)
i poeni se mogu menjati kroz adekvatnu metodu. Alpinista može da savlada sve uspone do 4000 metara,
placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50,
 a informacije o alpinisti se ispisuju u formatu:
Alpinista, id: id
ime: ime i prezime
Broj poena: poeni*/

public class Alpinista extends Planinar {

    private int brojPoena;
    private int maxUspon = 4000;

    public Alpinista(int planinarId, String ime, String prezime, int brojPoena) {
        super(planinarId, ime, prezime);
        if (this.brojPoena >= 0) {
            this.brojPoena = brojPoena;
        } else {
            System.err.println("Nevalidan unos");
        }
    }

    public Alpinista(int planinarId, String ime, String prezime) {
        super(planinarId, ime, prezime);
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }

    public int getMaxUspon() {
        return maxUspon;
    }

    @Override
    public void stampaj() {
        System.out.println("Alpinista id " + getPlaninarId() + " " + getIme() + " " + getPrezime() + " ima "
                + this.brojPoena + " poena");

    }

    @Override
    public int clanarina() {
        return 1500 - (50 * brojPoena);
    }

    @Override
    public void uspesanUspon(int visina) {
        if (this.maxUspon > visina) {
            stampaj();
            System.out.println(" i preci ce uspon.");
        } else {
            stampaj();
            System.out.println(" i nece preci uspon");
        }

    }
}
