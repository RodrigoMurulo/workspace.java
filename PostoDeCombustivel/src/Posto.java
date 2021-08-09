
public class Posto {
	public static void main(String[] args) {
		BombaDeCombustivel b1;
		b1 = new BombaDeCombustivel("Etanois", 4.34);
		b1.abastecerPorLitros(9);
		System.out.println(b1.exibirRecibo());
		
		System.out.println("\n");
		
		b1.abastecerPorValor(50);
		System.out.println(b1.exibirRecibo());
	}

}
