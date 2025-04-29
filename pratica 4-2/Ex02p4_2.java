
class Aluno {
    String nome;
    int idade;
    char genero;
    long ra;


    public Aluno(String nome, int idade, char genero, long ra){
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public void print() {
        System.out.println(nome +  " - "  + idade +  " - "  + genero);
    }
}

class AlunoAnalise {
    Aluno alunos[];

    public AlunoAnalise(Aluno alunos[]){
        this.alunos = alunos;
    }
    
    public void listarAlunosPorGenero(char genero){
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].genero == genero) {
                this.alunos[i].print();
            }
        }
    }
    public void listarAlunoMaisVelho(){
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].idade > maior) {
                maior = alunos[i].idade;
            }
        }
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].idade == maior) {
                alunos[i].print();
                break;
            }
        }
    }

    public void listarAlunoMaisJovem(){
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].idade < menor) {
                menor = alunos[i].idade;
            }
        }
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].idade == menor) {
                alunos[i].print();
                break;
            }
        }
    }

    public double getMediaIdade(){
        double med=0;

        for (int i = 0; i < alunos.length; i++) {
            med = med + alunos[i].idade;
        }
        med = med/alunos.length;
        return med;
    }
    
}

public class Ex02p4_2 {
}
