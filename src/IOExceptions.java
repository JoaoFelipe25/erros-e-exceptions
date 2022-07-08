import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class IOExceptions{

    public static void main(String[] args) {
        
        String textLine;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"))){

            while((textLine = bufferedReader.readLine()) != null){
                System.out.println(textLine);
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}