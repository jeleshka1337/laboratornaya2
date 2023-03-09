package Pokemons;

import Attacks.Rest;
import Attacks.ThunderWave;
import Attacks.Swagger;
import Attacks.WaterGun;
import ru.ifmo.se.pokemon.Type;

public class Armaldo extends Anorith {

    public Armaldo(String name, int level) {

        super(name, level);

        this.setType(Type.ROCK, Type.BUG);

        this.setStats(260, 229, 184, 130, 148, 85);


        this.setMove(new Rest(260), new ThunderWave(), new Swagger(), new WaterGun());
    }
}