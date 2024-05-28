import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo numero");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.err.println("Erro: " + e.getMessage());
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo numero deve ser maior do que o primeiro");
        }
        
        int contagem = parametroDois - parametroUm;

        for(int numero = 0; numero <= contagem; numero++){
            System.out.println(numero);
        }
    }
}