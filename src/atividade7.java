import java.util.Scanner;
public class atividade7 {
	public static void main(String [] arg) 
	{
	Scanner valor = new Scanner(System.in);
	
	int A, B, C, D;
	int DIF;
	
	System.out.println("Digite um numero inteiro a sua escolha: ");
	A = valor.nextInt();
	System.out.println("Digite um outro numero inteiro a sua escolha:");
	B = valor.nextInt();
	System.out.println("Digite um novo numero inteiro a sua escolha");
	C = valor.nextInt();
	System.out.println("Digite mais um numero inteiro a sua escolha");
	D = valor.nextInt();
	
	DIF = (A * B - C * D);
	System.out.println("DIF = " + DIF);
	
	}

}
