import java.util.Scanner;

public class Calculator {
    static int add(int a, int b){
        return a + b;
    }
    static int substract(int a, int b){
        return a - b;
    }
    static int multiply(int a, int b){
        return a * b;
    }
    static int divide(int a, int b){
        return a / b;
    }
    public static void main(String[] args){
        System.out.println("Select maths opereation. Enter (a, b, c, or d)\n (a). Addition (+) \n (b). Substraction (-) \n (c). Multiplication (x) \n (d). Division (÷)");
        Scanner sc = new Scanner(System.in);
        
        char selectOp = sc.next().charAt(0);

        System.out.print("Enter first value: ");
        int inputA = sc.nextInt();

        System.out.print("Enter second value: ");
        int inputB = sc.nextInt();

        sc.close();

        if(selectOp == 'a'){
            System.out.println(add(inputA, inputB));

        } else if(selectOp == 'b'){
            System.out.println(substract(inputA, inputB));

        } else if(selectOp == 'c'){
            System.out.println(multiply(inputA, inputB));

        } else if(selectOp == 'd'){
            System.out.println(divide(inputA, inputB));

        } else{
            System.out.println("Selected Op is not an option.");
        }

    }
}
