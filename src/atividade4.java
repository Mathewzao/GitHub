import java.util.Scanner;
public class atividade4 {
	public static void main(String [] arg) 
	{
		Scanner numero = new Scanner(System.in);
		
		int A, B;
		int PROD;
		
		System.out.println("Digite um numero inteiro a sua escolha: ");
		A = numero.nextInt();
		
		System.out.println("Digite mais um numero inteiro a sua escolha: ");
		B = numero.nextInt();
		
		PROD = A * B;
		System.out.println("PROD = " + PROD );
	}
}
