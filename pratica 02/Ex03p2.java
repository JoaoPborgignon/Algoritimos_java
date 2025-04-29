
import java.util.Scanner;

public class Ex03p2 {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
    
        int  a = scanner.nextInt();
        int  b = scanner.nextInt();
        int  c = scanner.nextInt();
        int maior = 0;

        if (a > maior) {
            maior = a;
        }
        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
          maior = c;   
        }
        System.out.println(maior);
        scanner.close();
        
    }
}