
import java.util.Scanner;

public class Ex02p1 {
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        float b = entrada.nextFloat();
        String c = entrada.next();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        entrada.close();
        
    }
}
