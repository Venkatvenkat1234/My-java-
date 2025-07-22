                                    //print addition value 3 times?
import java.util.*;
public class funmethod16 {
    public static void main(String[] args){
        System.out.println("first order");
        sum();
        System.out.println("Second order");
        sum();
        System.out.println("Thired order");
        sum();
    }
        static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first value");
        int num1= input.nextInt();
        System.out.println("Enter the second value" );
        int num2= input.nextInt();
        System.out.println("The answer is");
        int sum= num1+num2;
        System.out.println(sum);
    }
}

