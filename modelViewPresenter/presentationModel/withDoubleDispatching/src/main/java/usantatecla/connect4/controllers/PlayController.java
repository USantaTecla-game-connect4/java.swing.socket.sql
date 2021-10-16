package usantatecla.connect4.controllers;

import usantatecla.connect4.models.Game;
import usantatecla.connect4.models.State;
import usantatecla.connect4.types.Color;
import usantatecla.connect4.types.Error;

public class PlayController extends Controller {

    public PlayController(Game game, State state) {
        super(game, state);
    }

    public boolean isConnect4() {
        return this.game.isConnect4();
    }

    public void next() {
        this.game.next();
    }

    public Color getActiveColor() {
        return this.game.getActiveColor();
    }

    public void putToken(int column) {
        this.game.putToken(column);
    }

    public Error getPutTokenError(int column) {
        return this.game.getPutTokenError(column);
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

}
