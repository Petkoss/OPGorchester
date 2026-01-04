public class Hrac implements Saveable {
    private String meno;
    private String priezvisko;
    private Nastroj nastroje;
    private int hodinovaSadzba;
    public Hrac(String meno, String priezvisko, Nastroj nastroje, int hodinovaSadzba){
        setMeno(meno);
        setPriezvisko(priezvisko);
        setNastroje(nastroje);
        setHodinovaSadzba(hodinovaSadzba);
    }
    public Hrac(String[] params){
        load(params);
    }
    public String getMeno() {
        return meno;
    }
    public String getPriezvisko() {
        return priezvisko;
    }
    public Nastroj getNastroje() {
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
    public void setNastroje(Nastroj nastroje) {
        this.nastroje = nastroje;
    }
    public void setHodinovaSadzba(int hodinovaSadzba) {
        this.hodinovaSadzba = hodinovaSadzba;
    }
    @Override
    public String toString() {
        return "Hrac [meno=" + meno + ", priezvisko=" + priezvisko + ", nastroje=" + nastroje.toString() + ", hodinovaSadzba=" + hodinovaSadzba + "]";
    }

    @Override
    public void load(String[] data) {
        meno = data[1];
        priezvisko = data[2];
        nastroje = null; 
        hodinovaSadzba = Integer.parseInt(data[4]);

    }
    @Override
    public String save() {
        return "u," + meno + "," + priezvisko + "," + (nastroje != null ? nastroje.getDruh() : "") + "," + hodinovaSadzba;
    }
}
