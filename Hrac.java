package OPGorchester;

public class Hrac{
    private String meno;
    private String priezvisko;
    private Nastroje nastroje;
    private int hodinovaSadzba;
    public Hrac(String meno, String priezvisko, Nastroje nastroje, int hodinovaSadzba){
        setMeno(meno);
        setPriezvisko(priezvisko);
        setNastroje(nastroje);
        setHodinovaSadzba(hodinovaSadzba);
    }
    public String getMeno() {
        return meno;
    }
    public String getPriezvisko() {
        return priezvisko;
    }
    public Nastroje getNastroje() {
        return nastroje;
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
    public void setNastroje(Nastroje nastroje) {
        this.nastroje = nastroje;
    }
    public void setHodinovaSadzba(int hodinovaSadzba) {
        this.hodinovaSadzba = hodinovaSadzba;
    }
    @Override
    public String toString() {
        return "Hrac [meno=" + meno + ", priezvisko=" + priezvisko + ", nastroje=" + nastroje.toString() + ", hodinovaSadzba=" + hodinovaSadzba + "]";
    }
}
