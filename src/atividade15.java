import java.util.Scanner;
public class atividade15 {
	public static void main(String [] arg)
	{
		Scanner valor = new Scanner(System.in);
		
		double x1, x2, y1, y2;
		double distancia2pontos;
		
		System.out.println("Digite o valor de x1: ");
		x1 = valor.nextDouble();
		System.out.println("Digite o valor de x2: ");
		x2 = valor.nextDouble();
		System.out.println("Digite o valor de y1: ");
		y1 = valor.nextDouble();
		System.out.println("Digite o valor de y2: ");
		y2 = valor.nextDouble();
		
		distancia2pontos = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.printf("%.4f%n", distancia2pontos);
	}
}
