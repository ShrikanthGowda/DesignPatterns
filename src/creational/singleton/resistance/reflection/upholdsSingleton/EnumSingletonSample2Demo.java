package creational.singleton.resistance.reflection.upholdsSingleton;

public class EnumSingletonSample2Demo {

  public static void main(String[] args) {

    EnumSingletonSample2 sample2 = EnumSingletonSample2.INSTANCE;
    System.out.println("By Instance : " + sample2.getName() + " - " + sample2.getAge());

    EnumSingletonSample2 sample21 = EnumSingletonSample2.getInstance();
    System.out.println("By getInstance() : " + sample2.getName() + " - " + sample2.getAge());
  }
}
