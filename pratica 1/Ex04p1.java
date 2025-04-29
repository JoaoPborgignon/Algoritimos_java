
import java.util.Scanner;

public class Ex04p1 {
       public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();

        int soma = a+b;
        int sub = a-b;

        System.out.println("soma = " + soma);
        System.out.println("subtracao  = " + sub);

        entrada.close();
    }
}
