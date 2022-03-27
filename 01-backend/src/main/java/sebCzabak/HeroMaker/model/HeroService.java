package sebCzabak.HeroMaker.model;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class HeroService {
    private final HeroRepository heroRepository;

    public List<Hero> getAllHeroes() {
        return heroRepository.findAll();
    }

    public void addNewHero(final Hero hero) {
        Optional<Hero> heroOptional = heroRepository.findByName(hero.getName());
        if (heroOptional.isPresent()) {
            throw new IllegalStateException("Hero name taken. Please try another one!");
        }
        heroRepository.save(hero);
    }

    public void deleteHero(final Long heroId) {
        Optional<Hero> heroOptional = heroRepository.findById(heroId);
        if (heroOptional.isPresent()) {
            heroRepository.deleteById(heroId);
        } else {
            throw new IllegalStateException("Hero with id " + heroId + " doesn't exists!");
        }
    }
}