package pratica1;
import java.util.Scanner;

/*Exerc�cio 5) Fazer um programa para calcular o �ndice de Massa Corporal. O programa dever�
exibir a janela de di�logo duas vezes, na primeira vez o usu�rio dever� fornecer o peso e na 
segunda a altura. Em seguida, o programa dever� imprimir na tela o valor do IMC. A f�rmula de 
c�lculo do IMC � peso/(altura*altura).*/

public class Exercicio_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		float peso = sc.nextFloat();
		
		System.out.println("Digite sua altura: ");
		float altura = sc.nextFloat();
		
		float imc = peso/(altura * altura);
		
		System.out.println("Seu �ndice de Massa Corporal �: " + imc);
		
		sc.close();
		
	}

}
