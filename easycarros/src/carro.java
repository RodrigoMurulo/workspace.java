public class carro {
	String marca;
	String modelo;
	int ano;
	String cor;
	double preco;
	//criar trechos de c�digos (subrotinas - m�todos)
	//param manipular, exibir e alterar as vari�veis
	//void nao retorna nenhum valor
	void exibirInfo() {
		System.out.println("   Carro: " + marca + " - " + modelo);
		System.out.println("     Ano: " + ano);
		System.out.println("     Cor: " + cor);
		System.out.println("Pre�o: R$ " + preco + "\n");
	}
	void aplicarDesconto(double percentual) {
		preco = preco - preco*percentual/100;
	}
	//trazer uma funcionalidade que retorne o valor do IPVA
	//baseado no pre�o, nome
	double calcularipva() {
		double valoripva;
		if (ano < 2000) {
			valoripva = 0.0;
		}
		else {
			valoripva = preco*0.07;
		}
		return valoripva;
	}
}
