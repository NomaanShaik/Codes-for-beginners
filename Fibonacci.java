import java.util.*;
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        int a=0;
        int b=1;
        Scanner sc= new Scanner(System.in); // or you can put int n1= any number, it is better to do in user's input
        System.out.println("Enter count: ");
        int count= sc.nextInt(); // This used to put the user input into a variable
        for(int i=2;i<=count;i++){ 
            int c=a+b;
            System.out.println(c);
            a=b; //after assigning b value to a, the value of b becomes zero
            b=c; // after assigning c value to b, we can make infinite fibonacci series
        }
    }
}
