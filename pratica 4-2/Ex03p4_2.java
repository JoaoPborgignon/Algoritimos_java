
class Lancamento {
    private String descricao;
    private int tipo;
    private double valor;

    public Lancamento(int tipo, String descricao, double valor) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public int getTipo() { return tipo; }
    public void setTipo(int tipo) { this.tipo = tipo; }
    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

}

class Financeiro{
    private double saldo = 0.00;
    
    public void processarLancamento(Lancamento a){
        System.out.printf("Lançamento: %s - %s - %.2f\n",(a.getTipo() == 0)? "Pagar" :"Receber", a.getDescricao(), a.getValor());

        if (a.getTipo() == 1) {
            this.saldo += a.getValor();
        }else{
            this.saldo -= a.getValor();
        }
    }
    public void printSaldo(){
        System.out.printf("Saldo = %.2f", saldo);
    }
}

public class Ex03p4_2 {
    public static void main(String[] args) {
        int Receber = 1, Pagar = 0;
        Financeiro financeiro = new Financeiro();
        Lancamento lanc1 = new Lancamento(Receber, "Salario", 1000.99);
        Lancamento lanc2 = new Lancamento(Pagar, "Luz", 250.56);
        Lancamento lanc3 = new Lancamento(Pagar, "Água", 180.19);
        financeiro.processarLancamento(lanc1);
        financeiro.processarLancamento(lanc2);
        financeiro.processarLancamento(lanc3);
        financeiro.printSaldo();
    }
}
