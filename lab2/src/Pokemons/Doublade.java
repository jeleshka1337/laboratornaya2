package Pokemons;

import Attacks.DoubleTeam;
import Attacks.Rest;
import Attacks.Peck;
import ru.ifmo.se.pokemon.Type;

public class Doublade extends Honedge {

    public Doublade(String name, int level) {

        super(name, level);

        this.setType(Type.STEEL, Type.GHOST);

        this.setStats(228, 202, 274, 85, 92, 67);


        this.setMove(new Rest(228), new DoubleTeam(), new Peck());
    }
}