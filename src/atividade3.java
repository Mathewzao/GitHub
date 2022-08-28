import java.util.Scanner;
public class atividade3 {
	public static void main(String [] arg) 
	{
		Scanner numero = new Scanner(System.in);
		int A, B;
		
		System.out.println("Digite um numero inteiro: ");
		A = numero.nextInt();
		System.out.println("Digite mais um numero inteiro: ");
		B = numero.nextInt();
		
		int soma;
		soma = A + B;
		System.out.println("SOMA = " + soma);
	}
}
