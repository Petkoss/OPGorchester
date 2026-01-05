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
        
        for (int i = 0; i < hracList.size(); i++) {
            Hrac hrac = hracList.get(i);
            String hladanyNazov = nazvyNastrojov.get(i);
            
            for (Nastroj nastroj : nastrojList) {
                if (nastroj instanceof SlacikovyNastroj) {
                    SlacikovyNastroj slacikovy = (SlacikovyNastroj) nastroj;
                    if (slacikovy.getSekcia().equals(hladanyNazov)) {
                        hrac.setNastroje(nastroj);
                    } // lebo len slacikovynastroj ma getSekcia() ostatne maju getDruh()
                } else {
                    if (nastroj.getDruh().equals(hladanyNazov)) {
                        hrac.setNastroje(nastroj);
                    }
                }
            }
        }
        
        System.out.println("--- NÁSTROJE ---");
        for (Nastroj nastroj : nastrojList) {
            System.out.println(nastroj);
        }
        
        System.out.println("\n--- HRÁČI ---");
        for (int i = 0; i < hracList.size(); i++) {
            Hrac hrac = hracList.get(i);
            System.out.println("Hráč: " + hrac.getMeno() + " " + hrac.getPriezvisko());
            if (hrac.getNastroje() != null) {
                System.out.println("Nástroj hráča: " + hrac.getNastroje().getDruh());
            } else {
                System.out.println("Nástroj hráča: nebol nájdený");
            }
            System.out.println();
        }
    }
}
