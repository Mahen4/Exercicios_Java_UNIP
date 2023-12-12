package pratica2;
//import java.util.Scanner; *OBS. Descomentar linhas comentadas no main caso deseja utilizar o Scanner;

/*Exerc�cio 4) Fazer um programa para validar o CPF inserido pelo usu�rio � v�lido. O CPF � um 
n�mero composto por 11 d�gitos, em que os 2 �ltimos s�o d�gitos verificadores.

>O n�mero do CPF � escrito na forma ABCDEFGHI/JK ou diretamente como ABCDEFGHIJK, onde 
os algarismos n�o podem ser todos iguais entre si.

>O J � chamado 1� d�gito verificador do n�mero do CPF.
>O K � chamado 2� d�gito verificador do n�mero do CPF.

>Calcular J --> (10A + 9B + 8C + 7D + 6E + 5F + 4G + 3H + 2I)/11 --> com o resto (m�dulo),
 Se for 0 ou 1, o d�gito J � 0 (zero). Se for 2, 3, 4, 5, 6, 7, 8, 9 ou 10, o d�gito J � [11 - RESTO]
  
>Calcular K --> (11A + 10B + 9C + 8D + 7E + 6F + 5G + 4H + 3I + 2J)/11 --> com o resto (m�dulo),
 Se for 0 ou 1, o d�gito K � 0 (zero). Se for 2, 3, 4, 5, 6, 7, 8, 9 ou 10, o d�gito K � [11 - RESTO]*/

public class Exercicio_4 {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o CPF a ser verificado: ");
		//String CPF = sc.nextLine();
		String CPF = "97534874017"; //OBS. CPF feito a partir de gerador de CPF para verifica��o
		
		String Resultado = (verificarCPF(CPF)) ? "CPF V�lido" : "CPF Inv�lido";
		System.out.println(Resultado);
		
		//sc.close();
		
	}
	
	static boolean verificarCPF(String cpf) {
		
		//Transformar CPF String para Int
		int A = Integer.parseInt(cpf.substring(0, 1));
		int B = Integer.parseInt(cpf.substring(1, 2));
		int C = Integer.parseInt(cpf.substring(2, 3));;
        
		int D = Integer.parseInt(cpf.substring(3, 4));
		int E = Integer.parseInt(cpf.substring(4, 5));
		int F = Integer.parseInt(cpf.substring(5, 6));
        
		int G = Integer.parseInt(cpf.substring(6, 7));
		int H = Integer.parseInt(cpf.substring(7, 8));
		int I = Integer.parseInt(cpf.substring(8, 9));
        
		int J = Integer.parseInt(cpf.substring(9, 10));
		int K = Integer.parseInt(cpf.substring(10, 11));
		
		//Verificar calculo J
		int restoJ = (10 * A + 9 * B + 8 * C + 7 * D + 6 * E + 5 * F + 4 * G + 3 * H + 2 * I) % 11;
		
		switch(restoJ) {
		
			case 0: if (J != 0) {
				return false;
				}
			
			case 1: if (J != 0) {
				return false;
				}
			
			default: if(J != 11 - restoJ) {
				return false;
			}
			
		}
		
		//Verificar calculo K
		int restoK = (11 * A + 10 * B + 9 * C + 8 * D + 7 * E + 6 * F + 5 * G + 4 * H + 3 * I + 2 * J) % 11;
		
		switch(restoK) {
		
			case 0: if (K != 0) {
				return false;
				}
			
			case 1: if (K != 0) {
				return false;
				}
			
			default: if(K != 11 - restoK) {
				return false;
			} else {
				return true;
			}
			
		}
		
	}
	
}
