import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class FightClub {

    public static void main(java.lang.String[] args) {
        Battle b = new Battle();

        Pokemon p1 = new Victini("HOMYAK", 6);
        Pokemon p2 = new Anorith("ZHEST'1", 6);
        Pokemon p3 = new Armaldo("ZHEST'2", 6);
        Pokemon p4 = new Honedge("SHASHKA1", 6);
        Pokemon p5 = new Doublade("SHASHKA2", 6);
        Pokemon p6 = new AegislashBlade("SHASHKA3", 6);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }

}