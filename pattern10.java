public class pattern10{
public static void main(String[] args) {
    int n=4;
    for (int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(" ");

        }
        for(int k=1;k<=n;k++){
            if(k==1 ||k==n ||i==1 ||i==n){
            System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
        
    }
}

}
