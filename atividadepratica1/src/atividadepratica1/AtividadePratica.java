package atividadepratica1;
import java.util.Scanner;

public class AtividadePratica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salario;
		float abono;
		float novoSalario;
		
	Scanner leiaSalario = new Scanner(System.in);
    Scanner leiaAbono = new Scanner(System.in);
	
		
	System.out.println("Digite o valor do salário: ");
	salario = leiaSalario.nextFloat();
	System.out.println("O valor do salario é: " + salario);
	
	System.out.println("Digite o valor do abono: ");
    abono = leiaAbono.nextFloat();	
	System.out.println("O valor do abono é: " + abono);
	
	novoSalario = salario + abono;
	
	System.out.println("Seu novo salário é: " + novoSalario);
	

	}

}
