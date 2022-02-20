package br.com.santiago.cambio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.santiago.cambio.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long>{

	Cambio findByFromAndTo(String from, String to);
}
