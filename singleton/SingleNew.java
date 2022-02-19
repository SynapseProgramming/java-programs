/*
A singleton is a type of class whereby calling it would only instantiate one object.
Therefore, we can keep reusing the same instance, thus saving computational resources.
This class is a modified version of single, whereby there would be an integer in the construct function.
*/

public class SingleNew {

  private SingleNew() {}
  ;

  private static SingleNew inst = null;

  public static SingleNew construct(int x) {
    // return the same instance
    if (x == 0) {
      if (SingleNew.inst == null) {
        SingleNew.inst = new SingleNew();
      }
      return SingleNew.inst;
    } else {
      SingleNew.inst = new SingleNew();

      return SingleNew.inst;
    }
  }
}
