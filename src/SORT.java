import java.io.IOException;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;


public class SORT {
    public void sorting(String path){
        String paths =path;
        String line;
        ArrayList<String> list= new ArrayList<>();

        try{
            BufferedReader br = new BufferedReader(new FileReader(paths));
            PrintWriter pr = new PrintWriter("SORTED");
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                list.add(values[1]);
            }
            list.remove(0);
            Collections.sort(list);
            for (String i : list) {
                pr.println(i);
            }
            pr.close();
        }

        catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        SORT s = new SORT();
        s.sorting("C:\\Users\\Renukananda T D\\IdeaProjects\\SORT\\src\\SORT - Sheet1.csv");
    }
}
