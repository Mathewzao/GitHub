import java.util.Scanner;
public class atividade6 {
	public static void main(String [] arg) 
	{
		Scanner nota = new Scanner(System.in);
		
		double A, B, C;
		double MEDIA;
		
		System.out.println("Digite sua nota 1: ");
		A = nota.nextDouble();
		System.out.println("Digite sua nota 2: ");
		B = nota.nextDouble();
		System.out.println("Digite sua nota 3: ");
		C = nota.nextDouble();
		
		MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10;
		System.out.printf("MEDIA = %.1f%n", MEDIA);
	}

}
