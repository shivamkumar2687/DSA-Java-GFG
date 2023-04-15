import java.util.Scanner;

public class calculator {       //program for clculator using switch case
    public static void main(String[] args) {
        System.out.println("Enter 1st and 2nd number respectively : ");
        Scanner sc=new Scanner (System.in);
        float a= sc.nextFloat();
        float b= sc.nextFloat();
        System.out.println("Enter + ,-,*,/ for add,subtract,multiply,division ");
        char ch= sc.next().charAt(0);   //taking charcter input for switch condition
        switch(ch){
            case '+' :
                System.out.println("Addition of two numbers is : "+ (a+b));
                break;
            case '-' :
                System.out.println("Subtraction of two numbers is : "+ (a-b));
                break;
            case '*' :
                System.out.println("Multiplication of two numbers is : "+ (a*b));
                break;
            case '/' :
                System.out.println("Division of two numbers is : "+ (a/b));
                break;
            default :
                System.out.println("Wrong input");
        }
    }
}
