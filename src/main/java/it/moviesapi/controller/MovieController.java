package it.moviesapi.controller;

import it.moviesapi.data.MovieDB;
import it.moviesapi.model.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @PostMapping("")
    public HttpStatus movieAction(@RequestBody Movie movie){
        try{
            MovieDB.Movies().movieAction(movie);
            return HttpStatus.OK;
        }
        catch (Error e){
            return HttpStatus.BAD_REQUEST;
        }
    }

    @GetMapping("/watched")
    public ResponseEntity<List<Movie>> getWatchedMovie(){
        try{

            return new ResponseEntity<>(MovieDB.Movies().getWatched(), HttpStatus.OK);
        }
        catch (Error e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/watchList")
    public ResponseEntity<List<Movie>> getWatchList(){
        try{
            return new ResponseEntity<>(MovieDB.Movies().getWatchList(), HttpStatus.OK);
        }
        catch (Error e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


}
