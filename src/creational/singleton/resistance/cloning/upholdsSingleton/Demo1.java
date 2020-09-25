package creational.singleton.resistance.cloning.upholdsSingleton;

public class Demo1 {

  public static void main(String args[]) throws CloneNotSupportedException{

    Singleton1 instance1 = Singleton1.getInstance();
    Singleton1 instance2 = null;

    instance2 = (Singleton1) instance1.clone();

    System.out.println("instance1 hashcode : " + instance1.hashCode());
    System.out.println("instance2 hashcode : " + instance2.hashCode());
  }
}
