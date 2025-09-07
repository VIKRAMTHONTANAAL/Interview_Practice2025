public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int arr[]={2,1,2,3};

        int newarr[]=new int[arr.length];
        int product=1;

        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j){
                    product=product*arr[j];
                }
            }
            newarr[i]=product;
            product=1;
        }

        for(int k=0;k<newarr.length;k++){
            System.out.print(newarr[k]+" ");
        }
    }
}
