package usantatecla.connect4.controllers;

import usantatecla.connect4.models.Game;
import usantatecla.connect4.models.State;
import usantatecla.connect4.types.Color;
import usantatecla.utils.models.ConcreteCoordinate;

public abstract class Controller {

    protected Game game;
    protected State state;

    Controller(Game game, State state) {
        this.game = game;
        this.state = state;
    }

    public void nextState() {
        this.state.next();
    }

    public Color getColor(ConcreteCoordinate coordinate) {
        return this.game.getColor(coordinate);
    }

    public abstract void accept(ControllersVisitor controllersVisitor);

}
