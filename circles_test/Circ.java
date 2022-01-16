
class Circ {

  public static void main(String[] args) {
    // in each java program, we would have one main entry class with the public static void main
    // function
    // in this case, obj2 is a reference to the object 1 instance. Obj2 would only be separate from
    // obj 1 if a new object is assigned to obj2
    Circle obj = new Circle();
    Circle obj2 = obj;

    obj.x = 69;
    // This shows that obj2 is referenced to obj 1
    obj2.x = 71;

    System.out.println(obj.showx());
  }
}

class Circle {


  double showx() {

    return x;
  }

  double x;
  double y;
  double z;
}


