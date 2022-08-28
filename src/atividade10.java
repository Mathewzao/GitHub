import java.util.Scanner;
public class atividade10 {
	public static void main(String [] arg)
	{
		Scanner numero = new Scanner(System.in);
		
		int cdpc1, cdpc2, qtpc1, qtpc2;
		double vlpc1, vlpc2, TOTAL;
		
		System.out.print("Digite o CODIGO da 1a peca: "); cdpc1 = numero.nextInt(); System.out.print("Digite a quantidade de pecas: "); qtpc1 = numero.nextInt(); System.out.print("Digite o VALOR UNITARIO da 1a peca: "); vlpc1 = numero.nextDouble();
		
		System.out.print("Digite o CODIGO da 2a peca: "); cdpc2 = numero.nextInt(); System.out.print("Digite a quantidade de pecas: "); qtpc2 = numero.nextInt(); System.out.print("Digite o VALOR UNITARIO da 2a peca: "); vlpc2 = numero.nextDouble();
		
		TOTAL = qtpc1 * vlpc1 + qtpc2 * vlpc2;
		System.out.printf("VALOR A PAGAR: R$:%.2f%n", TOTAL);
		
		// OBS: Não consegui colocar cada valor organizado em linha e coluna, de acordo com o que se pede no enunciado (erro de interpretação?).
		
	}
}
