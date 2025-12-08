package Orchester;

public class Nastroje {
    private String druh;
    private double cena;
    private String zvuk;
    private int pocet;

    public Nastroje(String druh, double cena, String zvuk, int pocet) {
        setDruh(druh);
        setCena(cena);
        setZvuk(zvuk);
        setPocet(pocet);
    }

    public String getDruh() {
        return druh;
    }

    public double getCena() {
        return cena;
    }

    public String getZvuk() {
        return zvuk;
    }

    public int getPocet() {
        return pocet;
    }

    public void setDruh(String druh) {
        this.druh = druh;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setZvuk(String zvuk) {
        this.zvuk = zvuk;
    }
    
    public void setPocet(int pocet) {
        this.pocet = pocet;
    }

    @Override
    public String toString() {
        return "Nastroje [druh=" + druh + ", cena=" + cena + ", zvuk=" + zvuk + ", pocet=" + pocet + "]";
    }
}