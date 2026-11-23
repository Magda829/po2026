package agh.po.symulator;

public class Sprzeglo extends Komponent {
    protected boolean stanSprzegla;

    public Sprzeglo(boolean stanSprzegla) {
        this.stanSprzegla = stanSprzegla;
    }

    public void wciśnij() {
        stanSprzegla = true;
    }

    public void zwolnij() {
        stanSprzegla = false;
    }

}

