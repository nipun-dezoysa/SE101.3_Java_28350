import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        char stmt[] = new char[50];
        try{
            File obj = new File("hello.txt");
            FileReader reader = new FileReader(obj);
            reader.read(stmt);
        }catch (FileNotFoundException e){
            System.out.println("file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
