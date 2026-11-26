package agh.po.symulator;

public class Samochod {
    protected boolean stanWlaczenia;
    protected String nrRejst;
    protected String model;
    protected int maxV;

    Silnik silnik = new Silnik(8000, 1000);
    SkrzyniaBiegow skrzynia = new SkrzyniaBiegow();

    public static void main(String[] args) {
    }

    public void wlacz() {
        silnik.uruchom();
    }

    public void wylacz() {
        silnik.zatrzymaj();
        skrzynia.aktualnyBieg = 0;
    }

}

