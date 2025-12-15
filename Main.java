package OPGorchester;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("OPGorchester/skladNastrojov.txt"))) {
            String line;
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
