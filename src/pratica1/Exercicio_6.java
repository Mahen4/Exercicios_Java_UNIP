package pratica1;
import java.util.Scanner;

/*Exerc�cio 6) Fazer um programa que o usu�rio entre com uma frase e o programa imprima na tela 
a frase com todos os caracteres em mai�sculo.*/

public class Exercicio_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String Frase = sc.nextLine();
		
		System.out.println("Sua frase em maiusculo fica: ");
		System.out.println(Frase.toUpperCase());
		
		sc.close();

	}

}
