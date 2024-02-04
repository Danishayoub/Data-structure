public class function8binarytodecimal {
    public static void binarytodecimal(int n){
        int m=n;
        int pow=0;
            int dec=0;
        while(n>0){
            
            int lastdigit=n%10;
            dec=dec + (lastdigit*(int)Math.pow(2, pow));
            pow++;
            n=n/10;
        }
        System.out.println("Decimal of "+m+" is: "+dec);
    }
    public static void main(String[] args) {
        binarytodecimal(111);
        
    }
    
}
