package contacorrente;

public class banco {
	public static void main(String[] args) {
		
		conta c1;
		c1 = new conta();
		
		c1.numeroConta = 15333;
		c1.digitoVerificador = 1;
		c1.nomeTitular = "Rodrigo";
		c1.cpf = "153.369.984 - 02";
		c1.saldo = 32000;
		
		c1.exibir();
		c1.depositar(500);
		c1.exibir();
		c1.sacar(270);
	}

}
