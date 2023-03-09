package Attacks;

import ru.ifmo.se.pokemon.*;

public class Smog extends SpecialMove {

    public Smog() {
        this.type = Type.POISON;
        this.accuracy = 70;
        this.power = 30;
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        new Effect().chance(0.4).poison(p);
    }

    @Override
    protected String describe() {
        return "использует Smog";
    }
}