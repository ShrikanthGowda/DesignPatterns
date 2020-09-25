package creational.singleton.resistance.cloning.upholdsSingleton;

public class Demo2 {

  public static void main(String[] args) throws CloneNotSupportedException{

    Singleton2 instance1 = Singleton2.getInstance();
    Singleton2 instance2 = null;

    instance2 = (Singleton2)instance1.clone();

    System.out.println("instance1 hashcode : " + instance1.hashCode());
    System.out.println("instance2 hashcode : " + instance2.hashCode());
  }
}
