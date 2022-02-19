/*

The ArrayNew class would demonstrate how wildcards can be used, to workaround 
the invariance of generic types in java. 

key acronym: PECS
producer extend, consumer super

producer: gives data to the current class
eg: src argument in CopyFrom function gives data in the form of src.get();
We would want to apply an upper type bound in this case, to ensure that we would
have access to the .get function. (all child classes would inherit parent class public functions)

consumer: gets data from the current class.
eg: dest argument in copyTo function gets data from the current class.
In this case, we can apply a lower bound to the current type(type of T and upwards)
Recall that we can reference subtype objects with their supertypes.
Thus, we can safely pass data to another object of type T and its supertypes.


*/

class ArrayNew<T> {
  private T[] array;

  ArrayNew(int size) {
    // The only way we can put an object into the array is through
    // the method set() and we only put an object of type T inside.
    // So it is safe to cast `Object[]` to `T[]`.
    @SuppressWarnings("unchecked")
    T[] a = (T[]) new Object[size];
    this.array = a;
  }

  public void set(int index, T item) {
    this.array[index] = item;
  }

  public T get(int index) {
    return this.array[index];
  }

  public void copyFrom(ArrayNew<? extends T> src) {
    int len = Math.min(this.array.length, src.array.length);
    for (int i = 0; i < len; i++) {
      this.set(i, src.get(i));
    }
  }

  public void copyTo(ArrayNew<? super T> dest) {
    int len = Math.min(this.array.length, dest.array.length);
    for (int i = 0; i < len; i++) {
      dest.set(i, this.get(i));
    }
  }
}
