package com.bootcamp.vezba;

import java.util.ArrayList;

/*Kreirati klasu Planina koju opisuju ime planine, naziv države u kojoj se nalazi i visina planine.
 Klasa mora imati konstruktore i getere i setere.


Kreirati klasu Planinar kog opisuju jedinstveni celobrojni identifikacioni broj, ime i prezime.
Svi podaci smeju da se dohvate, ali ne i postave mimo konstruktora koji postavlja sve attribute klase.
Pored toga, klasa ima:
apstraktnu metodu štampaj
apstraktnu metodu koja vraca clanarinu planinara
apstraktnu metodu uspesanUspon koja ​vraća ​informaciju da li će se planinar upešno popeti na planinu.
Metoda kao ulazni parametar prima objekat tipa Planina.


Kreirati klasu RekreativniPlaninar koja pored svega što ima Planinar ima i:
težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg),
naziv okruga odakle je rekreativni planinar
maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
da li će rekreativni planinar uspešno popeti na planinu zavisi da li je
 njegov najveći uspon manji od visine planine, s tim da oprema dodatno otežava penjanje
  i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
rekeativci placaju clanarinu u iznosu od 1000 rsd
metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
Rekreativac, id: id
ime: ime prezime Okrug: okrug


Kreirati klasu Alpinista koji dodatno pamti koliko poena je alpinista ostvario (celobrojna vrednost)
i poeni se mogu menjati kroz adekvatnu metodu. Alpinista može da savlada sve uspone do 4000 metara,
placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50,
 a informacije o alpinisti se ispisuju u formatu:
Alpinista, id: id
ime: ime i prezime
Broj poena: poeni


Kreirati glavnu klasu I u njoj:
instancirati jednu planinu
napraviti nizili listu koji ce sadrzati najmanje tri rekrativna planinara I tri alpiniste
ispisati podatke o svim planinarima I za svakog od planinara ispisati da li ce se popeti na instanciranu planin
ispisati kolika je zbir svih clanarina planinara iz niza/liste*/
public class Main {

    public static void main(String[] args) {
        Planina planina1 = new Planina("Stara Planina", "Srbija", 1600);
        RekreativniPlaninar rp1 = new RekreativniPlaninar(11, "Mihajlo", "Mihajlovic", 21, "Oregon", 2200);
        RekreativniPlaninar rp2 = new RekreativniPlaninar(112, "Filip", "Mihajlovic", 1, "Oregon", 10000);
        RekreativniPlaninar rp3 = new RekreativniPlaninar(12, "Stefan", "Mihajlovic", 3, "Oregon", 100);
        Alpinista a1 = new Alpinista(123, "Tijana", "Varga", 20);
        Alpinista a2 = new Alpinista(13, "Djura", "Djordjevic", 24);
        Alpinista a3 = new Alpinista(1234, "Isidor", "Bajic", 2);
        ArrayList<Planinar>lista = new ArrayList<>();
        lista.add(rp1);
        lista.add(rp2);
        lista.add(rp3);
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);

        for (Planinar p : lista){

            p.uspesanUspon(planina1.getVisinaPlanine());

        }int suma = 0;
        for(Planinar p : lista){

            suma += p.clanarina();

        }
        System.out.println("Ukupna clanarina je" + suma);
    }
}
