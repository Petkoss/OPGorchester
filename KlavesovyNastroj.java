package OPGorchester;

public class KlavesovyNastroj extends Nastroje{
    private int pocetKlavesov;
    public KlavesovyNastroj(String druh, double cena, String zvuk, int pocet, int pocetKlavesov){
        super(druh, cena, zvuk, pocet);
        setPocetKlavesov(pocetKlavesov);
    }
    public int getPocetKlavesov() {
        return pocetKlavesov;
    }
    public void setPocetKlavesov(int pocetKlavesov) {
        this.pocetKlavesov = pocetKlavesov;
    }
    @Override
    public String toString() {
        return "KlavesovyNastroj [pocetKlavesov=" + pocetKlavesov + "]";
    }
}