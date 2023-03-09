package Pokemons;

import Attacks.DoubleTeam;
import Attacks.Rest;
import Attacks.Peck;
import Attacks.XScissor;
import ru.ifmo.se.pokemon.Type;

public class AegislashBlade extends Doublade {

    public AegislashBlade(String name, int level) {

        super(name, level);

        this.setType(Type.STEEL, Type.GHOST);

        this.setStats(230, 256, 94, 256, 94, 112);


        this.setMove(new Rest(228), new DoubleTeam(), new Peck(), new XScissor());
    }
}