import java.lang.reflect.Array;
import java.util.Arrays;

public class SingleSortedArray {

    public static void main(String[] args) {
        int arr1[]={5,8,7,6};
        int arr2[]={1,3,2,4};

        int newarr[]=new int[arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++){
            newarr[i]=arr1[i];
        }
        for(int j=arr1.length,i=0; j<(arr1.length+arr2.length);j++,i++){
            newarr[j]=arr2[i];
        }
        printArray(newarr);
        Arrays.sort(newarr);
        printArray(newarr);
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
