import java.util.Scanner;
public class atividade12 {
	public static void main(String [] arg) 
	{
		Scanner valor = new Scanner(System.in);
		
		double A, B, C, pi;
		pi = 314159;
		
		System.out.printf("Digite o valor de A: ");
		A = valor.nextDouble();
		System.out.printf("Digite o valor de B: ");
		B = valor.nextDouble();
		System.out.printf("Digite o valor de C: ");
		C = valor.nextDouble();
		
		
		
		System.out.printf("TRIANGULO: %.3f%n", ((A * C)/2));
		System.out.printf("CIRCULO: %.3f%n", pi * C * C);
		System.out.printf("TRAPEZIO: %.3f%n", (((A + B) * C)/2));
		System.out.printf("QUADRADO: %.3f%n", (B * B));
		System.out.printf("RETANGULO: %.3f%n", (A * B));
	}
}
