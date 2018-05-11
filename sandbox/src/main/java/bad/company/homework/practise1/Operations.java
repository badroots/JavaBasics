package bad.company.homework.practise1;

public class Operations {

  public static void main(String[] args) {

    Square s = new Square(5);
    System.out.println(s.area());

    Rectangle r = new Rectangle(4,6 );
    System.out.println(r.area());

    Point p1 = new Point(2,3);
    Point p2 = new Point(4,5);
    System.out.println("Расстояние между точками = " + p1.distance(p2));
  }

}