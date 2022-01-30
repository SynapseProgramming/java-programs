/*
 In this example, a new instance of dataobject is created and its reference is passed to dang.
 dang would have access to stuff within the object
 In addition to this, the reference stored by dang is passed on to the constructor of the Mid class
 which would be copied over to its internal reference of the Dataobject
 Thus, all of the classes effectively share the same object.
*/
public class High {
  High() {
    // create a new instance of dataobject
    dang = new Dataobject(69);
    // it has an initial value of 69
    this.say();
    // print out the reference to dang
    System.out.println(dang.toString());
    // the new object can change the value of the internal dang object to something else.
    hehe = new Mid(dang);
    // new value of 123
    this.say();
  }
  // print out the value of d
  public void say() {
    dang.printd();
  }

  Dataobject dang;
  Mid hehe;
}
