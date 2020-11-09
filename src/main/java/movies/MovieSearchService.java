package movies;

import movies.dataobjects.Movie;
import movies.dataobjects.Movies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MovieSearchService {

    private Movies movies;

    public MovieSearchService(Movies movies){
        this.movies = movies;
    }

    public Movie findByTitle(String title){
        return movies.getMovies().stream().filter(movie -> movie.getTitle().equals(title)).findFirst().get();
    }

    public List<Movie> findByYear(String year){
        return movies.getMovies().stream().filter(movie -> movie.getYear().equals(year)).collect(Collectors.toList());
    }

    public HashMap<String, List<Movie>> groupByGenres(){
        HashMap<String, List<Movie>> groupedMoviesByGenre = new HashMap<>();
        for (String genre: movies.getGenres()){
            List<Movie> moviesPerGenre = movies.getMovies().stream().filter(movie -> movie.getGenres().contains(genre)).collect(Collectors.toList());
            groupedMoviesByGenre.put(genre, moviesPerGenre);
        }
        return groupedMoviesByGenre;
    }

}
