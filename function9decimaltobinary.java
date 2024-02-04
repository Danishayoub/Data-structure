public class function9decimaltobinary {
    public static void binarytodecimal(int n){
        int m=n;
        int pow=0;
        int bit=0;
        while (n>0){
            
            int rem=n%2;
            bit=bit +(rem *(int)Math.pow(10, pow));
            pow++;
            n=n/2;

        }
        System.out.println("the binary of " + m + "is :"+bit);
    }
    public static void main(String[] args) {
        binarytodecimal(7);
    }
    
}
