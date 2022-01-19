class Count{
  // static member functions belong to the class. they do not belong to any instant of the class.
  // they are not allowed to access instance variables. 
  public static int getCnt(){
    return Count.cnt;
    }
  public static void increment(){
    Count.cnt++;
    //the following line is not allowed. This is because static member functions only have access to static variables(class variables)
    //this.inst++;
    }

  public static int cnt=0;
  public int inst=0;


  }
