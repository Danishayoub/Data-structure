public class linearSearch {
    public static int linearsearch(int arr[],int key){
        for(int i=1;i<arr.length;i++){
            if(key==arr[i]){
                return i;
            }
    }
    return -1;
}
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,7,3,11,10};
        int key=11;
        int index=linearsearch(arr, key);
        if(index==-1){
            System.out.println("key is not found");
        }
        else{
        System.out.println("The index where key is found is: "+index);
        }
    }
}

