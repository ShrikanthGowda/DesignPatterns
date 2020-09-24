package creational.singleton.resistance.reflection.upholdsSingleton;

public class EnumSingletonSample3Demo {

  public static void main(String[] args) {

    new EnumSingletonSample3.EnumSingletonSample3Builder()
            .name("Micheal Scofield")
            .age(27)
            .build();

    EnumSingletonSample3.INSTANCE.print();
  }
}
