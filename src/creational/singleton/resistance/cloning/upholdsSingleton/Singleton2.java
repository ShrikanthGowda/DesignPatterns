package creational.singleton.resistance.cloning.upholdsSingleton;

public class Singleton2 extends SuperClass{

  private static Singleton2 singleton = new Singleton2();

  private Singleton2() {
  }

  public static Singleton2 getInstance() {
    return singleton;
  }

  @Override
  public Object clone() throws CloneNotSupportedException{
    return singleton;
  }
}
