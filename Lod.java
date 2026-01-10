public class Lod {
    private String zvuk;
    private double cena;
    private boolean naVode;
    
    public Lod(String zvuk, double cena) {
        setZvuk(zvuk);
        setCena(cena);
        this.naVode = false; // Loď je na začiatku mimo vody
    }
    
    public String getZvuk() {
        return zvuk;
    }
    
    public double getCena() {
        return cena;
    }
    
    public boolean isNaVode() {
        return naVode;
    }
    
    public void setZvuk(String zvuk) {
        if (zvuk == null || zvuk.equals("")) {
            System.out.println("Zvuk lode nemoze byt prazdny");
            this.zvuk = "tuu-tuu";
        } else {
            this.zvuk = zvuk;
        }
    }
    
    public void setCena(double cena) {
        if (cena < 0) {
            System.out.println("Cena lode nemoze byt zaporna");
        } else {
            this.cena = cena;
        }
    }
    
    public void setNaVode(boolean naVode) {
        this.naVode = naVode;
    }
    
    public void vydajZvuk() {
        System.out.print(zvuk + " ");
    }
    
    @Override
    public String toString() {
        return "Lod [zvuk=" + zvuk + ", cena=" + cena + ", naVode=" + naVode + "]";
    }
}
