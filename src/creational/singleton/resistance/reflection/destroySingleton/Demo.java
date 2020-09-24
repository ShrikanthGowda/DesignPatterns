package creational.singleton.resistance.reflection.destroySingleton;

import java.lang.reflect.Constructor;

public class Demo {

  public static void main(String[] args) {

    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = null;

    try {
      Constructor[] constructors = Singleton.class.getDeclaredConstructors();
      for(Constructor constructor : constructors) {
        constructor.setAccessible(true);
        instance2 = (Singleton)constructor.newInstance();
        break;
      }
    }
    catch(Exception e) {
      e.printStackTrace();
    }

    System.out.println("instance1 hashcode : " + instance1.hashCode());
    System.out.println("instance2 hashcode : " + instance2.hashCode());
  }
}
