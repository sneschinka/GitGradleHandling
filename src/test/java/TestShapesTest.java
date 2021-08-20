import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import shapes.Circle;
import shapes.Square;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import static org.junit.jupiter.api.Assertions.*;

class TestShapesTest {
    @Mock
    Square s = new Square();
    @Test
    void circle(){
        Circle c = new Circle();
        assertThat(c.getNumberOfEdges(),is(lessThan(5)));
    }
}