public class Secondlargest {
    public static void main(String[] args) {
        int arr[] ={21,5,6,8,9,10,19};
        int arr1[] ={10,7,23,45,50};


        System.out.println(secondLargest(arr));
    }

    public static int secondLargest(int arr[]){
        int largest= Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i =0;i<arr.length; i++){
            if(arr[i]>=largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest ){
                secondLargest=arr[i];
            }

        }
        return secondLargest;
    }
}
