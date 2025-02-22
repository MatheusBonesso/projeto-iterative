package br.com.iterative.green.controllers.form;

import java.time.LocalDateTime;

import br.com.iterative.green.models.Financeiro;
import br.com.iterative.green.models.Veiculos;
import br.com.iterative.green.repository.VeiculosRepository;

public class VeiculoAtualizarForm {
	private Long id;
	private boolean emUso;
	private LocalDateTime dataHoraUltimaCorrida;
	private Financeiro financeiro;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isEmUso() {
		return emUso;
	}

	public void setEmUso(boolean emUso) {
		this.emUso = emUso;
	}

	public LocalDateTime getDataHoraUltimaCorrida() {
		return dataHoraUltimaCorrida;
	}

	public void setDataHoraUltimaCorrida(LocalDateTime dataHoraUltimaCorrida) {
		this.dataHoraUltimaCorrida = dataHoraUltimaCorrida;
	}

	public Financeiro getFinanceiro() {
		return financeiro;
	}

	public void setFinanceiro(Financeiro financeiro) {
		this.financeiro = financeiro;
	}

	public Veiculos atualizar(Long idVeiculo, VeiculosRepository veiculosRepository) {
		Veiculos veiculo = veiculosRepository.getOne(idVeiculo);
		veiculo.setDataHoraUltimaCorrida(this.dataHoraUltimaCorrida);
		veiculo.setEmUso(this.emUso);

		veiculo.getFinanceiro().setValorTotal(this.financeiro.getValorTotal());

		return veiculo;
	}

}
