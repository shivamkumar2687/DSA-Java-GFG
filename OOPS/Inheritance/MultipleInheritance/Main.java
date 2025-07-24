package OOPS.Inheritance.MultipleInheritance;

interface  A{
    default void greet(){
        System.out.println("This is from class A");
    }
}
interface B{
    default void greet(){
        System.out.println("This is from class B");
    }
}

class C implements A,B{
    @Override
    public  void greet(){
        A.super.greet();
    }
}
class Main{
    public static void main(String[] args) {
        C obj = new C();
        obj.greet();
    }
}