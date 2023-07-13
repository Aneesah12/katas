package factoryPatternNetflix;

import java.util.Collections;
import java.util.Scanner;

public class TestFactory {
    public static void main(String[] args) {

        NetflixMovies romComMovie = MovieFactory.getMovies("ROMCOM", Collections.singletonList(new MovieDetails("Pretty Woman", 5)));
        System.out.println(romComMovie);


//        String netflixGenre;
//        String netflixMovieTitle;
//        int rating;
//
//        System.out.println("What is the genre of your show: ROMCOM, ACTION or SCIENCE_FICTION?");
//        Scanner myNetflixInfo = new Scanner(System.in);
//        netflixGenre = myNetflixInfo.nextLine();
//
//        System.out.println("What is the name of your movie?");
//        netflixMovieTitle = myNetflixInfo.nextLine();
//
//        System.out.println("What rating would you give your movie?");
//        rating = Integer.parseInt(myNetflixInfo.nextLine());
//
//        NetflixMovies netflixMovie = MovieFactory.getMovies(netflixGenre, Collections.singletonList(new MovieDetails(netflixMovieTitle, rating)));
//        System.out.println(netflixMovie);

    }
}
