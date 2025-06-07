package pratica8;

public class ex2p8 {
    
}
 class Pessoa_p8_2 {
   private String nome;
   public String getNome() {  return nome; }
   public void setNome(String nome) { this.nome = nome; }
}

 abstract class Aluno_p8 extends Pessoa_p8_2 {
    private int ra;
    private double notaDisciplinas;

    public abstract double getNotaFinal();

    public int getRa() { return ra; }
    public void setRa(int ra) { this.ra = ra; }
    public double getNotaDisciplinas() { return notaDisciplinas; }
    public void setNotaDisciplinas(double notaDisciplinas) { this.notaDisciplinas = notaDisciplinas; }
}

class AlunoGraduacao extends Aluno_p8{
    private double notaTCC;

    public AlunoGraduacao(String nome, int ra, double notaDisciplinas, double notaTCC) {
        super.setNome(nome);  // Herdado de Pessoa
        super.setRa(ra);      // Herdado de Aluno
        super.setNotaDisciplinas(notaDisciplinas);  // Herdado de Aluno
        this.notaTCC = notaTCC;
    }




    @Override
    public double getNotaFinal() {
        return (getNotaDisciplinas() + notaTCC) / 2;
    }

    public double getNotaTCC() {
        return notaTCC;
    }
    public void setNotaTCC(double notaTCC) {
        this.notaTCC = notaTCC;
    }

}

class AlunoMestrado extends Aluno_p8 {

    private double notaDissertacao;
    private int artigosPublicados;

    public AlunoMestrado(String nome, int ra, double notaDisciplinas, double notaDissertacao, int artigosPublicados) {
        super.setNome(nome);
        super.setRa(ra);
        super.setNotaDisciplinas(notaDisciplinas);
        this.notaDissertacao = notaDissertacao;
        this.artigosPublicados = artigosPublicados;
    }

   @Override
    public double getNotaFinal() {
        return (artigosPublicados > 0) ? (getNotaDisciplinas() + notaDissertacao) / 2 : 0;
    }

    public double getNotaDissertacao() {
        return notaDissertacao;
    }
    public void setNotaDissertacao(double notaDissertacao) {
        this.notaDissertacao = notaDissertacao;
    }
    public int getArtigosPublicados() {
        return artigosPublicados;
    }
    public void setArtigosPublicados(int artigosPublicados) {
        this.artigosPublicados = artigosPublicados;
    }
}