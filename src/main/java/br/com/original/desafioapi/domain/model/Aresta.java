package br.com.original.desafioapi.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Entity
public class Aresta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank()
	@Size(max = 1)
	private String source;
	
	@NotBlank()
	@Size(max = 1)
	private String target;
	
	@NotBlank()
	private Long distance;
	
	@Column(name = "grafo_id")
	@NotBlank
	private Grafo grafo;

}