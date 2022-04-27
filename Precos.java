import java.util.Scanner;

public class Precos {
    public static void main(String[] args) {

        double verde = 10.00;
        double azul = 20.00;
        double amarelo = 30.00;
        double vermelho = 40.00;
        double entrada;

        Scanner texto = new Scanner(System.in);

        System.out.println("Seja bem vindo a nossa loja de CD`s, a loja está divida por seções de cores, portanto  " +
                "digite a cor referente ao seu produto, sendo (1) para verde, (2) para azul, (3) para amarelo," +
                " (4) para vermelho: ");
        entrada = texto.nextInt();

        while (entrada > 0 && entrada < 5) {
            if (entrada == 1) {
                System.out.println("O preço referente a seção escolhida é de: R$ " + verde + ".");
                break;
            } else if (entrada == 2) {
                System.out.println("O preço referente a seção escolhida é de: R$ " + azul + ".");
                break;
            } else if (entrada == 3) {
                System.out.println("O preço referente a seção escolhida é de: R$ " + amarelo + ".");
                break;
            } else {
                System.out.println("O preço referente a seção escolhida é de: R$ " + vermelho + ".");
                break;
            }

        }

        while (entrada <= 0 || entrada >= 5){
            System.out.println("O número que você digitou e inválido!");
            break;
        }

    }
}