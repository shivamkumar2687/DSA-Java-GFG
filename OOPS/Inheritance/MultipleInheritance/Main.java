// The main reason Java doesn’t support multiple inheritance (with classes) 
// is to avoid confusion or conflict in cases like:

// The Diamond Problem

// class A {
//     void display() {
//         System.out.println("A's display");
//     }
// }

// class B extends A {
//     void display() {
//         System.out.println("B's display");
//     }
// }

// class C extends A {
//     void display() {
//         System.out.println("C's display");
//     }
// }

// // Now imagine: 
// // class D extends B, C { }  // Not allowed in Java

// ------
// If both B and C override display(), and class D inherits from both, then:

// D d = new D();
// d.display(); // ❓ Which display() should it call? B's or C's?






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
        A.super.greet(); //Resolves the conflict
        
    }
}
class Main{
    public static void main(String[] args) {
        C obj = new C();
        obj.greet(); // Output: Hello from A
    }
}