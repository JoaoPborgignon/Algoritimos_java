package pratica5;

public class Ex3p5 {
    
}
/* - Gerente(nome:string, endereco:string, salario:double, departamento:string)
 - Funcionario(nome:string, endereco:string, salario:double)
 - Dependente(nome:string, endereco:string, idade:int)
 - Pessoa(nome:string, endereco:string)
 - Cliente(nome:string, endereco:string, limiteCompra:double) */


class Pessoa_p5_ex5{
    private String nome;
    private String endereco;

    public Pessoa_p5_ex5(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}

class Dependente extends Pessoa_p5_ex5{
    private int idade;

    public Dependente(String nome, String endereco, int idade){
        super(nome, endereco);
        this.idade = idade;
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
class Funcionario extends Pessoa_p5_ex5 {

    private double salario;

    
    public Funcionario(String nome, String endereco, double salario){
        super(nome, endereco);
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String nome, String endereco, double salario,String departamento) {
        super(nome, endereco,salario);
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
} 
class Cliente  extends Pessoa_p5_ex5{
    
    private double limiteCompra;
    public Cliente(String nome, String endereco, double limiteCompra){
        super(nome, endereco);
        this.limiteCompra = limiteCompra;
    }
    public double getLimiteCompra() {
        return limiteCompra;
    }
    public void setLimiteCompra(double limiteCompra) {
        this.limiteCompra = limiteCompra;
    }
    
}