public class WildCards {

  public static void main(String[] args) {

    /*
      The following code show that arrays in java are covariant. AKA(they can contain
       a type, and its sub types)
      )


    */
    Circle wow = new Circle(43.55);
    Rectangle hehe = new Rectangle(3, 4);
    // create an array of Shapes
    ArrayNew<Shape> lol = new ArrayNew<Shape>(2);
    lol.set(0, wow);
    lol.set(1, hehe);

    System.out.println(lol.get(0).getArea());

    System.out.println(lol.get(1).getArea());

    // create an array of circles
    ArrayNew<Circle> circ = new ArrayNew<Circle>(2);
    Circle cir1 = new Circle(12);
    Circle cir2 = new Circle(3);
    circ.set(0, cir1);
    circ.set(1, cir2);

    // attempt to copy over array of circles to array of shapes
    lol.copyFrom(circ);


    System.out.println("Updated array: ");
    System.out.println(lol.get(0).getArea());

    System.out.println(lol.get(1).getArea());
    /*
    Unlike Invariance test, we can safely copy over contents of circlearray to shape array.
    This is because, we have already notified java that it is safe to copy data from the 
    given argument so long it is of type T or its subtypes.

    */

    System.out.println("Copying data to an array of shapes.");

    ArrayNew<Shape> getData = new ArrayNew<Shape>(2);
    circ.copyTo(getData);

    System.out.println(getData.get(0).getArea());

    System.out.println(getData.get(1).getArea());
  }
}
