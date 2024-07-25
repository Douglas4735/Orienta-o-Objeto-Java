package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {

	public void adicionarLancheNoBalcao() {
		//PODE SER DEFAULT
		System.out.println("ADICIONANDO LANCHE NATURAL DE HAMBURGER NO BALCAO");
	}
	public void adicionarSucoNoBalcao() {
		//PODE SER DEFAULT
		System.out.println("ADICIONANDO SUCO NO BALCAO");
	}
	public void adicionarComboNoBalcao(){
	adicionarLancheNoBalcao();
	adicionarSucoNoBalcao();
	}
	public void prepararLanche() {
		System.out.println("PREPARANDO LANCHE TIPO HAMBURGER");
	}
	public void prepararVitamina() {
		System.out.println("PREPARANDO VITAMINA");
	}
	public void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	public void selecionarIngredientesLanche() {
		System.out.println("SELECIONANDO O PÃO, SALADA, OVO E CARNE");
	}
	public void selecionarIngredientesVitamina() {
		System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");
	}
	public void fritarIngredientesLanche() {
		System.out.println("FRITANDO A CARNE E OVO PARA HAMBURGER");
	}
	public void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
	}
	public void baterVitaminaLiquidificador() {
		System.out.println("BATER VITAMINA LIQUIDIFICADIR");
	}
	/*
	public void pedirParaTrocarGas(Atendente meuAmigo) {
		meuAmigo.trocarGas();
	}
	*/
	public void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	public void pedirIngrediente(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
	