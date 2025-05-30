package aula2;

public class programa1 {
    public static void main(String[] args) {
        int i =10;
        pessoa_aula minhaPessoa = new pessoa_aula();

        minhaPessoa.nome = "João";
        minhaPessoa.idade = 18;
        minhaPessoa.fazeraniversario();
        minhaPessoa.print();

    }
}
