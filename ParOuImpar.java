/*Desenvolva um algoritmo capaz de verificar se os números inteiros, 
  dados como entrada, são  par ou ímpar.*/

import java.util.Scanner;

public class ParOuImpar {
	
	public static void main(String[] args) {
		
				
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		
		for(int x = 0; x < numeros.length; x++) {
			System.out.print("Digite um número inteiro: ");
			numeros[x] = scanner.nextInt();
			
			if(numeros[x] % 2 == 0) {
				System.out.println("O número digitado é PAR!");
			}else{
				System.out.println("O número digitado é IMPAR!");
			}
		}
		
	}

}
