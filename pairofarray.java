public class pairofarray {
    public static void pair(int numbers[]){
        int count=0;
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
                count++;
            }
            System.out.println();
        }
        System.out.println("total pair= "+count);
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5};
        pair(numbers);
    }
    
}
