package com.listaFilmes.ListaFilmes;

import jakarta.validation.Valid;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.time.LocalDate;
import java.util.*;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

	@Autowired
	private FilmeService service;

	@GetMapping("/all")
	public ResponseEntity<List<Filme>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@PostMapping("/cadastrar")
	public ResponseEntity<Filme> addNew(@RequestBody Filme dados) {
		return service.cadastrarFilme(dados).map(response -> ResponseEntity.status(HttpStatus.CREATED).body(response))
				.orElse(ResponseEntity.status(HttpStatus.PRECONDITION_REQUIRED).build());

	}

}