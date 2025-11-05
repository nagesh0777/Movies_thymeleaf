package com.example.Movies_thymeleaf.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Movies_thymeleaf.model.Movies;

public interface MovieRepo extends JpaRepository<Movies, Integer>{

}

