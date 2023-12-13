package pratica1;

//Exercício 2) Fazer um programa que imprima na tela o somatório dos números de 0 a 10.

public class Exercicio_2 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			sum += i;
			
		}
		
		System.out.println("Somatória de 0 até 10 é: " + sum);

	}

}
