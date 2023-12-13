package pratica2;
import java.util.Scanner;

/*Exercício 3) Muitos não sabem, mas o Real não foi a única moeda que circulou pelo Brasil. Antes 
do plano Real (1994-atualmente), o nome da nossa moeda era Cruzeiro Real (1993-1994) e antes 
disso era o Cruzeiro (1990-1993). 

>Criar um programa que converta uma quantia em Real, para Cruzeiro Real e Cruzeiro.

> Para transformar o Real em Cruzeiro Real, basta multiplicar o valor em reais por 2.750.
> Para transformar o Cruzeiro Real em Cruzeiro, basta multiplicar o valor por 1.000.*/

public class Exercicio_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantia de dinheiro em reias para conversão: ");
		double reais = sc.nextDouble();
		
		double CruzeiroReal = reais * 2750;
		double Cruzeiro = reais * 2750 * 1000;
		
		System.out.print("Cruzeiro Real: CR$ " + String.format("%.2f", CruzeiroReal) + 
						 "\nCruzeiro: Cr$ " + String.format("%.2f", Cruzeiro));
		
		sc.close();
		
	}
	
}
