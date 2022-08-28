import java.util.Scanner;
public class atividade9 {
	public static void main(String [] arg)
	{
		Scanner valor = new Scanner(System.in);
		
		String nome;
		double salario, venda, TOTAL;
		
		System.out.println("Digite o seu NOME: ");
		nome = valor.next();
		System.out.println("Digite o seu SALARIO FIXO: ");
		salario = valor.nextDouble();
		System.out.println("Digite o total de VENDAS efetuadas no mes: ");
		venda = valor.nextDouble();
		
		TOTAL = salario + venda * 0.15;
		
		System.out.printf("TOTAL = R$:%.2f%n", TOTAL);	
	}
}
