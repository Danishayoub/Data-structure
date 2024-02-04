public class array4 {
    public static int largest(int arr[]){
        int largest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
        return largest;
    }
    
    public static void main(String[] args) {
        int arr[]={2,4,3,10,1,8};
        int largest=largest(arr);
        System.out.println("The largest number is: "+largest);
    
}
}