

public class loja {
	public static void main(String[] args) {
		carro c1, c2; //carro é um novo tipo de dado, sendo c1 e c2 objetos
		//solicitar à vm um espaço na memória
		c1 = new carro();
		c2 = new carro();
		c1.marca = "Mercedes";
		c1.modelo = "C 280";
		c1.ano    = 1997;
		c1.cor	  = "Preto";
		c1.preco  = 35000;
		
		c2.marca = "Mercedes";
		c2.modelo = "C 200";
		c2.ano    = 2011;
		c2.cor    = "Cinza";
		c2.preco  = 58000;
		
		//exibição do anúncio
		/*System.out.println("  Carro: " + c1.marca + " - " + c1.modelo);
		System.out.println("    Ano: " + c1.ano);
		System.out.println("    Cor:" + c1.cor);
		System.out.println("Preco R$ " + c1.preco + "\n");
		
		System.out.println("  Carro: " + c2.marca + " - " + c2.modelo);
		System.out.println("    Ano: " + c2.ano);
		System.out.println("    Cor:" + c2.cor);
		System.out.println("Preco R$ " + c2.preco);*/
		
		c1.exibirInfo();
		c2.exibirInfo();
		System.out.println("Aplicando o desconto");
		c1.aplicarDesconto(10.0);
		c2.aplicarDesconto(5.0);
		System.out.println("_________________________________");
		c1.exibirInfo();
		c2.exibirInfo();
		
		System.out.println("Valor do IPVA do"+c1.modelo+" é "+c1.calcularipva());
		System.out.println("Valor do IPVA do"+c2.modelo+" é "+c2.calcularipva());
	}
}
