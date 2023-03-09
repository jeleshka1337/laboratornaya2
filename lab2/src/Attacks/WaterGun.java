package Attacks;

import ru.ifmo.se.pokemon.*;

public class WaterGun extends SpecialMove {

    public WaterGun() {
        this.type = Type.WATER;
        this.accuracy = 100;
        this.power = 40;
    }

    @Override
    protected String describe() {
        return "использует Water Gun";
    }
}