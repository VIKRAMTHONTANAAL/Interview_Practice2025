public class SelectionSort {

    public static void main(String[] args) {
        int arr[]= {8, 6, 2, 5, 1};

        for(int i=0; i< arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }

            }

            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }

        for (int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
