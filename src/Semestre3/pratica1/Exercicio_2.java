package pratica1;

//Exerc�cio 2) Fazer um programa que imprima na tela o somat�rio dos n�meros de 0 a 10.

public class Exercicio_2 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			sum += i;
			
		}
		
		System.out.println("Somat�ria de 0 at� 10 �: " + sum);

	}

}
