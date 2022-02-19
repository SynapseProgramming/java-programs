import java.lang.Math.*;

class Circle extends Shape {

  private double rad;

  Circle(double r) {
    this.rad = r;
  }

  @Override
  public double getArea() {
    return Math.PI * this.rad * this.rad;
  }
}
