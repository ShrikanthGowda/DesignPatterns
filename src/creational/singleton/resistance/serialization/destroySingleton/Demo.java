package creational.singleton.resistance.serialization.destroySingleton;

import java.io.*;

public class Demo {

  public static void main(String[] args) {

    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = null;

    try {
      //Serialization
      ObjectOutput output = new ObjectOutputStream(new FileOutputStream("/Users/shrikanth.kv/Desktop/Shrikanth/Personal/Learnings/GitHub/DesignPatterns/src/creational/singleton/resistance/serialization/destroySingleton/file.txt"));
      output.writeObject(instance1);
      output.close();

      //Deserialization
      ObjectInput input = new ObjectInputStream(new FileInputStream("/Users/shrikanth.kv/Desktop/Shrikanth/Personal/Learnings/GitHub/DesignPatterns/src/creational/singleton/resistance/serialization/destroySingleton/file.txt"));
      instance2 = (Singleton)input.readObject();
      input.close();
    }
    catch(Exception e) {
      e.printStackTrace();
    }

    System.out.println("instance1 hashcode : " + instance1.hashCode());
    System.out.println("instance2 hashcode : " + instance2.hashCode());

  }
}
