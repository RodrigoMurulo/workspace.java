
public class Conta {
	// vamos encapsular (blindar as infos) usando o "private";
	private int numeroConta;
	private int digitoVerificador;
	private String nomeTitular;
	private String cpf;
	private double saldo;

	public String exibir() {
		return "Conta: " + numeroConta + "/" + digitoVerificador + "\n" + "Titular: " + nomeTitular + " (" + cpf + ")"
				+ "\n" + "Saldo: R$ " + saldo + "\n";
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}

	// boolean é um tipo de dado que assume valores verdadeiro ou falso
	public boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			return true;
		} else {
			return false;
		}
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getDigitoVerificador() {
		return digitoVerificador;
	}

	public void setDigitoVerificador(int digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
