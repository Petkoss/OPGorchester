package OPGorchester;

public class RytmickyNastroj {
    int pocetZvukov;

    public RytmickyNastroj(int pocetZvukov){
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
