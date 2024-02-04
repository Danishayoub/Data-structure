public class pattern11 {
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                //for star i
                System.out.print("*");
                
            }
            // for space 2*n-i
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            // for next star i

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                //for star i
                System.out.print("*");
                
            }
            // for space 2*n-i
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            // for next star i

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
    }
    
}
