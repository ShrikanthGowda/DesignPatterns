package creational.singleton.implementations;

public class ClassicSingleton {

  private static ClassicSingleton singleton = null;

  private ClassicSingleton() {
  }

  public static ClassicSingleton getInstance() {
    if(singleton == null)
      singleton = new ClassicSingleton();
    return singleton;
  }

}

/*
Classic Singleton Implementation || Lazy Initialization
cons: Classic Singleton Implementation is not thread safe
*/
