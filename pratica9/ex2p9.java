package pratica9;

public class ex2p9 {
    
}

interface AreaCalculavel {
    public double calcularArea();
}

class Quadrado implements AreaCalculavel{
    double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return lado * lado;
    }

}

class Retangulo implements AreaCalculavel{
    double base, altura;

        public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

class Triangulo implements AreaCalculavel{
    double base, altura;

        public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }
}
/*
 * Para padronizar o cálculo da área de figuras geométricas (quadrado, retângulo, triângulo, etc) foi definida a interface Java abaixo. Toda classe que define uma figura geométrica deve implementar essa interface.

public interface AreaCalculavel {
    public double calcularArea();
}

Implemente as classes Quadrado, Retangulo e Triangulo para atender o caso de teste abaixo. Use como referências as seguintes expressões para calcular a área da figura:

    Quadrado: lado * lado;
    Retângulo: base * altura;
    Triângulo: (base * altura) / 2;

Observação: não é necessário definir a interface AreaCalculavel na resposta, ela já está disponível no código-fonte da questão.
 */