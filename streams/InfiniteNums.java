/*
 * Unlike infiniteones, the infinitenums class would
 * increment its head starting from the given seed number and upwards.
 *
 *
 *
 *
 *
 *
 *
 */

public class InfiniteNums {

  private int head;

  private Producer<InfiniteNums> tail =
      () -> {
        return new InfiniteNums(this.head + 1);
      };

  // constructor of InfiniteNums
  // the constructor would initialise the given infinite nums with the seed
  private InfiniteNums(int seed) {
    this.head = seed;
  }

  public static InfiniteNums generate(int s) {
    return new InfiniteNums(s);
  }

  // function which returns the head of infinite ones
  public int getHead() {
    return this.head;
  }

  // the getTail function would return a new instance of
  // the infiniteOnes object
  public InfiniteNums getTail() {
    return this.tail.produce();
  }
}
