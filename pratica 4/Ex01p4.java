
class Aluno_p4 {
    String nome;
    int idade;
    char genero;
    long ra;

    // Construtor
    public Aluno_p4() {
        this.nome = "Aluno_p4";
        this.idade = 18;
        this.genero = 'M';
        this.ra = 123456789;
    }
    public Aluno_p4(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.genero = 'M';
        this.ra = 123456789;

    }
    public Aluno_p4(String nome, char genero, long ra){
        this.nome = nome;
        this.idade = 18;
        this.genero = genero;
        this.ra = ra;
    }

    public void print() {
        System.out.println(nome + '-' + idade + '-' + genero + '-' + ra);
    }
}



public class Ex01p4 {
    public static void main(String args[]){

        Aluno_p4 a1 = new Aluno_p4();
        a1.print();

    }
}
