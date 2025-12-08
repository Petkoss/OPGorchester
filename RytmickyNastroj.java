package OPGorchester;

public class RytmickyNastroj extends Nastroje{
    private int pocetZvukov;

    public RytmickyNastroj(String druh, double cena, String zvuk, int pocet, int pocetZvukov){
        super(druh, cena, zvuk, pocet);
        setPocetZvukov(pocetZvukov);
    }
    public int getPocetZvukov() {
        return pocetZvukov;
    }
    public void setPocetZvukov(int pocetZvukov) {
        this.pocetZvukov = pocetZvukov;
    }
    @Override
    public String toString() {
        return "RytmickyNastroj [pocetZvukov=" + pocetZvukov + "]";
    }
}
