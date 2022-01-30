/*
some notes:
- a class has to be defined as an abstract class if it contains abstract functions.
- abstract functions do not have their implementation details in the abstract class.
- abstract functions have their implementation details in the child classes instead.
- abstract classes can also have constructors. However, they can only be called through the child class.

*/
public abstract class Shape {

  // abstract classes can also have private variables. However, they can only be accessed through
  // getters and setters
  private int lol;

  Shape(int wow) {
    this.lol = wow;
  }

  // function which retruns the value of lol
  public int getLol() {
    return this.lol;
  }
  // the area of a shape is an abstract function
  public abstract double getArea();

  // say is an instance method. It can only be called once an instance of a child class is created
  public void say() {
    System.out.println("Hello World");
  }
}
