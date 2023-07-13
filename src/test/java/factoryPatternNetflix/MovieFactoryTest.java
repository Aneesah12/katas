package factoryPatternNetflix;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotNull;

public class MovieFactoryTest {

    @Test
    public void shouldReturnRomComMovies() {
        List<MovieDetails> movieDetailsList = Collections.singletonList(new MovieDetails("Blah", 2));

        String romComType = "ROMCOM";

        NetflixMovies romcomMovie = MovieFactory.getMovies(romComType, movieDetailsList);

        assertNotNull(romcomMovie);
        assertThat(romcomMovie, instanceOf(RomComMovies.class));
        assertThat(romcomMovie.getMovies().get(0).getMovieTitle(), equalTo("Pretty Woman"));
        assertThat(romcomMovie.getMovies().get(0).getRating(), equalTo(2));
    }

    @Test
    public void shouldReturnActionMovie() {
        List<MovieDetails> movieDetailsList = Collections.singletonList(new MovieDetails("Terminator", 5));

        String movieType = "ACTION";

        NetflixMovies actionMovie = MovieFactory.getMovies(movieType, movieDetailsList);

        assertThat(actionMovie, instanceOf(ActionMovies.class));
        assert actionMovie != null;
        assertThat(actionMovie.getMovies().get(0).getMovieTitle(), equalTo("Terminator"));
        assertThat(actionMovie.getMovies().get(0).getRating(), equalTo(5));
    }

    @Test
    public void shouldReturnScienceFictionMovie() {
        List<MovieDetails> movieDetailsList = Collections.singletonList(new MovieDetails("Alien", 5));

        String movieType = "SCIENCE_FICTION";

        NetflixMovies scienceFictionMovie = MovieFactory.getMovies(movieType, movieDetailsList);

        assertThat(scienceFictionMovie, instanceOf(ScienceFictionMovies.class));
        assert scienceFictionMovie != null;
        assertThat(scienceFictionMovie.getMovies().get(0).getMovieTitle(), equalTo("Alien"));
        assertThat(scienceFictionMovie.getMovies().get(0).getRating(), equalTo(5));
    }

}