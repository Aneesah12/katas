package abstractFactoryPatternNetflix;

import java.util.List;

public class MovieFactory extends AbstractFactory {

    @Override
    public NetflixCatalogue getShowInfo(String type, List<NetflixDetails> netflixDetails) {
        if ("ROMCOM".equalsIgnoreCase(type)) {
            return new RomComMovies(netflixDetails);
        } else if ("ACTION".equalsIgnoreCase(type)) {
            return new ActionMovies(netflixDetails);
        } else if ("SCIENCE_FICTION".equalsIgnoreCase(type)) {
            return new ScienceFictionMovies(netflixDetails);
        }
        return null;
    }
}
