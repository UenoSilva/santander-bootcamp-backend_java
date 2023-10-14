package com.dio.ueno.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@GetMapping("/{id}")
	public ResponseEntity<Anime> create(@RequestBody Anime anime){
		var animeCreate = animeService.create(anime);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(animeCreate.getId())
				.toUri();
		return ResponseEntity.created(location).body(animeCreate);
	}
}