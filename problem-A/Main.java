import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        try {
            System.out.print("Enter the first number:");
            int a = sc.nextInt();
            System.out.print("Enter the second number:");
            int b = sc.nextInt();

            Calculator obj1 = new Calculator(a, b);
            Calculator obj2 = new Calculator(a, b);
            Calculator obj3 = new Calculator(a, b);
            Calculator obj4 = new Calculator(a, b);

            System.out.println("Addition: " + obj1.Add());
            System.out.println("Subtract: " + obj2.Subtract());
            System.out.println("Multiplication: " + obj3.Multiplication());
            System.out.println("Division: " + obj4.Division());
        }
        catch (ArithmeticException e){
            throw new ArithmeticException("Error " + e.getMessage());
        }
        catch (NumberFormatException e){
            throw new NumberFormatException("Your datatype is not input");
        }
        catch(InputMismatchException e ){
            throw new InputMismatchException("Your number is not input");
        }
    }
}
