package factoryPatternNetflix;

import java.util.List;

public class MovieFactory {
    public static NetflixMovies getMovies(String type, List<MovieDetails> movieDetails) {
        if ("ROMCOM".equalsIgnoreCase(type)) {
            return new RomComMovies(movieDetails);
        } else if ("ACTION".equalsIgnoreCase(type)) {
            return new ActionMovies(movieDetails);
        } else if ("SCIENCE_FICTION".equalsIgnoreCase(type)) {
            return new ScienceFictionMovies(movieDetails);
        }
        return null;
    }
}
