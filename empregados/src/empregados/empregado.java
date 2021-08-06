package empregados;

public class empregado {
	String nome;
	String cargo;
	double salario;
	
	void imprimir() {
		System.out.println("Nome: "+nome+" ("+cargo+") R$ "+salario);
	}
	void aumentarsalario(double perc) {
		salario = salario + salario*perc/100;
	}
}
