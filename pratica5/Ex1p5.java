package pratica5;

public class Ex1p5 {
    
}

class Veiculo {
    private int renavam;
    private String placa;
    private String cor;

    public int getRenavam(){
        return this.renavam;
    }
    public void serRenavam(int renavam){
        this.renavam = renavam;
    }

    public String getPlaca(){
        return this.placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    // métodos get e set foram suprimidos, mas eles existem na implementação da classe.
}
class Carro extends Veiculo{
    /*
     Renavam: 123456789, Placa: AAA-1234, Cor: Preto, NumeroDePortas: 4, PotenciaMotor: 115
     */

     private int numerodeportas;
     private int potenciadomotor;


     public void printInformacoes(){
        System.out.printf("Renavam: %d, Placa: %s, Cor: %s, NumeroDePortas: %d, PotenciaMotor: %d", this.getRenavam(), this.getPlaca(), this.getCor(), this.getNumeroDePortas(),
        this.potenciadomotor);
     }
     public int getNumeroDePortas() {
         return numerodeportas;
     }

     public void setNumeroDePortas(int numerodeportas) {
         this.numerodeportas = numerodeportas;
     }

     public int getPotenciaMotor() {
         return potenciadomotor;
     }
     public void setPotenciaMotor(int potenciadomotor) {
         this.potenciadomotor = potenciadomotor;
     }


}