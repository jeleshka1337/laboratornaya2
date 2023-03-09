package Attacks;

import ru.ifmo.se.pokemon.*;

public class XScissor extends PhysicalMove {
    public XScissor() {
        this.type = Type.BUG;
        this.accuracy = 100;
        this.power = 80;
    }

    @Override
    protected String describe() {
        return "использует X-Scissor";
    }
}
