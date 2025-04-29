
public class Ex02p3 {

    public static int procuraMaiorValor(int[] numeros){
        int big = Integer.MIN_VALUE;
        
        for (int i = 0; i < numeros.length; i++) {
            if (big < numeros[i]) {
                big = numeros[i];
            }
        }
        return big;
        
    }
    public static void main(String args[]){

    int vetor[] = {1,-2,3,4,-5,6,-7};
    int maior = procuraMaiorValor(vetor);
    System.out.println(maior);
    }
    
   
}
