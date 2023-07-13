package abstractFactoryPatternNetflix;

import java.util.List;

public abstract class AbstractFactory {
    abstract NetflixCatalogue getShowInfo(String showType, List<NetflixDetails> netflixDetails);
}
