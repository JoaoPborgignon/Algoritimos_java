package aula3;

public class conta_bancaria {
    private int numero;
    private String titular;
    private double saldo;

    public conta_bancaria(int numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if (valor >=0) {
            this.saldo = this.saldo +valor;
            
        }else{
            System.out.println("Valor invalido");
        }
    }
    public void sacar(double valor){
        double valorTemp = this.saldo - valor;
        if (valorTemp <0) {
            System.out.println("Saldo insuficiente");
        }else{
            this.saldo -= valor;
        }
    }

    public void print(){
        System.out.printf("Numero %d, Titular %s, Saldo R$%.2f\n", this.numero, this.titular, this.saldo);
    }

    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getTitular(){
        return this.titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
}
