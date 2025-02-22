package br.com.iterative.green.controllers.form;

import java.time.LocalDateTime;

import br.com.iterative.green.models.Aluguel;
import br.com.iterative.green.models.Financeiro;
import br.com.iterative.green.repository.AluguelRepository;
import br.com.iterative.green.repository.FinanceiroRepository;

public class AluguelAtualizarForm {
	private LocalDateTime horaFim;
	private boolean ativa;

	public LocalDateTime getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(LocalDateTime horaFim) {
		this.horaFim = horaFim;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public Aluguel atualizar(Long id, AluguelRepository aluguelRepository, FinanceiroRepository financeiroRepository) {
		Aluguel aluguel = aluguelRepository.getOne(id);
		aluguel.setAtiva(this.ativa);
		aluguel.setHoraFim(this.horaFim);
		calculoValorHora(aluguel.getHoraInicio(), aluguel.getHoraFim(), financeiroRepository, id);
		

		return aluguel;
	}

	private void calculoValorHora(LocalDateTime horaInicio, LocalDateTime horaFim, FinanceiroRepository financeiroRepository,
			Long id) {
		
		int horaTotal = (horaFim.getMinute() + (horaFim.getMinute()/60)) - (horaInicio.getMinute() + (horaInicio.getHour()/60));
		if(horaTotal<0) {
			horaTotal = horaTotal * -1;
		}
		Financeiro financeiro = financeiroRepository.getOne(id);
		double valorTotal =Math.round(horaTotal * financeiro.getValorMinuto());
		financeiro.setValorTotal(valorTotal);
		financeiro.setTotalMinutos(horaTotal);
		financeiroRepository.save(financeiro);
		
	}

}
