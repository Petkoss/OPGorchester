import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
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
        System.out.println("\n------");
        System.out.println("Celková cena skladu: " + celkovaCena);
        System.out.println("------");
        
        System.out.println("\n---Sklad hraj---");
        for (Nastroj nastroj : nastrojList) {
            for (int i = 0; i < nastroj.getPocet(); i++) {
                System.out.print(nastroj.getZvuk() + " ");
            }
        }
        System.out.println();
    }
}
