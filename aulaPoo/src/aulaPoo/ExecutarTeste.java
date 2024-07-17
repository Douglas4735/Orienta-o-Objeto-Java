package aulaPoo;

import java.math.BigDecimal;

public class ExecutarTeste {
		public static void main(String[] args) {
			
			Produto produto1 = new Produto();
			produto1.setId(1L);
			produto1.setNome("Módulo Orientação Objeto");
			produto1.setValor(BigDecimal.valueOf(100.00));
			

			Produto produto2 = new Produto();
			produto2.setId(2L);
			produto2.setNome("Módulo Spring Boot API Rest");
			produto2.setValor(BigDecimal.valueOf(200.00));
			
			
			
		
			Venda venda = new Venda();
			venda.setDescricaoVenda("Curso Java Web");
			venda.setEndereçoEntrega("Entrega Pelo E-mail");
			venda.setId(3L);
			venda.setNomeCliente("douglas da silva soares");
			venda.setValorTotal(BigDecimal.valueOf(198.00));
			
			venda.getProdutos().add(produto1);
			venda.getProdutos().add(produto2);
			
			for(Produto produto : venda.getProdutos()) {
				System.out.println("Descrição venda: " + produto);
			}
			
			System.out.println("Descrição da venda: " + venda);
			
		}
}
