package dev.dylan.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        System.out.println("hola ");
        System.out.println(movieRepository.findAll());
        return movieRepository.findAll();
    }
}
