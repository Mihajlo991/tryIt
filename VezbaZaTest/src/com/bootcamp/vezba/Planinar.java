package com.bootcamp.vezba;

/*Kreirati klasu Planinar kog opisuju jedinstveni celobrojni identifikacioni broj, ime i prezime.
        Svi podaci smeju da se dohvate, ali ne i postave mimo konstruktora koji postavlja sve attribute klase.
        Pored toga, klasa ima:
        apstraktnu metodu štampaj
        apstraktnu metodu koja vraca clanarinu planinara
        apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu.
        Metoda kao ulazni parametar prima objekat tipa Planina.
*/
public abstract class Planinar {
    private static int planinarId;
    private static String ime;
    private static String prezime;

    public abstract void stampaj();

    public abstract int clanarina();

    public abstract void uspesanUspon(int visina);

    public Planinar(int planinarId, String ime, String prezime) {
        this.planinarId = planinarId;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getPlaninarId() {
        return planinarId;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    @Override
    public String toString() {
        return "Planinar{" +
                "planinarId=" + planinarId +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }
}
