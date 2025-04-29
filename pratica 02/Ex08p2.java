import java.util.Scanner;

public class Ex08p2 {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        
        int num = 0;

        int intervalo1 = 0, intervalo2 = 0, intervalo3 = 0, intervalo4 = 0;
        while (num >= 0) {
            num = scanner.nextInt();
            
            if (num >=0 && num <= 25 ) {
                intervalo1 ++;
            }else if (num >= 26 && num <= 50) {
                intervalo2 ++;
            }else if (num >= 51 && num <= 75) {
                intervalo3 ++;
            }else if (num >= 76 && num <= 100) {
                intervalo4 ++;
            }
    
        }
        System.out.println("[0,25] = " + intervalo1);
        System.out.println("[26,50] = " + intervalo2);
        System.out.println("[51,75] = " + intervalo3);
        System.out.println("[76,100] = " + intervalo4);
        
    
        scanner.close();
        
    }
}
