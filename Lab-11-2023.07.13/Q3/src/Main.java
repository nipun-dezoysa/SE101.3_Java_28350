import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try{
            File obj = new File("hello.txt");
        }catch (FileNotFoundException e){
            System.out.println("hey");
        }
    }
}
