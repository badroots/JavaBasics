package bad.company.homework.practise1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void distanceResultTest() {
    Point p = new Point(2,4,6,8);
    Assert.assertEquals(p.distance(), 5.656854249492381);
  }

  @Test
  public void distanceFirstPointSqr() {
    Point p = new Point(2,4,6,8);
    double firstPointSqr = (p.x2-p.x1)*(p.x2-p.x1);
    Assert.assertEquals(firstPointSqr, 16.0);
  }

  @Test
  public void distanceSecondPointSqr() {
    Point p = new Point(2,4,6,8);
    double firstPointSqr = (p.y2-p.y1)*(p.y2-p.y1);
    Assert.assertEquals(firstPointSqr, 16.0);
  }

  @Test
  public void distanceNotNull() {
    Point p = new Point(2,4,6,8);
    Assert.assertNotNull(p.distance(), "Looks like smth go wrong");

  }

}
