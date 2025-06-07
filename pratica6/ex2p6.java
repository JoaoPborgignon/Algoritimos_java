package pratica6;

public class ex2p6 {
    
}

class Pessoa_p6 {
    private String nome;
    private int idade; 

    public Pessoa_p6(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String retornaDados(){
        return nome + " -- " + idade;
    }
    public void fazerAniversario(){
        idade++;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
}

class Aluno_p6 extends Pessoa_p6{
    int ra;
    String disciplina;
    public Aluno_p6(String nome, int idade, int ra, String disciplina){
        super(nome, idade);
        this.ra = ra;
        this.disciplina = disciplina;
    }

    public int getRa() {
        return ra;
    }
    public void setRa(int ra) {
        this.ra = ra;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String retornaDados() {
    
        return getNome() + " -- " + getIdade() + " -- " + getRa() + " -- " + getDisciplina();
    }
    
}

/*
Com base no código acima, implemente uma classe chamada Aluno, de acordo com as seguintes instruções:
1) Aluno herda de Pessoa;
2) Aluno tem os atributos ra:int e disciplinas:String;
3) Implemente todos os métodos get e set para os atributos de Aluno (instrução anterior);
4) Redefina o método retornaDados para retornar, além dos dados da Pessoa, os dados do Aluno.
 */