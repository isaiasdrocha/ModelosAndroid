package br.com.isaiasdrocha.modelosandroid.enuns;

public enum EnumMenuDrawer {

	POPUP("Caixa pop-up"),
	OP��O1("Op��o 1"),
	OP��O2("Op��o 1"),
	OP��O3("Op��o 1"),
	OP��O4("Op��o 1");
	
	private String descricao;
	
	private EnumMenuDrawer(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
