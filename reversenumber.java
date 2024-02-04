public class reversenumber{
    public static void main(String[] args) {
        int n=8398;
        while(n>0){
            int l=n%10;
            System.out.print(l);
            n=n/10;
        }
        
    }
}