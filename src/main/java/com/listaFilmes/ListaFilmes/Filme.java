package com.listaFilmes.ListaFilmes;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="MOVIES")
public class Filme {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank(message = "O campo título é obrigatório")
	@Size(min = 2, max = 100, message = "O campo título deve ter entre 2 e 100 caracteres")
	private String titulo;

	@NotBlank(message = "O campo genero é obrigatório")
	private String genero;

	@NotBlank(message = "O campo Ano é obrigatório")
	@Size(min = 4, max = 4, message = "O campo Ano deve ter 4 caracteres")
	private String anoLancamento;

	public Filme(String titulo,
			String genero,
			String anoLancamento) {
		this.titulo = titulo;
		this.genero = genero;
		this.anoLancamento = anoLancamento;
	}

	public Filme() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

}
