import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileRead {


    public static void main(String[] args) {

        try {
            FileReader f = new FileReader("C:\\CST8116 Homework\\FileI\\src\\students.txt");
            BufferedReader br = new BufferedReader(f);
            String s;
            ArrayList<String []> file=new ArrayList<>();
            while((s=br.readLine())!=null){
                //System.out.println(s.split(" "));
                file.add(s.split(" "));
                /*
                for(String w:words){
                    file.add(w);
                }*/
                //file.add(words);


            }
            for (int i=0;i<file.size();i++){
                System.out.println(file.get(i));
            }
            for (String [] w:file){
                for (String word:w) {
                    System.out.println(word);
                }

            }

        }
        catch(Exception ex){
            return;
        }

    }
}
