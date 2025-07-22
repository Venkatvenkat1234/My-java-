import java.util.*;
public class largestnum9 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int max=a;
        if(b>max)
         max=b;
         if(c>max)
         max=c;
         if(d>max)
         max=d;
        
         System.out.println(max);
    }
    
}
