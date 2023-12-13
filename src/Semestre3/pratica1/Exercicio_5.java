package pratica1;
import java.util.Scanner;

/*Exercício 5) Fazer um programa para calcular o Índice de Massa Corporal. O programa deverá
exibir a janela de diálogo duas vezes, na primeira vez o usuário deverá fornecer o peso e na 
segunda a altura. Em seguida, o programa deverá imprimir na tela o valor do IMC. A fórmula de 
cálculo do IMC é peso/(altura*altura).*/

public class Exercicio_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		float peso = sc.nextFloat();
		
		System.out.println("Digite sua altura: ");
		float altura = sc.nextFloat();
		
		float imc = peso/(altura * altura);
		
		System.out.println("Seu Índice de Massa Corporal é: " + imc);
		
		sc.close();
		
	}

}
