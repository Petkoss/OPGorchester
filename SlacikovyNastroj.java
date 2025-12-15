package OPGorchester;

public class SlacikovyNastroj extends Nastroj {
    private String sekcia;

    public SlacikovyNastroj(String druh, double cena, String zvuk, int pocet, String sekcia) {
        super(druh, cena, zvuk, pocet);
        setSekcia(sekcia);
    }

    public String getSekcia() {
        return sekcia;
    }

    public void setSekcia(String sekcia) {
        this.sekcia = sekcia;
    }

    @Override
    public String toString() {
        return "SlacikovyNastroj [" + super.toString() + ", sekcia=" + sekcia + "]";
    }
}
