package OPGorchester;

<<<<<<< HEAD
public class StrunovyNastroj extends Nastroje {
    int pocetStrun;
    String ladenie;
    public StrunovyNastroj(String druh, double cena, String zvuk, int pocet, int pocetStrun, String ladenie) {
        super(druh, cena, zvuk, pocet);
        this.pocetStrun = pocetStrun;
        this.ladenie = ladenie;
    }

=======
public class StrunovyNastroj {
    public int pocetStrun;
    public String ladenie;

    public StrunovyNastroj(int pocetStrun, String ladenie){
        setPocetStrun(pocetStrun);
        setLadenie(ladenie);
    }
>>>>>>> c595c2dc4e31988c1fc1c7021a23fe0f995885d5
    public int getPocetStrun() {
        return pocetStrun;
    }

    public String getLadenie() {
        return ladenie;
    }
<<<<<<< HEAD
    
    public void setPocetStrun(int pocetStrun) {
        if (pocetStrun > 0) {
            this.pocetStrun = pocetStrun;
        } else {
            System.out.println("Nemoze byt mensie ako 1");
        }
    }

    public void setLadenie(String ladenie) {
        if (ladenie == "") {
            System.out.println("Nemoze byt prazdny");;
        } else {
            this.ladenie = ladenie;
        }
=======

    public void setPocetStrun(int pocetStrun) {
        this.pocetStrun = pocetStrun;
    }

    public void setLadenie(String ladenie) {
        this.ladenie = ladenie;
>>>>>>> c595c2dc4e31988c1fc1c7021a23fe0f995885d5
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "StrunovyNastroj [" + super.toString() + ", pocetStrun=" + pocetStrun + ", ladenie=" + ladenie + "]";
    }
}
=======
        return "StrunovyNastroj [pocetStrun=" + pocetStrun + ", ladenie=" + ladenie + "]";
    }
}
>>>>>>> c595c2dc4e31988c1fc1c7021a23fe0f995885d5
