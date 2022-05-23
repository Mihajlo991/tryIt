package com.bootcamp.vezba;
/*Kreirati klasu RekreativniPlaninar koja pored svega što ima Planinar ima i:
težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg),
naziv okruga odakle je rekreativni planinar
maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
da li će rekreativni planinar uspešno popeti na planinu zavisi da li je
 njegov najveći uspon manji od visine planine, s tim da oprema dodatno otežava penjanje
  i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
rekeativci placaju clanarinu u iznosu od 1000 rsd
metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
Rekreativac, id: id
ime: ime prezime Okrug: okrug*/

public class RekreativniPlaninar extends Planinar {
    private int tezinaOpreme;
    private String okrug;
    private int maxUspon;

    public RekreativniPlaninar(int planinarId, String ime, String prezime, int tezinaOpreme, String okrug, int maxUspon) {
        super(planinarId, ime, prezime);
        if (tezinaOpreme>=0){
        this.tezinaOpreme = tezinaOpreme;}
        else {
            System.out.println("Nevalidan unos!");}
        this.okrug = okrug;
        if (maxUspon > 0) {
            this.maxUspon = maxUspon - (50 * tezinaOpreme);
        } else {
            System.out.println("Nevalidan unos!");}

    }



    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(int tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    public String getOkrug() {
        return okrug;
    }

    public void setOkrug(String okrug) {
        this.okrug = okrug;
    }

    public int getMaxUspon() {
        return maxUspon;
    }

    public void setMaxUspon(int maxUspon) {
        this.maxUspon = maxUspon;
    }


    @Override
    public void stampaj() {
        System.out.println("Rekreativac id " + getPlaninarId() + " " + getIme() + " " + getPrezime() + " " + this.okrug);

    }

    @Override
    public int clanarina() {
        int clanarina = 1000;
        return clanarina;

    }

    @Override
    public void uspesanUspon(int visina) {
        if (this.maxUspon > visina) {
            stampaj();
            System.out.println(" ce preci uspon.");
        } else {
            stampaj();
            System.out.println("nece preci uspon");
        }

    }


    @Override
    public String toString() {
        return "Rekreativac id " + getPlaninarId() + " " + getIme() + " " + getPrezime() + " " + okrug;
    }
}
