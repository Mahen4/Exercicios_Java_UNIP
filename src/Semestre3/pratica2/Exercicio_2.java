package pratica2;
import java.util.Scanner;

/*Fazer um programa para que o usuário entre com um número inteiro. Após isso, o 
programa deve calcular o termo correspondente da sequência de Fibonacci.*/

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o termo que deseja saber da sequencia Fibonacci: ");
		int num = sc.nextInt();
		
		System.out.println("O " + num + "º termo da sequencia Fibonacci é: " + Fibonacci(num));
		
		sc.close();
		
	}
	
	static int Fibonacci(int num) {
		
		int ter1 = 0, ter2 = 1, teri = 0;
		
		switch (num) {
			case 1: return 0;
			case 2: return 1;
			default: for (int i = 3; i <= num; i++) {
				
				teri = ter1 + ter2;
				ter1 = ter2;
				ter2 = teri;
				
			}return teri;
			
		}
		
	}
	
}
