public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int target =7;


        int index=binarySearch(arr, target);

        if(index!=-1){
            System.out.println("found at "+ index);

        }else{
            System.out.println("sorry we could not find");
        }
    }

    public static int binarySearch(int arr1[], int target){
        int start=0;
        int end=arr1.length;
        while(end>  start){
            int mid=(start+end)/2;
            System.out.println(mid);
            System.out.println();
            if(arr1[mid]==target){
                return mid;
            }else if(arr1[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return -1;
    }
}
