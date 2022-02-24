/*
In the check class, we would attempt to catch the exception thrown by the
constructor of the circles class.




*/

public class Check {

  public static void main(String[] args) {
    Circle wow= null;
    // in the try statement, we would literally try to run some code
    try {
      // instantiate a new circle with a negative radius
      wow = new Circle(-3);
    } catch (IllegalArgumentException e) {

      // in the catch statement, the code in the block would run if the exception in the
      // parameter is thrown.
      // some code would run here.
      // In this case, we would print out what was the issue.
      System.out.println("This is illegal " + e.getMessage());
    } finally {
      // code in the finally block would be ran, irregardless if
      // an exception has been thrown or not.
      if (wow == null) {
        System.out.println("No circle yet");
      } else {
        System.out.println("There is a circle already.");
      }
    }
  }
}
