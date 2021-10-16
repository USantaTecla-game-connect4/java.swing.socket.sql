package usantatecla.utils.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ConcreteCoordinateTest {

  @BeforeEach
  public void beforeEach() {
  }

  @Test
  public void test() {
    ConcreteCoordinate coordinate = new ConcreteCoordinate(0, 0);
    assertThat(coordinate.getInDirectionCoordinate(Direction.NORTH), is(new ConcreteCoordinate(1, 0)));
    assertThat(coordinate.getInDirectionCoordinate(Direction.SOUTH_EAST), is(new ConcreteCoordinate(-1, 1)));
  }

  @Test
  public void test2() {
    ConcreteCoordinate origin = new ConcreteCoordinate(0, 0);
    Coordinate[] coordinates = origin.getInDirectionCoordinates(Direction.NORTH, 4);
    assertThat("en: "+0, coordinates[0], is(origin));
    for(int i=1; i<coordinates.length; i++){
      assertThat("en: "+i, coordinates[i], is(new ConcreteCoordinate(i, 0)));
    }
  }

}