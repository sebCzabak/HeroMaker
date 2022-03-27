package sebCzabak.HeroMaker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Hero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Profession profession;
    private Integer hp;
    private Integer mp;
    private Integer str;
    private Integer dex;
    private Integer wisdom;

    public Hero(final String name,
                final Profession profession,
                final Integer hp,
                final Integer mp,
                final Integer str,
                final Integer dex,
                final Integer wisdom) {
        this.name = name;
        this.profession = profession;
        this.hp = hp;
        this.mp = mp;
        this.str = str;
        this.dex = dex;
        this.wisdom = wisdom;
    }
}
