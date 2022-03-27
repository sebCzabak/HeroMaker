package sebCzabak.HeroMaker.model;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/v1")
public class HeroController {

    private final HeroService heroService;
    private final Logger log = LoggerFactory.getLogger(HeroController.class);

    @GetMapping(path = "/getHeroes")
    public List<Hero> getAllHeroes(){
        return heroService.getAllHeroes();
    }

}
