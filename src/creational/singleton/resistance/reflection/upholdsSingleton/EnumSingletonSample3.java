package creational.singleton.resistance.reflection.upholdsSingleton;

public enum EnumSingletonSample3 {

  INSTANCE;
  private String name;
  private int age;

  private void build(EnumSingletonSample3Builder builder) {
    this.name = builder.name;
    this.age = builder.age;
  }

  public void print() {
    System.out.println(name + " - " + age);
  }

  public static class EnumSingletonSample3Builder {

    private String name;
    private int age;

    EnumSingletonSample3Builder() {
    }

    public EnumSingletonSample3Builder name(String name) {
      this.name = name;
      return this;
    }

    public EnumSingletonSample3Builder age(int age) {
      this.age = age;
      return this;
    }

    public void build() {
      EnumSingletonSample3.INSTANCE.build(this);
    }
  }
}
