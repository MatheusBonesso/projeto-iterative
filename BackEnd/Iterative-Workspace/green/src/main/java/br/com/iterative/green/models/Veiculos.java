package br.com.iterative.green.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
public class Veiculos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int ano;
	
	@UniqueElements
	private Long codigoEtiqueta;

	@OneToOne
	private Financeiro financeiro;

	private DiasDeUtilizacao diasUtilizacao;
	private String marca;
	private String cor;
	private String modelo;
	private LocalDateTime dataHoraUltimaCorrida;
	private Double velocidadeMaxima;
	private Double quilometragem;
	private String urlImagem;
	private boolean emUso;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public LocalDateTime getDataHoraUltimaCorrida() {
		return dataHoraUltimaCorrida;
	}

	public void setDataHoraUltimaCorrida(LocalDateTime dataHoraUltimaCorrida) {
		this.dataHoraUltimaCorrida = dataHoraUltimaCorrida;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(Double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public Double getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(Double quilometragem) {
		this.quilometragem = quilometragem;
	}

	public DiasDeUtilizacao getDiasUtilizacao() {
		return diasUtilizacao;
	}

	public void setDiasUtilizacao(DiasDeUtilizacao diasUtilizacao) {
		this.diasUtilizacao = diasUtilizacao;
	}

	public Long getCodigoEtiqueta() {
		return codigoEtiqueta;
	}

	public void setCodigoEtiqueta(Long codigoEtiqueta) {
		this.codigoEtiqueta = codigoEtiqueta;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public boolean isEmUso() {
		return emUso;
	}

	public void setEmUso(boolean emUso) {
		this.emUso = emUso;
	}

	public Financeiro getFinanceiro() {
		return financeiro;
	}

	public void setFinanceiro(Financeiro valores) {
		this.financeiro = valores;
	}

}
