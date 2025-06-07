package pratica9;

public class ex03p9 {
    
}

 interface Funcionario{

    public double calcularSalario();

}

class Professor implements Funcionario{
    double ch;
    String nome;

    public Professor(String nome, double ch){
        this.nome = nome;
        this.ch = ch;
    }

    @Override
    public double calcularSalario() {
        return ch*60;
    }
}

class Estagiario implements Funcionario{
    double ch;
    String nome;

     public Estagiario(String nome, double ch){
        this.nome = nome;
        this.ch = ch;
    }

    @Override
    public double calcularSalario() {
        return ch*12.50;
    }
}

class Tecnico implements Funcionario{
    double ch;
    String nome;

     public Tecnico(String nome, double ch){
        this.nome = nome;
        this.ch = ch;
    }

    @Override
    public double calcularSalario() {
        return ch*40;
    }
}

/*
 * Em uma determinada organização há três tipos de funcionários: Professor, Estagiário e Técnico.

Para calcular o salário de cada um deles é necessário seguir as regras abaixo:

Professor: CH (carga horária) * 60.0

Estagiário: CH * 12.50

Técnico: CH * 40.0

Para padronizar o cálculo do salário do funcionário foi definida a interface abaixo:

public interface Funcionario{

    public double calcularSalario();

}

Declare as classes Professor, Estagiario e Tecnico para atender o caso de teste abaixo.

Observações:

Além do atributo CH, os funcionários também têm o atributo nome.

Não declare a interface Funcionario, ela já está disponível no código-fonte da questão.
 */