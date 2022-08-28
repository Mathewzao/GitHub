import java.util.Scanner;
public class atividade2 {
	
	public static void main(String [] arg) 
	{
		Scanner digit = new Scanner(System.in);
		double area, raio, pi;
		pi = 3.14159;
		
		System.out.println("Digite o valor do raio: ");
		raio = digit .nextDouble();
		
		area = pi * raio * raio;
		System.out.printf("A = %.4f%n", area);

	}
}
