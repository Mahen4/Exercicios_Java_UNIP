package pratica1;
import java.util.Scanner;

/*Exerc�cio 4) Fazer um programa que exiba a janela de di�logo tr�s vezes, em cada uma delas o 
usu�rio ir� entrar com um n�mero inteiro. Ap�s isso o programa dever� imprimir na tela o 
somat�rio dos valores.*/

public class Exercicio_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		int dialogo1 = sc.nextInt();
		
		System.out.println("Digite um n�mero inteiro denovo: ");
		int dialogo2 = sc.nextInt();
		
		System.out.println("Digite um n�mero inteiro pela �ltima vez: ");
		int dialogo3 = sc.nextInt();
		
		int sum = dialogo1 + dialogo2 + dialogo3;
		
		System.out.println("Soma dos tr�s n�meros: " + sum);
		
		sc.close();

	}

}
