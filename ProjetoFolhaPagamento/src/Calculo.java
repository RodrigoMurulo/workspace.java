import java.util.Scanner;
public class Calculo {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int opcao;
				
		Funcionario f1;
		f1 = new Funcionario();
		f1.setNumeroFuncional(987987987);
		f1.setNome("Juninho");
		f1.setEmail("juninho@rvm-bank.com.br");
		f1.setSalario(2500.00);
	
		Funcionario f2;
		f2 = new Funcionario();
		f2.setNumeroFuncional(382456789);
		f2.setNome("Zezinho");
		f2.setEmail("zezinho@rvm-bank.com.br");
		f2.setSalario(12800.00);

		Funcionario f3;
		f3 = new Funcionario();
		f3.setNumeroFuncional(153369980);
		f3.setNome("Fulano");
		f3.setEmail("fulano@rvm-bank.com.br");
		f3.setSalario(3650.00);
		
		// menu
		do {
			System.out.println("Bem vindo ao sistema do RVM Bank");
			System.out.println("Digite 1 para informações do funcionário 1");
			System.out.println("Digite 2 para informações do funcionário 2");
			System.out.println("Digite 3 para informações do funcionário 3");
			System.out.println("Digite 0 para sair");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Informações do funcionário 1:");
				System.out.println(f1.exibir());
				System.out.println("O valor do imposto é:" + f1.calcularImposto() + "\n");
				break;
			case 2:
				System.out.println("Informações do funcionário 2:");
				System.out.println(f2.exibir());
				System.out.println("O valor do imposto é:" + f2.calcularImposto() + "\n");
				break;				
			case 3:
				System.out.println("Informações do funcionário 3:");
				System.out.println(f3.exibir());
				System.out.println("O valor do imposto é:" + f3.calcularImposto() + "\n");
				break;
			case 0:
				System.out.println("---FIM!---");
				break;
			default:
				System.out.println("ERRO: Você sabe ler? Sim? Então, digita apenas uma das opções mencionadas acima! \n");
			}
		} while (opcao != 0);
		teclado.close();
	}
}
