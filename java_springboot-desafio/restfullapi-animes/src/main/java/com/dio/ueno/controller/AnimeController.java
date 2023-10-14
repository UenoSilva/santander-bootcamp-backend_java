package com.dio.ueno.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.ueno.domain.model.Anime;
import com.dio.ueno.service.AnimeService;

@RestController
@RequestMapping("/animes")
public class AnimeController {

	@Autowired
	private AnimeService animeService;
	
	@GetMapping
	public ResponseEntity<List<Anime>> animes(){
		List<Anime> anime = animeService.listaAnimes();
		return ResponseEntity.ok(anime);
	}
}
