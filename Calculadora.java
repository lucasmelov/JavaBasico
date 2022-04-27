import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        int menorNumero = 0;

        Scanner texto = new Scanner(System.in);
        int[] numeros = new int[3];

        System.out.println("Digite 3 números para a formação do programa!");

        for (int i=0; i< numeros.length; i++) {
            System.out.println("digite o " + (i+1) + "º número:");
            numeros[i] = texto.nextInt();

            if (i == 0)
                menorNumero = numeros[i];

            if (numeros[i] < menorNumero)
                menorNumero = numeros[i];

        }

        System.out.println("O menor número foi: " + menorNumero + "!");



    }
}