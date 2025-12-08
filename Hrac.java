package OPGorchester;

public class Hrac{
    public String meno;
    public String priezvisko;
    public String nastroj;
    public int hodinovaSadzba;
    public Hrac(String meno, String priezvisko, String nastroj, int hodinovaSadzba){
        setMeno(meno);
        setPriezvisko(priezvisko);
        setNastroj(nastroj);
        setHodinovaSadzba(hodinovaSadzba);
    }
    public String getMeno() {
        return meno;
    }
    public String getPriezvisko() {
        return priezvisko;
    }
    public String getNastroj() {
        return nastroj;
    }
    public int getHodinovaSadzba() {
        return hodinovaSadzba;
    }
    public void setMeno(String meno) {
        this.meno = meno;
    }
    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }
    public void setNastroj(String nastroj) {
        this.nastroj = nastroj;
    }
    public void setHodinovaSadzba(int hodinovaSadzba) {
        this.hodinovaSadzba = hodinovaSadzba;
    }
    @Override
    public String toString() {
        return "Hrac [meno=" + meno + ", priezvisko=" + priezvisko + ", nastroj=" + nastroj + ", hodinovaSadzba=" + hodinovaSadzba + "]";
    }
}
