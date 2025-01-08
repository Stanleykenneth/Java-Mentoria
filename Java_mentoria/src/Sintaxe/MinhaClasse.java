package Sintaxe;

public class MinhaClasse {
    // Corpo da classe

    void metodoUm(){
        // corpo do método chamado metodoUm
        int umaVariavelInterna = 1;
        //esta variável só poderser acessada aqui
    }

    // coropo da classe novamente
    int umavariavel;

    void metodoDois(){
        umavariavel = 5;
    }

    void metodoTres(){
        umavariavel = 10;
       // umavariavelInterna = 5; // erro ? Porque gera esse erro na Variável interna?
       // O erro acontece porque essa
    }

    void metodoQuatro(){
        System.out.println("O valor da váriavel é: " + umavariavel);
    }
}
