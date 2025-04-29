import java.util.Scanner;

public class Ex03p3 {
    public static void printDiagonalPrincipal(int[][] numeros){
        int tama =numeros.length;
        for (int i = 0; i < tama; i++) {
            System.out.println(numeros[i][i]); // Somente elementos da diagonal principal
        }

        
    }
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);
        int tam = entrada.nextInt();
        int matriz[][] = new int[tam][tam];
                
        for (int i=0; i<tam; i++){
            for (int j=0; j<tam; j++){
                matriz[i][j] = entrada.nextInt();
            }
        }
        printDiagonalPrincipal(matriz);
        entrada.close();
    }
    
   
}
