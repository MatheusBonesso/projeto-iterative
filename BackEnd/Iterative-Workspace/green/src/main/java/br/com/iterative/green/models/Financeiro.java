package br.com.iterative.green.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Financeiro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Double valorTotal;

	private Double valorMinuto;

	private int totalMinutos;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Double getValorMinuto() {
		return valorMinuto;
	}

	public void setValorMinuto(Double valorMinuto) {
		this.valorMinuto = valorMinuto;
	}

	public int getTotalMinutos() {
		return totalMinutos;
	}

	public void setTotalMinutos(int totalMinutos) {
		this.totalMinutos = totalMinutos;
	}


}
