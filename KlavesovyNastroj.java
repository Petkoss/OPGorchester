public class KlavesovyNastroj extends Nastroj{
    private int pocetKlavesov;
    public KlavesovyNastroj(String druh, double cena, String zvuk, int pocet, int pocetKlavesov){
        super(druh, cena, zvuk, pocet);
        setPocetKlavesov(pocetKlavesov);
    }
    public KlavesovyNastroj(String[] data) {
        super(data);
        load(data);
    }
    public int getPocetKlavesov() {
        return pocetKlavesov;
    }
    public void setPocetKlavesov(int pocetKlavesov) {
        if (pocetKlavesov > 0) {
            this.pocetKlavesov = pocetKlavesov;
        } else {
            System.out.println("Pocet klavesov musi byt najmenej 1");
        }
    }

    @Override
    public String toString() {
        return "KlavesovyNastroj [" + super.toString() + ", pocetKlavesov=" + pocetKlavesov + "]";
    }
    
    @Override
    public void load(String[] data) {
        super.load(data);
        setPocetKlavesov(Integer.parseInt(data[5]));
    }
}