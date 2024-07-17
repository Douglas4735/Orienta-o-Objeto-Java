package aulaPoo;

import java.math.BigDecimal;

public class Produto {
	
	private Long id;
	private String nome;
	private BigDecimal Valor;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getValor() {
		return Valor;
	}
	public void setValor(BigDecimal valor) {
		Valor = valor;
	}
	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", Valor=" + Valor + "]";
	}
	
	
	
	
	
}
