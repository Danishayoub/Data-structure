public class function4 {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
            
        }
        return fact;
    }
    public static int coefficient(int n ,int r){
    int nfact=factorial(n);
    int rfact=factorial(r);
    int nrfact=factorial(n-r);
    int bc=nfact/(rfact*nrfact);
    System.out.println("binomial coefficient is:"+bc);
    return bc;
    }
    public static void main(String[] args) {
        coefficient(5, 2);
        
    }
}