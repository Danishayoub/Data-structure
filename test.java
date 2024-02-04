public class test {
    public static void binarytodecimal(int n){
        int m =n;
        int pow=0;
        int dec=0;
        while(n>0){
            int lastd=n%10;
            dec=dec +(lastd*(int)Math.pow(2, pow));
            pow++;
            n=n/10;


        }
        System.out.println("the decimal of "+ m + "is: "+dec);
        
    }
    public static void main(String[] args) {
        binarytodecimal(101);
        
    }
    
}
