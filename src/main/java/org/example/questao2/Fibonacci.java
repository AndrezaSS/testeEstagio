package org.example.questao2;public class Fibonacci {
  public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        // variáveis que guardam os dois valores anteriores da sequência de Fibonacci
        int x = 0;
        int y = 1;

        // imprime os números da sequência de Fibonacci até o número digitado
        System.out.println("Sequência de Fibonacci até " + numero + ": ");
        while (x < numero) {
            System.out.print(x + " ");
            int var = y;
            y = x + y;
            x = var;

        }

        // verifica se o número informado pertence à sequência de Fibonacci
        if (x == numero) {
            System.out.println("\n" + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("\n" + numero + " não pertence à sequência de Fibonacci.");
        }
        teclado.close();
    }
}



