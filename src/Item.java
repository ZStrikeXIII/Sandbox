public interface Item { //We're designing a base class for another class to use.

  //Private not allowed means we aren't in a normal object class.
  //String name; //Implicitly made public static final

  public void printItemInfo(); //abstract means it's not a real method. Just a title.
  //Any class that implements this interface will have this method

}
