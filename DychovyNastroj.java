package OPGorchester;

<<<<<<< HEAD
public class DychovyNastroj extends Nastroje {
    private int pocetDier;
    private String ladenie;
    public DychovyNastroj(String druh, double cena, String zvuk, int pocet, int pocetDier, String ladenie) {
        super(druh, cena, zvuk, pocet);
        setPocetDier(pocetDier);
        setLadenie(ladenie);
    }

    public String getLadenie() {
        return ladenie;
    }
    public int getPocetDier(){
        return pocetDier;
    }

    public void setLadenie(String ladenie) {
        if (ladenie == "") {
            System.out.println("Nemoze byt prazdne");
        }
        else {
            this.ladenie = ladenie;
        }
    }

    public void setPocetDier(int pocetDier) {
        if (pocetDier > 0) {
            this.pocetDier = pocetDier;
        }
        else { 
            System.out.println("Musi byt najmenej 1");
        }
    }

    @Override
    public String toString() {
        return "DychovyNastroj [" + super.toString() + ", pocetDier=" + pocetDier + ", ladenie=" + ladenie + "]";
=======
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
>>>>>>> 8d7776dd215eddb892ddddce02b3e0e2b38e75f7
    }
}
