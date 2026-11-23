package agh.po.symulator;

public class SkrzyniaBiegow extends Komponent {
    protected int aktualnyBieg;
    protected int iloscBiegow;
    protected int aktualnePrzelozenie;

    public SkrzyniaBiegow(int aktualnyBieg, int iloscBiegow, int aktualnePrzelozenie) {
        this.aktualnyBieg = aktualnyBieg;
        this.iloscBiegow = iloscBiegow;
        this.aktualnePrzelozenie = aktualnePrzelozenie;
    }

    public SkrzyniaBiegow() {}

    public void zwiekszBieg() {
        if (aktualnyBieg < iloscBiegow) {
            aktualnyBieg++;
        }
    }

    public void zmniejszBieg() {
        if (aktualnyBieg > 1) {
            aktualnyBieg--;
        };
    }

    public int getAktBieg() {
        return aktualnyBieg;
    }

    public int getAktPrzelozenie() {
        return aktualnePrzelozenie;
    }
}

