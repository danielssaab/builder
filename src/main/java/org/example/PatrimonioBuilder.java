package org.example;

import java.util.Date;

public class PatrimonioBuilder {
	private Patrimonio patrimonio;

	public PatrimonioBuilder() {
		this.patrimonio = new Patrimonio();
	}

	public PatrimonioBuilder setId(int id) {
		patrimonio.setId(id);
		return this;
	}

	public PatrimonioBuilder setNome(String nome) {
		patrimonio.setNome(nome);
		return this;
	}

	public PatrimonioBuilder setDataAquisicao(Date dataAquisicao) {
		patrimonio.setDataAquisicao(dataAquisicao);
		return this;
	}

	public PatrimonioBuilder setDescricao(String descricao) {
		patrimonio.setDescricao(descricao);
		return this;
	}

	public PatrimonioBuilder setLocalizacao(String localizacao) {
		patrimonio.setLocalizacao(localizacao);
		return this;
	}

	public PatrimonioBuilder setDepartamento(String departamento) {
		patrimonio.setDepartamento(departamento);
		return this;
	}

	public PatrimonioBuilder setValor(double valor) {
		patrimonio.setValor(valor);
		return this;
	}

	public PatrimonioBuilder setStatus(String status) {
		patrimonio.setStatus(status);
		return this;
	}


	public Patrimonio build() {
		if (patrimonio.getId() == 0) {
			throw new IllegalArgumentException("Id inválido");
		}
		if (patrimonio.getNome().equals("")) {
			throw new IllegalArgumentException("Nome inválido");
		}
		return patrimonio;
	}
}
