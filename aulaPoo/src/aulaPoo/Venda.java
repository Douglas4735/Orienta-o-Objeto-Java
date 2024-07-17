package aulaPoo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {

	
	private long id;
	
	private String descricaoVenda;
	private String nomeCliente;
	private String endereçoEntrega;
	private BigDecimal valorTotal;
	
	private List<Produto> produtos = new ArrayList<Produto>();
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricaoVenda() {
		return descricaoVenda;
	}
	public void setDescricaoVenda(String descricaoVenda) {
		this.descricaoVenda = descricaoVenda;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEndereçoEntrega() {
		return endereçoEntrega;
	}
	public void setEndereçoEntrega(String endereçoEntrega) {
		this.endereçoEntrega = endereçoEntrega;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	@Override
	public String toString() {
		return "Venda [id=" + id + ", descricaoVenda=" + descricaoVenda + ", nomeCliente=" + nomeCliente
				+ ", endereçoEntrega=" + endereçoEntrega + ", valorTotal=" + valorTotal + ", produtos=" + produtos
				+ "]";
	}
	
	
	
}
