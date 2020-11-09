import movies.MovieCollection;
import movies.MovieCollectionJsonFile;
import movies.MovieSearchService;
import movies.dataobjects.Movie;
import movies.dataobjects.Movies;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {

        String moviesJsonFilePath = "src/main/resources/movies-collection.json";

        MovieCollection movieCollection = new MovieCollectionJsonFile(moviesJsonFilePath);
        Movies movies = movieCollection.retrieveMoviesCollection();

        MovieSearchService movieSearchService = new MovieSearchService(movies);


        System.out.println("SEARCHING FOR MOVIE BY TITLE");
        Movie foundMovieByTitle = movieSearchService.findByTitle("Beetlejuice");
        System.out.println(foundMovieByTitle.toString());

        System.out.println("SEARCHING FOR MOVIES BY YEAR");
        List<Movie> foundMoviesByYear = movieSearchService.findByYear("2003");
        System.out.println(foundMoviesByYear.toString());

        HashMap<String, List<Movie>> groupedMoviesByGenre = movieSearchService.groupByGenres();

        System.out.println("EXTRACTING ALL MOVIES OF ACTION GENRE");
        System.out.println(groupedMoviesByGenre.get("Action"));

        System.out.println("EXTRACTING ALL MOVIES OF COMEDY GENRE");
        System.out.println(groupedMoviesByGenre.get("Comedy"));

        String s = "";

    }

}
