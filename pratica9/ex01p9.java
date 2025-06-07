package pratica9;

public class ex01p9 {
    
}
 interface MinhaInterface {
    public void concatenar(String s);
    public int tamanho();
    public String getFrase();
    public void setFrase(String frase);
}

class MinhaClasse implements MinhaInterface{
    String frase;

    public void setFrase(String frase){
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }
    @Override
    public int tamanho() {
        return frase.length();
    }
    @Override
    public void concatenar(String s) {
       frase = frase + s; 
    }
    
}