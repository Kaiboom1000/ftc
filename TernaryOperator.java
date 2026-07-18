import java.util.Scanner;

public class TernaryOperator {
    
    public static void main(String[] args) {

       
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = obj.nextInt();
        String result = (age>18) ? "Eligible to vote" : "Not eligible";
        System.out.print(result);
    }
}