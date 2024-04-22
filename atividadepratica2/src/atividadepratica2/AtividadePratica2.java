package atividadepratica2;

import java.util.Scanner;

public class AtividadePratica2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float media;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = scanner.nextFloat();
				
		System.out.println("Digite a segunda nota: ");
		nota2 = scanner.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = scanner.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		nota4 = scanner.nextFloat();
				
		media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua média é: " + media);
        media = scanner.nextFloat();
	}

}
