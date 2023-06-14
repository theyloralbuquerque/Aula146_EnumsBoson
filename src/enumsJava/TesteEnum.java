package enumsJava;

public class TesteEnum {
	EnumPlanetas planeta; // o atributo planeta ser� do tipo EnumPlanetas.

	TesteEnum(String planeta) { // construtor que recebe uma String planeta como par�metro.
		this.planeta = EnumPlanetas.valueOf(planeta); // .valueOf() converte uma String em uma Enum.
													  // this.planeta recebe a String planeta convertida em uma Enum.
	}
	
	public void viajarPlaneta() { // m�todo viajarPlaneta, exibir� uma mensagem conforme o valor do Enum digitado pelo usu�rio
		switch(planeta) { // escolha(planeta)
		case MERC�RIO:
			System.out.println("MUITO QUENTE POR L�!");
			break;
		case TERRA:
			System.out.println("J� ESTAMOS AQUI!");
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
