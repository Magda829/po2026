package agh.po.symulator;

public class Silnik extends Komponent {
    protected int maxObroty;
    protected int obroty;

    public Silnik(int maxObroty, int obroty) {
        this.maxObroty = maxObroty;
        this.obroty = obroty;
    }

    public void uruchom() {
        obroty = 1000;
    }

    public void zatrzymaj() {
        obroty = 0;
    }

    public void zwiekszObroty() {
        obroty =+ 100;
    }

    public void zmniejszObroty() {
        obroty =- 100;
    }

}

