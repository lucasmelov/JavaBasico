/*Desenvolva um algoritmo capaz de verificar se os n�meros inteiros, 
  dados como entrada, s�o  par ou �mpar.*/

import java.util.Scanner;

public class ParOuImpar {
	
	public static void main(String[] args) {
		
				
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		
		for(int x = 0; x < numeros.length; x++) {
			System.out.print("Digite um n�mero inteiro: ");
			numeros[x] = scanner.nextInt();
			
			if(numeros[x] % 2 == 0) {
				System.out.println("O n�mero digitado � PAR!");
			}else{
				System.out.println("O n�mero digitado � IMPAR!");
			}
		}
		
	}

}
