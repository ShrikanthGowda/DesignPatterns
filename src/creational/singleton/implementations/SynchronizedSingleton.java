package creational.singleton.implementations;

public class SynchronizedSingleton {

  private static SynchronizedSingleton singleton = null;

  private SynchronizedSingleton(){
  }

  public static synchronized SynchronizedSingleton getInstance() {

    if(singleton == null)
      singleton = new SynchronizedSingleton();
    return singleton;
  }
}

/*
pros: Thread safe
cons: using synchronized every time while creating/getting the singleton object is expensive and may decrease the performance of program.
      However if performance of getInstance() is not critical, this approach provides clean and simple solution.
 */