package atividadepratica4;

import java.util.Scanner;

public class AtividadePratica4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1;
		float n2;
		float n3;
		float n4;
		float diferenca;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do número 1: ");
		n1 = scanner.nextFloat();
		
		System.out.println("Digite o valor do número 2: ");
		n2 = scanner.nextFloat();
		
		System.out.println("Digite o valor do número 3: ");
		n3 = scanner.nextFloat();
		
		System.out.println("Digite o valor do número 4: ");
		n4 = scanner.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		System.out.println("O valor da diferença é: " + diferenca);

	}

}
