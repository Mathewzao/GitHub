import java.util.Scanner;
public class atividade8 {
	public static void main(String [] arg)
	{
		Scanner valor = new Scanner(System.in);
		
		int NUMF, NUMH;
		double valorhora, salario;
		
		System.out.println("Digite o NUMERO de FUNCIONARIO: ");
		NUMF = valor.nextInt();
		System.out.println("Digite o NUMERO de HORAS TRABALHADAS: ");
		NUMH = valor.nextInt();
		System.out.println("Informe o valor pago por hora de trabalho: ");
		valorhora = valor.nextDouble();
		
		System.out.println("NUMERO = " + NUMF);
		salario = (NUMH * valorhora);
		System.out.printf("SALARIO = R$:%.2f%n", salario);
	}
}
