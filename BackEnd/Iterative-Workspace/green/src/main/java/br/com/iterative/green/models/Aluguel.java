package br.com.iterative.green.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Aluguel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	private Veiculos veiculo;

	@OneToOne
	private Condutor condutor;

	@OneToOne
	@JoinColumn(name = "financeiro_id")
	private Financeiro financeiro;

	private LocalDateTime horaInicio = LocalDateTime.now();
	private LocalDateTime horaFim;
	private boolean ativo = false;
	private boolean pago = false;

	public Aluguel() {

	}

	public Aluguel(Veiculos veiculo,Condutor condutor, Financeiro financeiro,
			String emailCondutor, LocalDateTime horaFim, boolean ativo, boolean pago) {
		this.veiculo = veiculo;
		this.horaFim = horaFim;
		this.ativo = ativo;
		this.pago = pago;
		this.condutor = condutor;
		this.financeiro = financeiro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Veiculos getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculos veiculo) {
		this.veiculo = veiculo;
	}

	public LocalDateTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalDateTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalDateTime getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(LocalDateTime horaFim) {
		this.horaFim = horaFim;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtiva(boolean ativo) {
		this.ativo = ativo;
	}

	public Condutor getCondutor() {
		return condutor;
	}

	public void setCondutor(Condutor condutor) {
		this.condutor = condutor;
	}

	public Financeiro getFinanceiro() {
		return financeiro;
	}

	public void setFinanceiro(Financeiro financeiro) {
		this.financeiro = financeiro;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
