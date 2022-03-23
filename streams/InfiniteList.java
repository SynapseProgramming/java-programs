/*
 *  The idea behind the infinite list is that
 *
 *  The head of the infinite list is a producer ,which would produce the head.
 *  The tail of the infinite list is another producer, which would produce yet another
 *  infinite list.
 *
 *  The iterate function would create an infinte list,
 *  whereby each successive element is the result of applying a transformer function
 *  on the previous element
 *
 *
 *
 *
 *
 *
 */

public class InfiniteList<T> {
  private Producer<T> head;
  private Producer<InfiniteList<T>> tail;

  // constructor of InfiniteList
  private InfiniteList(Producer<T> h, Producer<InfiniteList<T>> t) {
    this.head = h;
    this.tail = t;
  }
  // generate takes in a transformer which would transform a value to another value
  // it would also take in an init seed value.
  // The next element in the infinte list would be the output of transform(init value)

  public static <T> InfiniteList<T> generate(T init, Transformer<? super T, ? extends T> x) {
    return new InfiniteList<T>(() -> init, () -> generate(x.transform(init), x));
  }
  // the map function would return a new infinite list with all existing elements in the
  // infinite list transformed to some new value
  
  public InfiniteList<T> map(Transformer<? super T, ? extends T> x) {
    return new InfiniteList<T>(() -> x.transform(this.getHead()), () -> this.getTail().map(x));
  }

  // function which returns the head of infiniteList
  public T getHead() {
    return this.head.produce();
  }

  // the getTail function would return a new instance of
  // the infiniteOnes object
  public InfiniteList<T> getTail() {
    return this.tail.produce();
  }
}
