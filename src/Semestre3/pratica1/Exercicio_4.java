package pratica1;
import java.util.Scanner;

/*Exercício 4) Fazer um programa que exiba a janela de diálogo três vezes, em cada uma delas o 
usuário irá entrar com um número inteiro. Após isso o programa deverá imprimir na tela o 
somatório dos valores.*/

public class Exercicio_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int dialogo1 = sc.nextInt();
		
		System.out.println("Digite um número inteiro denovo: ");
		int dialogo2 = sc.nextInt();
		
		System.out.println("Digite um número inteiro pela última vez: ");
		int dialogo3 = sc.nextInt();
		
		int sum = dialogo1 + dialogo2 + dialogo3;
		
		System.out.println("Soma dos três números: " + sum);
		
		sc.close();

	}

}
