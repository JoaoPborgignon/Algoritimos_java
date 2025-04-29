import java.util.Scanner;

public class Ex04p2 {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
    
        int a = scanner.nextInt();
        
        for (int i = 0; i < a; i++) {
            System.out.print((i+1) + " ");
        }
        
        scanner.close();
        
    }
}