package creational.singleton.resistance.cloning.upholdsSingleton;

public class SuperClass implements Cloneable {

  @Override
  protected Object clone() throws CloneNotSupportedException{
    return super.clone();
  }
}