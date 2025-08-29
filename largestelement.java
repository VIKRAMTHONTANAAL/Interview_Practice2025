public class largestelement {

    public static void main(String[] args) {
        int arr[]= {19,6,7,8,9,10};

        System.out.println(largestElement(arr));
    }

    public static int largestElement(int[] arr ){
int max= Integer.MIN_VALUE;
for(int i = 0; i<arr.length;i++) {
if(arr[i]>max){
    max=arr[i];
}
}
return max;
    }
}
