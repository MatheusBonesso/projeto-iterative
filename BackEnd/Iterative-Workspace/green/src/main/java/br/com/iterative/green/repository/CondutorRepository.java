package br.com.iterative.green.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.iterative.green.models.Condutor;

public interface CondutorRepository extends JpaRepository<Condutor, Long>{

	Condutor findByEmail(String emailCondutor);
	

}
