import java.util.Scanner;
public class atividade11 {
	public static void main(String [] arg)
	{
		Scanner numero = new Scanner(System.in);
		
		double pi, raio, VOLUME;
		
		System.out.println("Digite o valor do raio: ");
		raio = numero.nextDouble();
		
		pi = 3.14159;
		
		VOLUME = ((4/3) * pi * Math.pow(raio, 3));
		System.out.printf("VOLUME = %.3f%n", VOLUME);
	}

}
