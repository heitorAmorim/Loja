package entities;

public class Produtos {
	
	private String nome;
	private Double preco;
	private int quantidade;
	
	public Produtos() {
		super();
	}
	
	public Produtos(String nome, Double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void alterarPreco(double novoPreco) {
		preco = novoPreco;
	}
	
	public void aumentarQuant(int alterarQuantidade) {
		quantidade += alterarQuantidade;
	}
	public void diminuirQuant(int alterarQuantidade) {
		quantidade -= alterarQuantidade;
	}

	public String toString() {
		return " Produto:"+nome+"\n Quantidade: " + quantidade + "\n Preço: R$" + preco;
	}
	
	
}

