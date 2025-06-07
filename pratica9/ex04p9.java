package pratica9;

public class ex04p9 {
    
}

 interface CapazDeAssobiar {
    public void assobiar(String assobio);
    
}

class Humano implements CapazDeAssobiar {        
    public void assobiar(String assobio){
        System.out.println(assobio);
    }        
}

/*
 * A classe Humano abaixo implementa uma interface chamada CapazDeAssobiar.

public class Humano implements CapazDeAssobiar {        
    public void assobiar(String assobio){
        System.out.println(assobio);
    }        
}

No entanto, essa interface não foi declarada no programa Java. Declare a interface CapazDeAssobiar para atender o caso de teste abaixo.

Observação:

 - declare a interface sem modificador de acesso (ou seja, sem public, private ou protected antes da palavra interface).
 */