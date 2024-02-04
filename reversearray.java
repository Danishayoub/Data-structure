public class reversearray {
    public static void reverse(int numbers[]){
        int f=0,l=numbers.length-1;
        while (f<l) {
            int temp=numbers[l];
            numbers[l]=numbers[f];
            numbers[f]=temp;
            f++;
            l--;

            
        }
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5};
        reverse(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
        
    
}
