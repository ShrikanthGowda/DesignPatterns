package creational.singleton.resistance.reflection.upholdsSingleton;

public enum EnumSingletonSample2 {

  INSTANCE;

  private String name = "Micheal Scofield";
  private int age = 27;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public static EnumSingletonSample2 getInstance() {
    return INSTANCE;
  }

}
