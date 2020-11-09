package movies.dataobjects;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Movie {

    @JsonProperty(value = "title")
    private String title;

    @JsonProperty(value = "year")
    private String year;

    @JsonProperty(value = "runtime")
    private String runtime;

    @JsonProperty(value = "genres")
    private List<String> genres;

    @JsonProperty(value = "director")
    private String director;

    @JsonProperty(value = "actors")
    private String actors;

    @JsonProperty(value = "plot")
    private String plot;

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getRuntime() {
        return runtime;
    }

    public List<String> getGenres() {
        return genres;
    }

    public String getDirector() {
        return director;
    }

    public String getActors() {
        return actors;
    }

    public String getPlot() {
        return plot;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    @JsonProperty(value = "posterUrl")
    private String posterUrl;

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", runtime='" + runtime + '\'' +
                ", genres=" + genres +
                ", director='" + director + '\'' +
                ", actors='" + actors + '\'' +
                ", plot='" + plot + '\'' +
                ", posterUrl='" + posterUrl + '\'' +
                '}';
    }
}
