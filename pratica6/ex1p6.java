package pratica6;

public class ex1p6 {
    public static void main(String[] args) {
        Veiculo veiculos[] = new Veiculo[4];
        veiculos[0] = new Moto();
        veiculos[1] = new Carro();
        veiculos[2] = new Carro();
        veiculos[3] = new Moto();    
                
        veiculos[0].setCor("Verde");
        veiculos[0].setPlaca("CCC-5566");
                
        veiculos[1].setCor("Prata");
        veiculos[1].setPlaca("BBB-2234");
                        
        veiculos[2].setCor("Branco");
        veiculos[2].setPlaca("AAA-1234");
                
        veiculos[3].setCor("Azul");
        veiculos[3].setPlaca("DDD-9932");
                
        DetalheVeiculos detalhes = new DetalheVeiculos(veiculos);
        detalhes.printVeiculos();
    }
}

 class Veiculo {
    private String placa;
    private String cor;
    public String getCor() {
         return cor;
    }
    public void setCor(String cor) {
         this.cor = cor; 
    }
    public String getPlaca() {
         return placa;
    }
    public void setPlaca(String placa) {
         this.placa = placa; 
    } 
}

 class Carro extends Veiculo {
    private int rodas = 4;
    public int getRodas() {
        return rodas;
    }
}

class Moto extends Veiculo {
    private int rodas = 2;
    public int getRodas() {
        return rodas;
    }
}
class DetalheVeiculos {
    Veiculo vec[];
    public DetalheVeiculos(Veiculo vec[]){
        this.vec = vec;
    }

    public void printVeiculos(){
        for (int i = 0; i < vec.length; i++) {
            if (vec[i] instanceof Carro) {
                vec[i] = (Carro)vec[i];
            }else{
                vec[i] = (Moto)vec[i];
            }
        System.out.printf("%s: %s - %s", (vec[i] instanceof Moto)? "Moto" : "Carro",vec[i].getPlaca(), vec[i].getCor(),(vec[i] instanceof Carro) ? ((Carro) vec[i]).getRodas() : ((Moto) vec[i]).getRodas()
);
            
        }
    }
}

/* 
Implemente uma classe chamada DetalheVeiculos que deve:
 1 - receber um vetor do tipo Veiculo como um parâmetro do construtor da classe.
 2 - implementar um método chamado printVeiculos, que deve imprimir os dados dos veículos no console.

O método printVeiculos deve imprimir uma linha para cada veículo, listando o tipo do veículo e os demais dados.
O formato da saída deve ser: "Tipo de Veículo: Placa - Cor - Rodas"

A sua implementação deve atender os casos de teste abaixo:

Moto: CCC-5566 - Verde - 2
Carro: BBB-2234 - Prata - 4
Carro: AAA-1234 - Branco - 4
Moto: DDD-9932 - Azul - 2
*/