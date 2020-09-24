package creational.singleton.resistance.serialization.upholdsSingleton;

import java.io.Serializable;

public class Singleton implements Serializable {

  private static Singleton singleton = new Singleton();

  private Singleton() {
  }

  public static Singleton getInstance() {
    return singleton;
  }

  public Object readResolve() {
    return singleton;
  }
}
