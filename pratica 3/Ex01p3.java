
public class Ex01p3{


    public static double maior(double a, double b, double c, double d){
        double big = Double.NEGATIVE_INFINITY;
        double[] numeros = {a, b, c, d};
        for (int i = 0; i < 4; i++) {
            if (big < numeros[i]) {
                big = numeros[i];
            }
        }
        return big;
        
    }
    public static void main(String args[]){

        
        double n = maior(1, 2, 3, 4);
        System.out.printf("%.1f", n);

    }
    
   
}