public class Mid {
  Mid(Dataobject gg) {

    dang = gg;
    // print out the reference to dang
    System.out.println(dang.toString());
    // we would change the value of D to something else
    dang.set(123);
  }

  Dataobject dang;
}
