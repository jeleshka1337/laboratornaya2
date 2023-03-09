package Attacks;

import ru.ifmo.se.pokemon.*;

public class Peck extends PhysicalMove {
    public Peck() {
        this.type = Type.FLYING;
        this.accuracy = 100;
        this.power = 35;
    }

    @Override
    protected String describe() {
        return "использует Peck";
    }
}