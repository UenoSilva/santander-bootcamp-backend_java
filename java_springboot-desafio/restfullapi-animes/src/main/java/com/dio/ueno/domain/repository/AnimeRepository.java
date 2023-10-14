package com.dio.ueno.domain.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.dio.ueno.domain.model.Anime;

public interface AnimeRepository extends JpaRepository<Anime, Long> {

}
