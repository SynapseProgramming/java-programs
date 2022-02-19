public class InvarianceTest {

  public static void main(String[] args) {

    /*
      The following code show that arrays in java are covariant. AKA(they can contain
       a type, and its sub types)
      )


    */
    Circle wow = new Circle(43.55);
    Rectangle hehe = new Rectangle(3, 4);
    // create an array of Shapes
    Array<Shape> lol = new Array<Shape>(2);
    lol.set(0, wow);
    lol.set(1, hehe);

    System.out.println(lol.get(0).getArea());

    System.out.println(lol.get(1).getArea());

    // create an array of circles
    Array<Circle> circ = new Array<Circle>(2);
    Circle cir1 = new Circle(43.55);
    Circle cir2 = new Circle(34);
    circ.set(0, cir1);
    circ.set(1, cir2);

    // attempt to copy over array of circles to array of shapes
    lol.copyFrom(circ);
    /*
      The operation above is now allowed. This is because, 
      java generic types are invariant. (java does not know that an array of circles, 
        is a subtype of an array of shapes.
      )
      
      The introduction of wildcards would help to resolve this problem

    */
  }
}
