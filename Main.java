import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("OPGorchester/skladNastrojov.txt"), "UTF-8"))) {
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
            else if (data[0].equals("s")){
                nastroje.add(new StrunovyNastroj(data));
            }
            else if (data[0].equals("n")){
                nastroje.add(new Nastroj(data));
            }
            else if (data[0].equals("r")){
                nastroje.add(new RytmickyNastroj(data));
            }
            else if (data[0].equals("d")){
                nastroje.add(new DychovyNastroj(data));
            }
            else if (data[0].equals("k")){
                nastroje.add(new KlavesovyNastroj(data));
            }
            else if (data[0].equals("S")){
                nastroje.add(new SlacikovyNastroj(data));
            }
        }
        }
    }
}
