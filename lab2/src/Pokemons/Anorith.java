package Pokemons;

import Attacks.Rest;
import Attacks.ThunderWave;
import Attacks.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Anorith extends Pokemon {

    public Anorith(String name, int level) {

        super(name, level);

        this.setType(Type.ROCK, Type.BUG);

        this.setStats(200, 175, 94, 76, 94, 139);


        this.setMove(new Rest(200), new ThunderWave(), new Swagger());
    }
}