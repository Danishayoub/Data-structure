import java.util.Scanner;

public class Function2 {
    public static int sum(){
        Scanner sc=new Scanner(System.in );
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("The sum is: ");
        System.out.println(a+b);
        return a+b;
    }
    public static void main(String[] args) {
      sum();
    }
    
}
