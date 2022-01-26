public class Circle {
  private Point centre;
  private int radius;
  public Circle(Point centre, int radius) {
    this.centre = centre;
    this.radius = radius;
  }
  @Override
  public boolean equals(Object obj) {
    System.out.println("equals(Object) called yes man");
    if (obj == this) {
      return true;
    }
    if (obj instanceof Circle) {
      Circle circle = (Circle) obj;

    System.out.println("This is a circle indeed!");

    boolean check=circle.centre.equals(centre);
    System.out.println("This is check value: "+ check);
      return (circle.centre.equals(centre) && circle.radius == radius);
    } else {
      return false;
    }
  }
  public boolean equals(Circle circle) {
    System.out.println("equals(Circle) called");
    return circle.centre.equals(centre) && circle.radius == radius;
  }
  public void say(){
      System.out.println("This is called from an instance of circle");
    }
}

