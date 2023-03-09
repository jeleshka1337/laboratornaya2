package Pokemons;

import Attacks.Leer;
import Attacks.FlareBlitz;
import Attacks.DoubleTeam;
import Attacks.Smog;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Victini extends Pokemon {

    public Victini(String name, int level) {

        super(name, level);

        this.setType(Type.PSYCHIC, Type.FIRE);

        this.setStats(310, 184, 184, 184, 184, 184);


        this.setMove(new FlareBlitz(), new DoubleTeam(), new Smog(), new Leer());
    }


}