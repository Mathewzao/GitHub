import java.util.Scanner;
public class atividade5 {
		public static void main(String [] arg) 
		{
		Scanner nota = new Scanner(System.in);
		
		double A, B;
		double MEDIA;
		
		System.out.println("Digite sua primeira nota: ");
		A = nota.nextDouble();
		System.out.println("Digite sua segunda nota: ");
		B = nota.nextDouble();
		
		MEDIA = ((A * 3.5) + (B * 7.5)) / 11.0;
		System.out.printf("MEDIA = %.5f%n", MEDIA);
		}
}
