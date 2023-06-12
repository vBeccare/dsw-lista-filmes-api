package com.listaFilmes.ListaFilmes;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Integer> {

	public Optional<Filme> findByTitulo(String titulo);

}
