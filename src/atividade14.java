import java.util.Scanner;
public class atividade14 {
	public static void main(String [] arg)
	{
		Scanner numero = new Scanner(System.in);
		
		double Y, consmedio;
		int X;
		
		System.out.println("Digite a DISTANCIA PERCORRIDA: ");
		X = numero.nextInt();
		System.out.println("Digite a quantidade de COMBUSTIVEL GASTO: ");
		Y = numero.nextDouble();
		
		consmedio = X/Y;
				System.out.printf( "%.3f km/l%n", consmedio );
	}

}
