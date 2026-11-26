package agh.po.symulator;

public class Pozycja {
    protected double x;
    protected double y;

    public Pozycja(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void aktualizujPozycję(double deltaX, double deltaY) {
        x += deltaX;
        y += deltaY;
    }

    public String getPozycja() {
        return "Aktualna pozycja to (" + x + ", " + y + ")";
    }

}

