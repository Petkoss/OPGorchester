package OPGorchester;

public class DychovyNastroj {
    int pocetDier;
    String ladenie;

    public DychovyNastroj(int pocetDier, String ladenie){
        setPocetDier(pocetDier);
        setLadenie(ladenie);
    }
    public int getPocetDier() {
        return pocetDier;
    }
    public String getLadenie() {
        return ladenie;
    }
    public void setPocetDier(int pocetDier) {
        this.pocetDier = pocetDier;
    }
    public void setLadenie(String ladenie) {
        this.ladenie = ladenie;
    }
    @Override
    public String toString() {
        return "DychovyNastroj [pocetDier=" + pocetDier + ", ladenie=" + ladenie + "]";
    }
}
