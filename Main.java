import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    private static double pocetHodinVystupenia = 2; // Počet hodín vystúpenia
    
    public static void setPocetHodinVystupenia(double pocetHodin) {
        if (pocetHodin < 0) {
            System.out.println("Počet hodín vystúpenia nemôže byť záporný");
        } else {
            pocetHodinVystupenia = pocetHodin;
        }
    }
    
    public static void main(String[] args) throws IOException {
        ArrayList<Nastroj> nastrojList = new ArrayList<>();
        ArrayList<Hrac> hracList = new ArrayList<>();
        ArrayList<String> nazvyNastrojov = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("OPGorchester/skladNastrojov.txt"), "UTF-8"))) { //aby sa to citalo v UTF-8
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                
                try {
                    if (data[0].equals("u")) {
                        hracList.add(new Hrac(data));
                        nazvyNastrojov.add(data[3]); 
                    } else if (data[0].equals("s")) {
                        nastrojList.add(new StrunovyNastroj(data));
                    } else if (data[0].equals("n")) {
                        nastrojList.add(new Nastroj(data));
                    } else if (data[0].equals("r")) {
                        nastrojList.add(new RytmickyNastroj(data));
                    } else if (data[0].equals("d")) {
                        nastrojList.add(new DychovyNastroj(data));
                    } else if (data[0].equals("k")) {
                        nastrojList.add(new KlavesovyNastroj(data));
                    } else if (data[0].equals("S")) {
                        nastrojList.add(new SlacikovyNastroj(data));
                    }
                } catch (Exception e) {
                    System.out.println("Bola nájdená chyba pri: " + line);
                }
            }
        }
        
        //Priradenie nastrojov hracom
        for (int i = 0; i < hracList.size(); i++) {
            Hrac hrac = hracList.get(i);
            String hladanyNazov = nazvyNastrojov.get(i);
            
            for (Nastroj nastroj : nastrojList) {
                if (nastroj instanceof SlacikovyNastroj) {
                    SlacikovyNastroj slacikovy = (SlacikovyNastroj) nastroj;
                    if (slacikovy.getSekcia().equals(hladanyNazov)) {
                        hrac.setNastroje(nastroj);
                        break;
                    }
                } else {
                    if (nastroj.getDruh().equals(hladanyNazov)) {
                        hrac.setNastroje(nastroj);
                        break; 
                    }
                }
            }
        }
        

        System.out.println("---Zoznam hráčov---");
        for (Hrac hrac : hracList) {
            System.out.println(hrac.getMeno() + " " + hrac.getPriezvisko());
        }
        
        
        System.out.println("\n---Databáza nástrojov---");
        for (Nastroj nastroj : nastrojList) {
            System.out.println("Druh: " + nastroj.getDruh() + ", Počet: " + nastroj.getPocet() + ", Cena: " + nastroj.getCena());
        }
        
        double celkovaCena = 0;
        for (Nastroj nastroj : nastrojList) {
            celkovaCena += nastroj.getPocet() * nastroj.getCena();
        }
        System.out.println("Celková cena skladu: " + celkovaCena);
        
        System.out.println("\n---Sklad hraj---");
        for (Nastroj nastroj : nastrojList) {
            for (int i = 0; i < nastroj.getPocet(); i++) {
                System.out.print(nastroj.getZvuk() + " ");
            }
        }
        System.out.println();
        
        // Vytvorenie Lode
        Lod lod = new Lod("hrrr-hrrr", 10000);
        
        // Hromadný výpis Akord
        System.out.println("\n---Akord---");
        for (Nastroj nastroj : nastrojList) {
            System.out.print(nastroj.getZvuk() + " ");
        }
        lod.vydajZvuk();
        System.out.println();
        
        // Hromadný výpis "Obsadenie orchestra" - Hráč – nástroj
        System.out.println("\n---Obsadenie orchestra---");
        for (Hrac hrac : hracList) {
            String nazovNastroja = hrac.getNastroje() != null ? hrac.getNastroje().getDruh() : "žiadny";
            System.out.println(hrac.getMeno() + " " + hrac.getPriezvisko() + " – " + nazovNastroja);
        }
        
        // Hromadný výpis "Orchester hraj"
        System.out.println("\n---Orchester hraj---");
        for (Hrac hrac : hracList) {
            if (hrac.getNastroje() != null) {
                System.out.print(hrac.getNastroje().getZvuk() + " ");
            }
        }
        System.out.println();
        
        // Krst lode
        System.out.println("\n---Krst lode---");
        for (Hrac hrac : hracList) {
            if (hrac.getNastroje() != null) {
                System.out.print(hrac.getNastroje().getZvuk() + " ");
            }
        }
        lod.vydajZvuk();
        lod.setNaVode(true);
        System.out.println();
        
        // Výpis "Cena vystúpenia"
        double sucetHodinovychSadziebHracov = 0;
        for (Hrac hrac : hracList) {
            sucetHodinovychSadziebHracov += hrac.getHodinovaSadzba();
        }
        double cenaVystupenia = pocetHodinVystupenia * sucetHodinovychSadziebHracov;
        System.out.println("\n---Cena vystúpenia---");
        System.out.println(cenaVystupenia + " (Počet hodín vystúpenia: " + pocetHodinVystupenia + " × Súčet hodinových sadzieb hráčov: " + sucetHodinovychSadziebHracov + ")");
        
        // Hromadná služba "Náklady vystúpenia" - súčet hodinových honorárov hudobníkov a odpisov nástrojov (2% z ceny nástroja)
        double sucetHodinovychSadzieb = 0;
        double odpisyNastrojov = 0;
        
        // Súčet hodinových sadzieb hudobníkov
        for (Hrac hrac : hracList) {
            sucetHodinovychSadzieb += hrac.getHodinovaSadzba();
        }
        
        // Odpisy nástrojov (2% z ceny nástroja za opotrebenie)
        for (Nastroj nastroj : nastrojList) {
            odpisyNastrojov += nastroj.getPocet() * nastroj.getCena() * 0.02;
        }
        
        // Náklady vystúpenia = (počet hodín * súčet hodinových sadzieb) + (odpisy nástrojov * počet hodín)
        double honorare = pocetHodinVystupenia * sucetHodinovychSadzieb;
        double odpisy = odpisyNastrojov * pocetHodinVystupenia;
        double nakladyVystupenia = honorare + odpisy;
        
        System.out.println("\n---Náklady vystúpenia---");
        System.out.println("Honoráre hudobníkov: " + honorare + " (Počet hodín: " + pocetHodinVystupenia + " × Súčet hodinových sadzieb: " + sucetHodinovychSadzieb + ")");
        System.out.println("Odpisy nástrojov: " + odpisy + " (2% z ceny nástrojov × Počet hodín: " + pocetHodinVystupenia + ")");
        System.out.println("Celkové náklady vystúpenia: " + nakladyVystupenia);
    }
}
