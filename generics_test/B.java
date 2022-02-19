/*
This example is used to show
if two separate objects of B can be compared with one another
  using the equals function.

The equals function takes in an object(to be general)

NOTE: (this) keyword alone would return a reference to the current instantiated object.

cases where they are equal.

Firstly, the object must be an instance of B. Otherwise, it is clearly not equal

Next, if either the B object is not instantiated or the given object is not instantiated, then we would return false.






*/

class B<T> {

  private B<T> curr;
  private T x;

  B(T inp) {
    this.x = inp;
  }

  @Override
  public boolean equals(Object a) {
    // check if the current object is an intance of B
    if (a instanceof B<?>) {
      // typecast a to a generic version of B.
      B<?> g = (B<?>) a;
      // check if either objects are null or not
      if (this == null || a == null) {
        return false;
      }
      // use the equals method in type T to check if the two values are the same or not.<F12>
      return this.x.equals(g.getValue());

    } else {
      return false;
    }
  }

  public T getValue() {
    return this.x;
  }
}
