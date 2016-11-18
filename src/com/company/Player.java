package com.company;

/**
 * Created by falyanguzov on 14.11.2016.
 */
public abstract class Player {
    public Hand hand = new Hand();

    public void take(Card current) {
        hand.add(current);
    }

    public Command decision() {
        return intellect.decide();
    }
}
