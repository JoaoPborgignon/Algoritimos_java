
class Pessoa_ex3 {
    String nome;
    double altura;
    double peso;

    // Construtor
    public Pessoa_ex3() {
        this.nome = "Fulano";
        this.altura = 1.80;
        this.peso = 80;
    }
    public Pessoa_ex3(String nome, double altura, double peso){
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }
    public double calcularIMC() {
        return peso/(altura*altura);
    }
}



public class Ex03p4 {
    public static void main(String args[]){
        Pessoa_ex3 p1 = new Pessoa_ex3("Aluno de Poo", 1.60, 90.5);
        System.out.printf("Nome: %s, Altura: %.2f, Peso: %.2f\n", p1.nome, p1.altura, p1. peso);
        System.out.printf("IMC: %.2f\n", p1.calcularIMC());
    }
}
