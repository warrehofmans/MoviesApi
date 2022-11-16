package it.moviesapi.data;

import it.moviesapi.model.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MovieDB {
    private List<Movie> movies = new ArrayList<>();
    private static  MovieDB _movieDB = null;

    public MovieDB() {
    }

    private static MovieDB initMovieDB(){
        _movieDB = new MovieDB();
        return _movieDB;
    }
    public static MovieDB Movies(){
        if(_movieDB == null) return initMovieDB();
        return _movieDB;
    }

    public void movieAction(Movie movie){
        System.out.println(movie.getId());
        System.out.println(this.movies.stream().filter(m -> m.getId().equals(movie.getId())).toList().size() > 0);
        if(this.movies.stream().filter(m -> m.getId().equals(movie.getId())).toList().size() > 0){
            this.pathMovie(movie);
        } else{
            this.addMovie(movie);
        }
    }
    private void addMovie(Movie movie){
        this.movies.add(movie);
    }

    private void pathMovie(Movie movie){
        int index = IntStream.range(0, this.movies.size())
                .filter(m -> this.movies.get(m).getId().equals(movie.getId()))
                .findFirst()
                .orElse(-1);
        if(index != -1) this.movies.set(index,movie);
    }

    public List<Movie> getAll(){
        return this.movies;
    }
}
