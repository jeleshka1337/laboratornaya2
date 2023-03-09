package Attacks;

import ru.ifmo.se.pokemon.*;

public class FlareBlitz extends PhysicalMove {
    public FlareBlitz() {
        this.type = Type.FIRE;
        this.accuracy = 100;
        this.power = 120;
    }

    @Override
    protected String describe() {
        return "использует Flare Blitz";
    }
}