package br.com.isaiasdrocha.modelosandroid.enuns;

public enum EnumMenuDrawer {

	POPUP("Caixa pop-up"),
	OPÇÃO1("Opção 1"),
	OPÇÃO2("Opção 1"),
	OPÇÃO3("Opção 1"),
	OPÇÃO4("Opção 1");
	
	private String descricao;
	
	private EnumMenuDrawer(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
