package OOPS;

public class ClassAndObject {
    private int num1;
    private int num2;

    //Constructor to initialize the object
    public ClassAndObject(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Method to add two numbers
    public int add(){
        return num1+num2;
    }

    // Method to subtract two numbers
    public int sub(){
        return num1-num2;
    }

    public static void main(String[] args) {
        // Creating an object of classAndObject
     ClassAndObject obj = new ClassAndObject(7,2);
        // Using the object to call methods
        int sum = obj.add();
        int difference = obj.sub();

        // Printing the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
       
    
}

}

