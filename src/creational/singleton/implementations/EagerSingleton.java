package creational.singleton.implementations;

public class EagerSingleton {

  private static EagerSingleton singleton = new EagerSingleton();

  private EagerSingleton(){
  }

  public static EagerSingleton getInstance() {
    return singleton;
  }
}


/*
Eager Initialization
pros: JVM executes static initializer at the time of class loading, so this approach will be thread safe
cons: use this approach only when singleton class is light and is used throughout the execution of the program.
 */