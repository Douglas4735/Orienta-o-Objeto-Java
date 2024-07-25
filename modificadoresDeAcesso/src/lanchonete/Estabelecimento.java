package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		
		Cozinheiro cozinheiro = new Cozinheiro();
		//ações que não precisam estarem disponiveis para toda a aplicação
		
		cozinheiro.lavarIngredientes();
		cozinheiro.baterVitaminaLiquidificador();
		cozinheiro.selecionarIngredientesVitamina();
		cozinheiro.prepararLanche();
		cozinheiro.prepararVitamina();
		
		//ações que o estabelecimento precisa ter ter ciência
		cozinheiro.adicionarComboNoBalcao();
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		
		//Almoxarife almoxarife = new Almoxarife();
		//ações que não precisam estarem disponiveis para toda a aplicação

		//almoxarife.controlarEntrada();
		//almoxarife.controlarSaida();
		
		//ações que somente seu o pacote cozinha precisa conhecer (default)
		
		//almoxarife.entregarIngredientes();
		//almoxarife.trocarGas();
		
		Atendente atendente = new Atendente();
		//atendente.pegarLancheCozinha();
		atendente.receberPagamento();
		atendente.servindoMesa();
		//ações que somente seu o pacote cozinha precisa conhecer (default)
		//atendente.trocarGas();
		
		Cliente cliente = new Cliente();
		cliente.fazerPedido();
		cliente.escolherLanche();
		cliente.pagarConta();
		
		//não deveria, mas o estabelecimento ainda não definiu normas de atendimento
		cliente.pegarPedidoNoBalcao();
		
		//esta ação muito sigilosa, que tal ser privada?
		cliente.consultarSaldoNoAplicativo();
		
		//já pensou o cliente ouvindo que o gás acabou?
		//cozinheiro.pedirParaTrocarGas(atendente);
		//cozinheiro.pedirIngrediente(almoxarife);
	}

}
