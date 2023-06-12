package com.listaFilmes.ListaFilmes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmeService {

	@Autowired
	private FilmeRepository filmeRepository;

	public Optional<Filme> cadastrarFilme(Filme Filme) {

		return Optional.of(filmeRepository.save(Filme));

	}

	public List<Filme> findAll() {
		List<Filme> resultado = filmeRepository.findAll();
		return resultado;
	}

}
