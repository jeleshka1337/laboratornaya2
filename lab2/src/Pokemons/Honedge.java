package Pokemons;

import Attacks.DoubleTeam;
import Attacks.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Honedge extends Pokemon {

    public Honedge(String name, int level) {

        super(name, level);

        this.setType(Type.STEEL, Type.GHOST);

        this.setStats(200, 148, 184, 67, 71, 54);


        this.setMove(new Rest(200), new DoubleTeam());
    }
}