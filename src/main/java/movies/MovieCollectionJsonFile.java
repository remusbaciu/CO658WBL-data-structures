package movies;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import movies.dataobjects.Movies;

import java.io.File;
import java.io.IOException;


public class MovieCollectionJsonFile implements MovieCollection {

    private String jsonFilePath;
    private ObjectMapper objectMapper;

    public MovieCollectionJsonFile(String jsonFilePath){
        this.jsonFilePath = jsonFilePath;
        this.objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);;
    }

    @Override
    public Movies retrieveMoviesCollection() throws IOException {
        Movies allMovies = objectMapper.readValue(new File(jsonFilePath), Movies.class);
        return allMovies;
    }


}
