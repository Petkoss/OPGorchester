package OPGorchester;

public class StrunovyNastroj {
    public int pocetStrun;
    public String ladenie;

    public StrunovyNastroj(int pocetStrun, String ladenie){
        setPocetStrun(pocetStrun);
        setLadenie(ladenie);
    }
    public int getPocetStrun() {
        return pocetStrun;
    }

    public String getLadenie() {
        return ladenie;
    }

    public void setPocetStrun(int pocetStrun) {
        this.pocetStrun = pocetStrun;
    }

    public void setLadenie(String ladenie) {
        this.ladenie = ladenie;
    }

    @Override
    public String toString() {
        return "StrunovyNastroj [pocetStrun=" + pocetStrun + ", ladenie=" + ladenie + "]";
    }
}