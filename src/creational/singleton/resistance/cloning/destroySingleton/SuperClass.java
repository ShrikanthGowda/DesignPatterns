package creational.singleton.resistance.cloning.destroySingleton;

public class SuperClass implements Cloneable {

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
