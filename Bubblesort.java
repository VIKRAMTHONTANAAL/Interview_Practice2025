public class Bubblesort
{

    public static void main(String[] args) {
        int a[] = {1, 4, 2, 6, 9, 8,10,3,5};


        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i-1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
    }
    }

//    public static int[] bubbleSort(int a[]){
//        for(int i=0;i< a.length-1-i;i++){
//            for(int j=1;j< a.length-i;j++){
//                if(a[i]>a[j]){
//                    int temp=a[i];
//                    a[i]=a[j];
//                    a[j]=temp;
//                    System.out.println("print");
//                }
//            }
//        }

