package pratica1;

/*Exerc�cio 3) Fazer um programa que imprima na tela a m�dia dos n�meros �mpares que est�o no 
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
			
		System.out.printf("M�dia de n�meros impares entre 0 e 100: " + media);
			
	}

}


