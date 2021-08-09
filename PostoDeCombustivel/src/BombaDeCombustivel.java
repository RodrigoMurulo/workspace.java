
public class BombaDeCombustivel {
	
	private String nome;
	private double precoLitro;
	private double quantidadeLitros;
	private double precoPagar;
	
	
	public BombaDeCombustivel(String nome, double precoLitro) {
		super();
		this.nome = nome;
		this.precoLitro = precoLitro;
	}
	
	public void abastecerPorLitros(double quantidadeLitros) {
		this.quantidadeLitros = quantidadeLitros;
		precoPagar = quantidadeLitros * precoLitro;
	}
	
	public void abastecerPorValor(double valor) {
		this.precoPagar = valor;
		this.quantidadeLitros = this.precoPagar / this.precoLitro;
	}
	
	public String exibirRecibo() {
		String recibo = "************************************************\n"+
						"*                RVM OIL COMPANY               *\n"+
						"------------------------------------------------\n"+
						"Combustivel: "+nome+"\n"+
						"Preço por litro: R$"+ String.format("%.3f", precoLitro)+"\n"+
						"Quantidade de litros: " + String.format("%.3f", quantidadeLitros)+"\n"+
						"Valor a pagar: R$"+ String.format("%.3f", + precoPagar)+"\n"+
						"************************************************";
		return recibo;			
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrecoLitro() {
		return precoLitro;
	}
	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}
	public double getQuantidadeLitros() {
		return quantidadeLitros;
	}
	public void setQuantidadeLitros(double quantidadeLitros) {
		this.quantidadeLitros = quantidadeLitros;
	}
	public double getPrecoPagar() {
		return precoPagar;
	}
	public void setPrecoPagar(double precoPagar) {
		this.precoPagar = precoPagar;
	}
	
	
		
}


