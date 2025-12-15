package OPGorchester;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(  new FileReader("OPGorchester/skladNastrojov.txt"))) {
            String line;
            while ((line = br.readLine())!=null) {
                System.out.println(line);
                String [] data = line.split(",");
                for (int i = 0; i < data.length; i++){
                    System.out.println(data[i]);
                }
            }
            ArrayList<Nastroje> sklad = new ArrayList<>();
            ArrayList<Hrac> umelci = new ArrayList<>();
            Nastroje nastroje;
            while ((line = br.readLine()) != null) {
                String[] params = line.split(" , ");
                if (params[0] == "u") {
                    umelci.add(new Hrac(params));
                }
                else {
                    if (params[0]=="s"){
                        sklad.add(nastroje = new StrunovyNastroj(params));
                    
                    }
                    if (params[0] == "n") {
                        sklad.add(nastroje = new Nastroje(params));
                    }
                }
            }
        }
    }
}
