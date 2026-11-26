package agh.po.symulator;

public class Sprzeglo extends Komponent {
    protected boolean stanSprzegla;

    public Sprzeglo() {}

    public Sprzeglo(boolean stanSprzegla) {
        this.stanSprzegla = stanSprzegla;
    }

    public void wcisnij() {
        stanSprzegla = true;
    }

    public void zwolnij() {
        stanSprzegla = false;
    }

}

