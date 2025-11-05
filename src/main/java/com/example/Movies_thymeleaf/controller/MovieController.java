package com.example.Movies_thymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.Movies_thymeleaf.model.Movies;
import com.example.Movies_thymeleaf.repo.MovieRepo;

@Controller
public class MovieController {

    @Autowired
    private MovieRepo movieRepo;

   
    @GetMapping("/")
    public String home() {
        return "home"; // home.html
    }

    
    @GetMapping("/movies/new")
    public String showAddMovieForm(Model model) {
        model.addAttribute("movie", new Movies());
        return "insert"; // insert.html
    }

        @PostMapping("/movies/save")
    public String saveMovie(@ModelAttribute("movie") Movies movie) {
        movieRepo.save(movie);
        return "redirect:/movies"; 
    }

   
    @GetMapping("/movies")
    public String viewAllMovies(Model model) {
        model.addAttribute("movies", movieRepo.findAll());
        return "view"; 
    }

  
    @GetMapping("/movies/delete/{id}")
    public String deleteMovie(@PathVariable int id) {
        movieRepo.deleteById(id);
        return "redirect:/movies";
    }
}
