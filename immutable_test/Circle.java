public final class Circle {

  private final double rad;
  private final Point p;

  public Circle(Point p, double r) {
    this.p = p;
    this.rad = r;
  }

  public Circle moveTo(int x, int y) {
    return new Circle(new Point(x, y), 3);
  }

  public void print() {
    System.out.println(this.p.getX());
    System.out.println(this.p.getY());
  }
}
