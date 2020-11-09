package movies.dataobjects;

import java.util.List;

public class Movies {

    private List<String> genres;

    private List<Movie> movies;

    public List<String> getGenres() {
        return genres;
    }

    public List<Movie> getMovies() {
        return movies;
    }

}