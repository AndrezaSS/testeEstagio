package org.example.questao5;public class InvertePalavra {
  public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String x = teclado.nextLine();
        //Definimos essa variável para armazenar os caracteres da variável x
        String palavraInvertida = "";

        for (int i = x.length() - 1; i >= 0; i--) {
            palavraInvertida += x.charAt(i);
        }

        System.out.println("Palavra invertida: " + palavraInvertida);
    }
}

