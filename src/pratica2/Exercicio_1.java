package pratica2;
import java.util.Scanner;

/*Exercício 1) Fazer um programa para calcular o fatorial de um número. Para se calcular o fatorial 
de um número, é necessário multiplicar ele por todos os seus antecessores até chegar número 1. 
Exemplo: para calcular o fatorial de 5 é necessário multiplicar 5 x 4 x 3 x 2 x 1.*/

public class Exercicio_1 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		
		System.out.println("O fatorial de " + num + "! é: " + fatorial(num));
		
		sc.close();
	
	}

	static int fatorial(int num) {
		
		if (num == 0) {
			
			return num;
			
		} else {
		
			int fat = 1;
		
			for(int i = 2; i <= num; i++) {
			
				fat *= i;
			
			}
			
			return fat;
			
		}
		
		/*Recursivo
		
		} else {
		
			if(num == 1) {
			
				return 1;
				
			} else {
		
			return num * fatorial(num-1);
			
			}
			
		}
		*/
		
	}
	
}

