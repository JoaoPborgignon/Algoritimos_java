package aula2;
public class pessoa_aula{ 
    String nome;
    int idade;

    public void fazeraniversario(){
        idade = idade+1;
    }

    public void print(){
        System.out.printf("Nome: %s, idade: %d\n", nome, idade);
    }

}
