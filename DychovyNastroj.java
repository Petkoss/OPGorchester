public class DychovyNastroj extends Nastroj {
    private int pocetDier;
    private String ladenie;
    public DychovyNastroj(String druh, double cena, String zvuk, int pocet, int pocetDier, String ladenie) {
        super(druh, cena, zvuk, pocet);
        setPocetDier(pocetDier);
        setLadenie(ladenie);
    }
    public DychovyNastroj(String[] data) {
        super(data);
        load(data);
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
    }
    
    @Override
    public void load(String[] data) {
        super.load(data);
        pocetDier = Integer.parseInt(data[5]);
        ladenie = data[6];
    }
}
