package com.bootcamp.vezba;
///*Kreirati klasu Planina koju opisuju ime planine, naziv države u kojoj se nalazi i visina planine.
// Klasa mora imati konstruktore i getere i setere.
public class Planina {

    private String ime;
    private String imeDrzave;
    private int visinaPlanine;

    public Planina() {
    }

    public Planina(String ime, String imeDrzave, int visinaPlanine) {
        this.ime = ime;
        this.imeDrzave = imeDrzave;
        if (this.visinaPlanine > 0) {
            this.visinaPlanine = visinaPlanine;
        } else {
            System.err.println("Nepravilan unos!");
        }
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getImeDrzave() {
        return imeDrzave;
    }

    public void setImeDrzave(String imeDrzave) {
        this.imeDrzave = imeDrzave;
    }

    public int getVisinaPlanine() {
        return visinaPlanine;
    }

    public void setVisinaPlanine(int visinaPlanine) {
        this.visinaPlanine = visinaPlanine;
    }

    @Override
    public String toString() {
        return "Planina{" +
                "ime='" + ime + '\'' +
                ", imeDrzave='" + imeDrzave + '\'' +
                ", visinaPlanine=" + visinaPlanine +
                '}';
    }
}
