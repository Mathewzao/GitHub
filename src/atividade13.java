import java.util.Scanner;
public class atividade13 {
	public static void main(String [] arg)
	{
		Scanner valor = new Scanner(System.in);
		
		int A, B, C;
		int maior_AB, maior_ABC;
		
		System.out.println("Digite o valor de A: ");
		A = valor.nextInt();
		System.out.println("Digite o valor de B: ");
		B = valor.nextInt();
		System.out.println("Digite o valor de C: ");
		C = valor.nextInt();
		
		maior_AB = (A + B + Math.abs(A - B))/2;
		maior_ABC = (maior_AB + C + Math.abs(maior_AB - C))/2;
		
		System.out.println("O maior eh " + maior_ABC);
	}
}
