package creational.singleton.resistance.cloning.destroySingleton;

public class Demo {

  public static void main(String[] args) throws CloneNotSupportedException{

    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = null;

    instance2 = (Singleton) instance1.clone();

    System.out.println("instance1 hashcode : " + instance1.hashCode());
    System.out.println("instance2 hashcode : " + instance2.hashCode());
  }
}
