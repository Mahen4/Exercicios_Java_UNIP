package pratica1;

//Exerc�cio 1) Fazer um programa que imprima os n�meros pares que existem no intervalo entre 1 e 15.

public class Exercicio_1 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 15; i++ ) {
			
			if(i % 2 == 0) {
				System.out.println(i);
			}

		}

	}

}