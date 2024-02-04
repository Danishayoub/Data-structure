public class linearSearch1 {
    public static int linearsearch(String arr[],String key){
        for(int i=1;i<arr.length;i++){
            if(key==arr[i]){
                return i;
            }
    }
    return -1;
}
    public static void main(String[] args) {
        String arr[]={"chole", "bhature","samosa","chatni","chowmin","salad"};
        String key="raita";
        int index=linearsearch(arr, key);
        if(index==-1){
            System.out.println("key is not found");
        }
        else{
        System.out.println("The index where key is found is: "+index);
        }
    }
}
