public class RytmickyNastroj extends Nastroj{
    private int pocetZvukov;

    public RytmickyNastroj(String druh, double cena, String zvuk, int pocet, int pocetZvukov){
        super(druh, cena, zvuk, pocet);
        setPocetZvukov(pocetZvukov);
    }
    public RytmickyNastroj(String[] data) {
        super(data);
        load(data);
    }
    public int getPocetZvukov() {
        return pocetZvukov;
    }
    public void setPocetZvukov(int pocetZvukov) {
        if (pocetZvukov > 0) {
            this.pocetZvukov = pocetZvukov;
        } else {
            System.out.println("Pocet zvukov musi byt najmenej 1");
        }
    }
    @Override
    public String toString() {
        return "RytmickyNastroj [" + super.toString() + ", pocetZvukov=" + pocetZvukov + "]";
    }
    
    @Override
    public void load(String[] data) {
        super.load(data);
        setPocetZvukov(Integer.parseInt(data[5]));
    }
}
