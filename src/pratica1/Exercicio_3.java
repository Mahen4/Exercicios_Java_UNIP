package pratica1;

/*Exercício 3) Fazer um programa que imprima na tela a média dos números ímpares que estão no 
intervalo entre 0 e 100.*/

public class Exercicio_3 {

	public static void main(String[] args) {
		
		int num_impar = 0;
		
		for (int i = 1; i <= 100; i++) {
			
			if(i % 2 == 1) {
				
				num_impar++;
				
			}
			
		}
			
		float media = 101/(float)num_impar;
			
		System.out.printf("Média de números impares entre 0 e 100: " + media);
			
	}

}


