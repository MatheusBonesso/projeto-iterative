package br.com.iterative.green.controllers.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.iterative.green.models.Corridas;
import br.com.iterative.green.models.Veiculos;

public class CorridasDTO {
	private Long id;
	private String emailCondutor;
	private LocalDateTime horaInicio;
	private LocalDateTime horaFim;
	private boolean ativa;
	private Veiculos veiculo;
	
	public CorridasDTO(Corridas corridas) {
		this.emailCondutor = corridas.getEmailCondutor();
		this.ativa = corridas.isAtiva();
		this.horaFim = corridas.getHoraFim();
		this.horaInicio = corridas.getHoraInicio();
		this.veiculo = corridas.getVeiculo();
		this.id = corridas.getId();
		
	}

	public String getEmailCondutor() {
		return emailCondutor;
	}

	public void setEmailCondutor(String emailCondutor) {
		this.emailCondutor = emailCondutor;
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

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public Veiculos getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculos veiculo) {
		this.veiculo = veiculo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public static List<CorridasDTO> converter(List<Corridas> corridas) {
		
		return corridas.stream().map(CorridasDTO::new).collect(Collectors.toList());
		
	}

}
