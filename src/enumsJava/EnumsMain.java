package enumsJava;

import java.util.Scanner;

public class EnumsMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Listar os valores da Enum
		/*for(EnumPlanetas p : EnumPlanetas.values()) { // La�o for each. O m�todo .values() � um m�todo das Enums.
			System.out.printf("%s\n", p);
		}
		*/
		
		String planeta;
		System.out.print("Para qual planeta deseja viajar? ");
		planeta = sc.next().toUpperCase(); // .toUpperCase() converte tudo o que o usu�rio digitar em MAI�SCULO. 
		sc.close();
		
		TesteEnum pl = new TesteEnum(planeta); // instancia��o da classe TesteEnum, passando a String planeta como par�metro para o construtor. 
		pl.viajarPlaneta(); // chamada do m�todo viajarPlaneta da classe TesteEnum.
		
		
	}

}
