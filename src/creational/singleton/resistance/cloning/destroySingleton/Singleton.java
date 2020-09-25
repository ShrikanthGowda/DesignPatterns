package creational.singleton.resistance.cloning.destroySingleton;

public class Singleton extends SuperClass {

  private static Singleton singleton = new Singleton();

  private Singleton() {
  }

  public static Singleton getInstance() {
    return singleton;
  }
}
