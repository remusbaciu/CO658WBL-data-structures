package movies;

import movies.dataobjects.Movies;

import java.io.IOException;
import java.util.ArrayList;

public interface MovieCollection {
    Movies retrieveMoviesCollection() throws IOException;
}
