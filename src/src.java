import java.util.Scanner;
public class src {
	
	public static void main(String [] arg) 
	{
		Scanner numero = new Scanner(System.in);
		int a, b;
		System.out.println("Digite um numero inteiro: ");
		a = numero .nextInt();
		System.out.println("Digite outro numero inteiro: ");
		b = numero .nextInt();
		
		int x;
		x = a + b;
		System.out.println("A soma entre os numero digitados: "); System.out.println(x);
	}
	
}
