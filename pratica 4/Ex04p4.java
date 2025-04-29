
class Pessoa {
    String nome;
    double altura;
    double peso;

    // Construtor
    public Pessoa() {
        this.nome = "Fulano";
        this.altura = 1.80;
        this.peso = 80;
    }
    public Pessoa(String nome, double altura, double peso){
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }
    public double calcularIMC() {
        return peso/(altura*altura);
    }
    public String classificacaoIMC(){
        double imc = peso/(altura*altura);
        if (imc < 18.5) {
            return "Magreza";
        }else if (imc <24.9) {
            return "Normal";
        }else if (imc <29.9) {
            return "Sobrepeso";
        }else if (imc <34.9) {
            return "Obesidade grau I";
        }else if (imc <39.9) {
            return "Obesidade grau II";
        }else if (imc >40) {
            return "Obesidade grau III";
        }
        return "AAA";

    }
}



public class Ex04p4 {
    public static void main(String args[]){
        Pessoa p1 = new Pessoa("Pessoa1", 1.60, 90.5);
        System.out.printf("Nome: %s, Altura: %.2f, Peso: %.2f\n", p1.nome, p1.altura, p1. peso);
        System.out.printf("IMC: %.2f\n", p1.calcularIMC());
        System.out.printf("Classificação: %s\n", p1.classificacaoIMC());
    }
}
