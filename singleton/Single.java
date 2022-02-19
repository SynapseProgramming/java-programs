/*
A singleton is a type of class whereby calling it would only instantiate one object.
Therefore, we can keep reusing the same instance, thus saving computational resources.
*/

public class Single {

  private Single() {}
  ;

  private static Single inst = null;

  public static Single construct() {
    if (Single.inst == null) {
      Single.inst = new Single();
    }
    return Single.inst;
  }
}
