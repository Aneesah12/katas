package abstractFactoryPatternNetflix;

import java.util.List;

public class TvShowFactory extends AbstractFactory {

    @Override
    public NetflixCatalogue getShowInfo(String type, List<NetflixDetails> netflixDetails) {
        if ("ROMCOM".equalsIgnoreCase(type)) {
            return new RomComTvShows(netflixDetails);
        } else if ("ACTION".equalsIgnoreCase(type)) {
            return new ActionTvShows(netflixDetails);
        } else if ("SCIENCE_FICTION".equalsIgnoreCase(type)) {
            return new ScienceFictionTvShows(netflixDetails);
        }
        return null;
    }
}
