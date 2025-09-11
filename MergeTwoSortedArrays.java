public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int a[]={1,3,5,7,9};
        int b[]={2,4,6,8};
        int i=0,j=0,k=0;

        int newarr[]=new int[a.length+ b.length];

        while(j<a.length && k< b.length){
            if(a[j]<b[k]){
                newarr[i]=a[j];
                j++;

            }else{
                newarr[i]=b[k];
                k++;
            }
            i++;
        }
        while (j<a.length){
            newarr[i]=a[j];
            i++;
            j++;
        }
        while (k<b.length){
            newarr[i]=b[k];
            i++;
            k++;
        }

        for(int l=0;l<newarr.length;l++){
            System.out.print(newarr[l]+" ");
        }
    }
}
