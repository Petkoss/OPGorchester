package OPGorchester;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(  new FileReader("ORCHESTER/OPGorchester/skladNastrojov.txt"))) {
            ArrayList<Nastroj> nastroje = new ArrayList<>();
            ArrayList<Hrac> umelci = new ArrayList<>();
            String line;
            Nastroj nastroj;
            while ((line = br.readLine())!=null) {
                System.out.println(line);
                String [] data = line.split(",");
                for (int i = 0; i < data.length; i++){
                    System.out.println(data[i]);
                }
            if (data[0].equals("u")){
                umelci.add(new Hrac(data));

            }
            ArrayList<Nastroje> sklad = new ArrayList<>();
            ArrayList<Hrac> umelci = new ArrayList<>();
            Nastroje nastroje;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0] == "u") {
                    umelci.add(new Hrac(data));
                }
                else {
                    if (data[0]=="s"){
                        sklad.add(nastroje = new StrunovyNastroj(data));
                    
                    }
                    if (data[0] == "n") {
                        sklad.add(nastroje = new Nastroje(data));
                    }
                }
                br.close();
                System.out.println(nastroje);
            }
        }
        }
    }
}
