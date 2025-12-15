package OPGorchester;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
<<<<<<< HEAD
import java.util.Arrays;
=======
>>>>>>> 03f5b9c9e96b4cbeda1598beafd72d15f0fc353f
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
<<<<<<< HEAD
        try (BufferedReader br = new BufferedReader(new FileReader("OPGorchester/skladNastrojov.txt"))) {
=======
        try (BufferedReader br = new BufferedReader(  new FileReader("ORCHESTER/OPGorchester/skladNastrojov.txt"))) {
            ArrayList<Nastroj> nastroje = new ArrayList<>();
            ArrayList<Hrac> umelci = new ArrayList<>();
>>>>>>> 03f5b9c9e96b4cbeda1598beafd72d15f0fc353f
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
<<<<<<< HEAD
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
=======
            else {
                nastroj = null;
                if (data[0].equals("n")) nastroj = new Nastroj(data);
                if (data[0].equals("s")) nastroj = new StrunovyNastroj(data);
                if (nastroj != null) {
                    System.out.println(nastroj);
                    nastroje.add(nastroj);
>>>>>>> 03f5b9c9e96b4cbeda1598beafd72d15f0fc353f
                }
                br.close();
                System.out.println(nastroje);
            }
        }
        }
    }
}
