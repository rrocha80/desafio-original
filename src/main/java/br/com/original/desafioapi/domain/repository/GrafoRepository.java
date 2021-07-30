package br.com.original.desafioapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.original.desafioapi.domain.model.Grafo;

@Repository
public interface GrafoRepository extends JpaRepository<Grafo, Long>{
	
}
