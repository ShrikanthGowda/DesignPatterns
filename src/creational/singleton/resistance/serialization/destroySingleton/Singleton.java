package creational.singleton.resistance.serialization.destroySingleton;

import java.io.Serializable;

public class Singleton implements Serializable {

  private static Singleton singleton = new Singleton();

  private Singleton(){
  }

  public static Singleton getInstance(){
    return singleton;
  }
}
