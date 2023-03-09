package Attacks;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {

    public Swagger() {
        this.type = Type.NORMAL;
        accuracy = 85;
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.confuse(p);
        p.addEffect(new Effect().turns(0).stat(Stat.ATTACK, 2));
    }

    @Override
    protected String describe() {return "использует Swagger";}

}