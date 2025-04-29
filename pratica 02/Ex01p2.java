
import java.util.Scanner;

public class Ex01p2{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        float d = scanner.nextFloat();
        

        System.out.println(((a+b+c+d)/4));
        scanner.close();
        
    }
}