package org.example;
import java.util.Date;

public class Patrimonio {
	private int id;
	private String nome;
	private Date dataAquisicao;
	private String descricao;
	private String localizacao;
	private String departamento;
	private double valor;
	private String status;

	public Patrimonio() {
		this.nome = "";
		this.valor = 0.0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(Date dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Patrimonio{" +
			"id=" + id +
			", nome='" + nome + '\'' +
			", dataAquisicao=" + dataAquisicao +
			", descricao='" + descricao + '\'' +
			", localizacao='" + localizacao + '\'' +
			", departamento='" + departamento + '\'' +
			", valor=" + valor +
			", status='" + status + '\'' +
			'}';
	}
}