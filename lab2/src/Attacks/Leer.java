package Attacks;

import ru.ifmo.se.pokemon.*;

public class Leer extends StatusMove {

    public Leer(){
        this.type = Type.NORMAL;
        accuracy = 100;
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().stat(Stat.DEFENSE, -1));
    }

    @Override
    protected String describe(){
        return "использует Leer";
    }
}