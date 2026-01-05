public class StrunovyNastroj extends Nastroj {
    private int pocetStrun;
    private String ladenie;
    public StrunovyNastroj(String druh, double cena, String zvuk, int pocet, int pocetStrun, String ladenie) {
        super(druh, cena, zvuk, pocet);
        setPocetStrun(pocetStrun);
        setLadenie(ladenie);
    }
    public StrunovyNastroj(String[] data) {
        super(data);
    }

    public int getPocetStrun() { // oprava
        return pocetStrun;
    }

    public String getLadenie() {
        return ladenie;
    }
    
    public void setPocetStrun(int pocetStrun) {
        if (pocetStrun > 0) {
            this.pocetStrun = pocetStrun;
        } else {
            System.out.println("Nemoze byt mensie ako 1");
        }
    }

    public void setLadenie(String ladenie) {
        if (ladenie.equals("")) {
            System.out.println("Nemoze byt prazdny");
        } else {
            this.ladenie = ladenie;
        }
    }

    @Override
    public String toString() {
        return "StrunovyNastroj [" + super.toString() + ", pocetStrun=" + pocetStrun + ", ladenie=" + ladenie + "]";
    }

    @Override
    public void load(String[] data) {
        super.load(data);
        setPocetStrun(Integer.parseInt(data[5]));
        setLadenie(data[6]);
    }
}
