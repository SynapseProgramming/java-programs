/*
 *  The infinite ones class would produce a linked list,
 *  whereby the head is the number 1, and the tail is a producer object
 *  which would produce another instance of the infiniteOnes class when called.
 *  etc..
 *
 *  Thus, the infinite ones class is actually infinite
 *
 *  This class shows how the producer interface is used to
 *  defer computations (in this case, it is the infinite Ones object)
 *
 *
 *
 */

public class InfiniteOnes {

  private int head = 1;
  private Producer<InfiniteOnes> tail =
      () -> {
        return new InfiniteOnes();
      };

  // function which returns the head of infinite ones
  public int getHead() {
    return this.head;
  }

  // the getTail function would return a new instance of
  // the infiniteOnes object
  public InfiniteOnes getTail() {
    return this.tail.produce();
  }
}
