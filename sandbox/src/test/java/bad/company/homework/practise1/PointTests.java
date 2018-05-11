package bad.company.homework.practise1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void distanceResultTest() {
    Point p1 = new Point(2, 4);
    Point p2 = new Point(6, 8);
    Assert.assertEquals(p1.distance(p2), 5.656854249492381);
  }

  @Test
  public void dxCountResultTest() {
    Point p1 = new Point(2, 4);
    Point p2 = new Point(6, 8);
    double dx = p2.x - p1.x;
    Assert.assertEquals(dx ,4.0 );
  }

  @Test
  public void dyCountResultTest() {
    Point p1 = new Point(2, 4);
    Point p2 = new Point(6, 8);
    double dy = p2.y - p1.y;
    Assert.assertEquals(dy ,4.0);
    }

  @Test
  public void distanceNotNull() {
    Point p1 = new Point(2, 4);
    Point p2 = new Point(6, 8);
    Assert.assertNotNull(p1.distance(p2), "Looks like smth go wrong");
  }

}
