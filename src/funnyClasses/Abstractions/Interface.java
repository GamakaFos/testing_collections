package funnyClasses.Abstractions;

public interface Interface {

    //doesn't matter if we will place public- interface variables will always be public
    public int somePublicValue = 0;
    int getSomePublicValue2 = 1;

    //we can't create private variables
    //private int somePrivateValue = 2;

    //final key word is prohibited as it will result int compile time error;
    final int someFinalValue = 3;

    //an interface method can't be protected or final
    //final int getSomeValueFromFinalMethod();
    //protected int getSomeValueFromFinalMethod();

    //private methods were impossible, but Java 9 introduces possibility to define private methods in interfaces
    //but private methods have to have body
    private static int privateStaticInterfaceMethod(){
        return someFinalValue;
    }
    private int privateInterfaceMethod(){
        return someFinalValue;
    }

    //private method called from default method
    default void bar() {
        System.out.print("Hello");
        baz();
    }

    private void baz() {
        System.out.println(" world!");
    }

    //private static method called from default method
    static void buzz() {
        System.out.print("Hello");
        staticBaz();
    }

    private static void staticBaz() {
        System.out.println(" static world!");
    }







    private int getFinalValue(){
        return someFinalValue;
    }

}
