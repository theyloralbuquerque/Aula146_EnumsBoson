package enumsJava;

import java.util.Scanner;

public class EnumsMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Listar os valores da Enum
		/*for(EnumPlanetas p : EnumPlanetas.values()) { // Laço for each. O método .values() é um método das Enums.
			System.out.printf("%s\n", p);
		}
		*/
		
		String planeta;
		System.out.print("Para qual planeta deseja viajar? ");
		planeta = sc.next().toUpperCase(); // .toUpperCase() converte tudo o que o usuário digitar em MAIÚSCULO. 
		sc.close();
		
		TesteEnum pl = new TesteEnum(planeta); // instanciação da classe TesteEnum, passando a String planeta como parâmetro para o construtor. 
		pl.viajarPlaneta(); // chamada do método viajarPlaneta da classe TesteEnum.
		
		
	}

}
