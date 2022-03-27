package sebCzabak.HeroMaker.model;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/v1")
public class HeroController {

    private final HeroService heroService;
    private final Logger log = LoggerFactory.getLogger(HeroController.class);

    @GetMapping(path = "/getHeroes")
    public List<Hero> getAllHeroes(){
        log.warn("Exposing all Heroes!");
        return heroService.getAllHeroes();
    }
    @PostMapping(path = "/addNewHero")
    public void addNewHero(@RequestBody Hero hero){
        log.info("New Hero Request");
        heroService.addNewHero(hero);
    }
    @DeleteMapping(path = "/deleteHero/{heroId}")
    public void deleteHero(@PathVariable("heroId")Long heroId){
        heroService.deleteHero(heroId);
    }

}
