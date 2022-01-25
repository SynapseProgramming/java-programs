/*
some notes:
- a class has to be defined as an abstract class if it contains abstract functions.
- abstract functions do not have their implementation details in the abstract class.
- abstract functions have their implementation details in the child classes instead.
-

*/
public abstract class Shape {

  // the area of a shape is an abstract function
  public abstract double getArea();

  // say is an instance method. It can only be called once an instance of a child class is created
  public void say() {
    System.out.println("Hello World");
  }
}
