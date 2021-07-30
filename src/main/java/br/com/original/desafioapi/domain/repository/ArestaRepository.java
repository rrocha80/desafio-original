package br.com.original.desafioapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.original.desafioapi.domain.model.Aresta;

@Repository
public interface ArestaRepository extends JpaRepository<Aresta, Long>{
	
}
