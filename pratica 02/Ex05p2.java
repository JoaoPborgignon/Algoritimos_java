import java.util.Scanner;

public class Ex05p2 {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
    
        int a = scanner.nextInt();
        
        for (int i = a; i > 0; i--) {
            System.out.print((i) + " ");
        }
        
        scanner.close();
        
    }
}