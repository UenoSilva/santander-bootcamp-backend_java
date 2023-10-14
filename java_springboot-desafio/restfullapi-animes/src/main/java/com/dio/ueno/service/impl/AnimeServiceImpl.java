package com.dio.ueno.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.ueno.domain.model.Anime;
import com.dio.ueno.domain.repository.AnimeRepository;
import com.dio.ueno.service.AnimeService;

@Service
public class AnimeServiceImpl implements AnimeService{
	
	@Autowired
	private AnimeRepository animeRepository;

	@Override
	public List<Anime> listaAnimes() {
		return animeRepository.findAll();
	}

	@Override
	public Anime create(Anime anime) {
		return animeRepository.save(anime);
	}

	@Override
	public Anime findById(Long id) {
		return animeRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public Anime findByTitulo(String titulo) {
		return animeRepository.findByTitulo(titulo);
	}

}
