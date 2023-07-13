import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        try{
            System.out.println("6th element is "+arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("out of the rage of arry");
        }
    }
}
