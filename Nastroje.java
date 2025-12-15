package OPGorchester;

public class Nastroje implements Saveable {
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
    public Nastroje(String[] params) {
        load(params);
    }
    @Override
    public void load(String[] data) {
        druh = data[1];
        zvuk = data[3];
        cena = Double.parseDouble(data[2]);
        pocet = Integer.parseInt(data[4]);
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

    @Override 
    public String save() {
        return "";
    } 
    
}