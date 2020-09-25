package creational.singleton.resistance.cloning.upholdsSingleton;

public class Singleton1 extends SuperClass{

  private static Singleton1 singleton1 = new Singleton1();

  private Singleton1() {
  }

  public static Singleton1 getInstance() {
    return singleton1;
  }

  @Override
  public Object clone() throws CloneNotSupportedException{
    throw new CloneNotSupportedException();
  }
}
