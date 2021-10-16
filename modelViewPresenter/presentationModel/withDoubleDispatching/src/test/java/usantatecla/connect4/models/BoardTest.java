package usantatecla.connect4.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import usantatecla.connect4.types.Color;
import usantatecla.utils.models.ConcreteCoordinate;
import usantatecla.utils.models.Direction;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BoardTest {

    @BeforeEach
    public void beforeEach() {
    }

    @Test
    public void test() {
      Board board = new Board();
      int column = 0;
      assertThat(board.getColor(new ConcreteCoordinate(Board.ROWS-1,column)), is(Color.NULL));
      assertThat(board.thereIsEmpty(column), is(true));
      assertThat(board.getEmptyCoordinate(column), is(new ConcreteCoordinate(0,column)));
      Color color = Color.RED;
      board.putToken(column, color);
      assertThat(board.getColor(new ConcreteCoordinate(0,column)), is(color));
      assertThat(board.getEmptyCoordinate(column), is(new ConcreteCoordinate(1,column)));
      color = Color.YELLOW;
      board.putToken(column, color);
      assertThat(board.getColor(new ConcreteCoordinate(1,column)), is(color));
    }

    @Test
    public void test2() {
      Board board = new Board();
      assertThat(board.isConnect4(new ConcreteCoordinate(0,0), Direction.EAST), is(false));
      assertThat(board.isConnect4(new ConcreteCoordinate(0,0), Direction.SOUTH_EAST), is(false));

    }



}

