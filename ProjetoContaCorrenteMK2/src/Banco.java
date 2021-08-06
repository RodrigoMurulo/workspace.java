import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		// declarar as variáveis do tipo conta;
		// fazer um menu pra manipular 1 conta apenas;
		// toda iteração com o usuário fica aqui;

		Scanner teclado = new Scanner(System.in);
		int opcao;
		double valor;

		Conta c1;
		c1 = new Conta();
		c1.setNumeroConta(1234);
		c1.setDigitoVerificador(5);
		c1.setNomeTitular("Rodrigo");
		c1.setCpf("123.456.789-00");
		c1.setSaldo(45000.00);

		// menu
		do {
			System.out.println("Bem vindo ao RVM Bank");
			System.out.println("Digite 1 para informações");
			System.out.println("Digite 2 para depósitos");
			System.out.println("Digite 3 para saques");
			System.out.println("Digite 0 para sair");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1: 
				System.out.println(c1.exibir());
				break;
			case 2:
				System.out.println("DEPÓSITO - Digite o valor a ser depositado: ");
				valor = teclado.nextDouble();
				c1.depositar(valor);
				break;
			case 3:
				System.out.println("SAQUE - Digite o valor desejado: ");
				valor = teclado.nextDouble();
				if (c1.sacar(valor)) {
					System.out.println("SAQUE autorizado!");
				}
				else {
					System.out.println("Você não possui dinheiro suficiente! Vá trabalhar mais!");
				}
				break;
			case 0:
				System.out.println("---Agradecemos a sua preferência e o seu dinheiro rs---");
				break;
			default:
				System.out.println("ERRO: Você sabe ler? Sim? Então, digita apenas uma das opções mencionadas acima!");
			}
		} while (opcao != 0);
		teclado.close();
	}

}