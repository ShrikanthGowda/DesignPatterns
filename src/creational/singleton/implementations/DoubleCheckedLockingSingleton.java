package creational.singleton.implementations;

public class DoubleCheckedLockingSingleton {

  private static volatile DoubleCheckedLockingSingleton singleton = null;

  private DoubleCheckedLockingSingleton(){
  }

  public static DoubleCheckedLockingSingleton getInstance() {

    if(singleton == null) {
      synchronized(DoubleCheckedLockingSingleton.class) {
        if(singleton == null)
          singleton = new DoubleCheckedLockingSingleton();
      }
    }
    return singleton;
  }
}

/*
pros: Lazy initialization
      Thread safe
      Synchronized block won't get call for read and will get call only once for creation
 */
