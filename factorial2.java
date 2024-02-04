import java.util.Scanner;

public class factorial2 {
    public static long fact(int n){
        int fact=n;
        if(n==1 ||n==0){
            return 1;
        }
        else{
            
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        long factorial=fact(n);
        System.out.println(factorial);
    }
    
}
