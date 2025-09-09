import java.util.Arrays;

public class RemoveDuplicatesInArray {
    public static void main(String[] args) {
        int arr[]={1, 2, 2, 3, 4, 4, 4, 5, 5};
        Arrays.sort(arr);
        int num=Integer.MIN_VALUE;
        int newarr[]=new int[arr.length];
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(num!=arr[i]){
            System.out.print(arr[i]+" ");
            newarr[count++]=arr[i];
            num=arr[i];}

        }
        System.out.println();
        System.out.println(newarr.length);
        for(int j=0;j<newarr.length && newarr[j]!=0;j++){
            System.out.print(newarr[j]+" ");
        }
    }
}
