package empregados;

public class empregadossaida {
	public static void main(String[] args) {
		empregado e1, e2, e3;
		e1 = new empregado();
		e2 = new empregado();
		e3 = new empregado();
		
		e1.nome = "Rodrigo";
		e1.cargo = "Engenheiro";
		e1.salario = 7500;
		
		e2.nome = "Juninho";
		e2.cargo = "Pegador";
		e2.salario = 700;
		
		System.out.println("----Antes do aumento---");
		e1.imprimir();
		e2.imprimir();
		
		System.out.println();
		e1.aumentarsalario(17);
		e2.aumentarsalario(6);
		
		System.out.println("---Depois do aumento---");
		e1.imprimir();
		e2.imprimir();
	}
}
