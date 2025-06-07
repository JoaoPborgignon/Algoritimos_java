package pratica8;

public class ex1p8 {
    
}

abstract class Pessoa_p8 {
    public abstract String getNome();
    public abstract void setNome(String nome);
    public abstract String getCpf();
    public abstract void setCpf(String cpf);
    public abstract String getRg();
    public abstract void setRg(String rg);
}
class Professor_p8 extends Pessoa_p8 {
    private String nome;
    private String cpf;
    private String rg;
    private float Salario;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getRg() {
        return rg;
    }

    @Override
    public void setRg(String rg) {
        this.rg = rg;
    }
    public float getSalario() {
        return Salario;
    }
    public void setSalario(float salario) {
        Salario = salario;
    }
}