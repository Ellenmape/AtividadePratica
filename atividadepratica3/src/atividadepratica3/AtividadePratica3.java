package atividadepratica3;

import java.util.Scanner;

public class AtividadePratica3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		float salarioLiquido;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o valor do salário bruto: ");
		salarioBruto = scanner.nextFloat();
		
		System.out.println("Digite o valor de adicional noturno: ");
		adicionalNoturno = scanner.nextFloat();
		
		System.out.println("Digite o valor de horas extras: ");
		horasExtras = scanner.nextFloat();
		
		System.out.println("Digite o valor de descontos: ");
		descontos = scanner.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("O valor do salário líquido é: " + salarioLiquido);

	}

}
