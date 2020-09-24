package creational.singleton.resistance.reflection.upholdsSingleton;

public enum EnumSingletonSample1 {
  INSTANCE;
}

/*
To overcome issue raised by reflection, enums are used because java ensures enum is instantiated only once.
Since java enums are globally accessibly, they can be used for Singletons.

As enums don't have any constructors so it is not possible for refection to break singleton property.
enums have their default constructors which JVM manages, we can't invoke that constructor on our own.

INSTANCE is a public static final field which represents enum instance.
we can get instance of the class with EnumSingletonSample1.INSTANCE. but it is better to encapsulate it in a getter in case if we want to change the impl.

pros:
  Guaranted one instance(Cannot instantiate more that one enum even through reflection)
  Thread safe

cons:
  Doesn't allow lazy initialization
 */