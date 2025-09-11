public class LargestSmallestInArray {
    public static void main(String[] args) {
        int a[]={5, 1, 9, 3, 7};
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int second_largest=Integer.MIN_VALUE;
        int second_smallest=Integer.MAX_VALUE;


        for(int i=0;i<a.length;i++ ){
            if(a[i]>largest){
                second_largest=largest;
                largest=a[i];
            } else if (a[i]>second_largest) {
                second_largest=a[i];

            }
            if(a[i]<smallest){

                second_smallest=smallest;
                smallest=a[i];
            } else if(a[i]<second_smallest){
                second_smallest=a[i];
            }
        }
        System.out.println(largest);
        System.out.println(second_largest);
        System.out.println(smallest);
        System.out.println(second_smallest);

    }
}
