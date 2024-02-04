public class binarySearch {
    public static int binarysearch(int arr[],int key){
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }
            if(arr[mid]>key){
                end=mid-1;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={1,3,5,7,8,9,11};
        int key=7;
        int index=binarysearch(arr, key);
        if(index==-1){
            System.out.println("key is not found");
        }else{
            System.out.println("The index of key is: "+index);
        }

    }
    
}
