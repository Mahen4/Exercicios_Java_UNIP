package pratica1;
import java.util.Scanner;

/*Exerc�cio 7) Fazer um programa que o usu�rio entre com o seu nome completo e o programa 
exiba na tela apenas o primeiro e �ltimo nome. Exemplo: para a entrada de nome "Ana Maria de 
Souza", o programa dever� imprimir na tela "Ana Souza".*/

public class Exercicio_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nome_completo = sc.nextLine();
		
		String[] nome_separado = nome_completo.split(" ");
		
		System.out.println("Nome + Sobrenome: " + nome_separado[0] + 
							" " + nome_separado[nome_separado.length-1]);
		
		sc.close();
		
	}

}
