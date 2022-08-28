import java.util.Scanner;
public class atividade1 {
	
	public static void main(String [] arg) 
	{
		Scanner numero = new Scanner(System.in);
		int A, B;
		System.out.println("Digite um numero inteiro: ");
		A = numero.nextInt();
		System.out.println("Digite outro numero inteiro: ");
		B = numero.nextInt();
		
		int X;
		X = A + B;
		System.out.println("X = " + X);
	}
}
