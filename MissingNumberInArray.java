public class MissingNumberInArray {
    public static void main(String[] args) {
        int arr[]={1, 2, 4, 5, 6};
        int n= arr.length+1;
        int sum= (n * (n+1))/2;
        int arrsum=0;
        for(int i=0;i<arr.length;i++){
            arrsum=arrsum+arr[i];
        }

        System.out.println("Missing element is "+ (sum-arrsum));
    }
}
