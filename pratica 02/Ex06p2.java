import java.util.Scanner;

public class Ex06p2 {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int num = 0;
        int count=0;
        while (num >= 0) {
            num = scanner.nextInt();
            if (num > 0) {
                soma = soma + num; 
            }
            count ++;
        }
        System.out.println("Quantidade = " + count);
        System.out.println("Soma = " + soma);

        scanner.close();
        
    }
}
