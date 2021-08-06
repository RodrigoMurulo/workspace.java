package contacorrente;

public class conta {
	
	int numeroConta;
	int digitoVerificador;
	String nomeTitular;
	String cpf;
	double saldo;
	
	void exibir() {
		System.out.println("Conta corrente: " + numeroConta + " - " + digitoVerificador);
		System.out.println("       Cliente: " + nomeTitular);
		System.out.println("           CPF: " + cpf);
		System.out.printf("          Saldo: R$ %.2f\n" , saldo);
		System.out.println("\n");
	}
	void depositar(double valor) {
		saldo = saldo + valor;
	}
	void sacar(double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			System.out.println("Saque autorizado na conta " + numeroConta + "/" + digitoVerificador);
		}
		else {
			System.out.println("Ta sem grana meu chegado.");
		}
	}
}
