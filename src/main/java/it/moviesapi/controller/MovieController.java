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

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Movie> movieAction(@RequestBody Movie movie){
        try{
            MovieDB.Movies().movieAction(movie);
            return  new ResponseEntity<>(movie, HttpStatus.OK);
        }
        catch (Error e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Movie>> getWatchedMovie(){
        try{
            return new ResponseEntity<>(MovieDB.Movies().getAll(), HttpStatus.OK);
        }
        catch (Error e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }



}
