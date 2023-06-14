package enumsJava;

public class TesteEnum {
	EnumPlanetas planeta; // o atributo planeta será do tipo EnumPlanetas.

	TesteEnum(String planeta) { // construtor que recebe uma String planeta como parâmetro.
		this.planeta = EnumPlanetas.valueOf(planeta); // .valueOf() converte uma String em uma Enum.
													  // this.planeta recebe a String planeta convertida em uma Enum.
	}
	
	public void viajarPlaneta() { // método viajarPlaneta, exibirá uma mensagem conforme o valor do Enum digitado pelo usuário
		switch(planeta) { // escolha(planeta)
		case MERCÚRIO:
			System.out.println("MUITO QUENTE POR LÁ!");
			break;
		case TERRA:
			System.out.println("JÁ ESTAMOS AQUI!");
			break;
		case URANO:
			System.out.println("MUITO LONGE!");
			break;
		default:
			System.out.println("PASSAGENS ESGOTADAS!");
			break;
		}
	}


}
