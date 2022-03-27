package sebCzabak.HeroMaker.model;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@AllArgsConstructor
public class HeroConfig implements CommandLineRunner {
    private final HeroRepository heroRepository;
    @Override
    public void run(final String... args) throws Exception {
        Hero warrior = new Hero(
                "tempHeroWarrior",
                Profession.warrior,
                18,
                5,
                10,
                7,
                5
        );
        Hero mage = new Hero(
                "tempHeroMage",
                Profession.mage,
                9,
                16,
                4,
                4,
                9
        );
        Hero archer = new Hero(
                "tempHeroArcher",
                Profession.archer,
                10,
                9,
                5,
                8,
                6
        );
        heroRepository.saveAll(
                List.of(warrior,mage,archer));
    }
}
