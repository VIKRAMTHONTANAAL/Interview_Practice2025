public class pattern1 {
    public static void main(String[] args) {
        int n=9;
        int count=1;

        for(int i=n/2;i>=0;i--){

            for(int k=i;k>=0;k--){
            System.out.print(" ");
            }
          for(int j=1;j<=count && count<=n;j++){
              System.out.print(j);
          }

          count=count+2;
            System.out.println();
        }

        count=n;

        for(int l= 0;l<=n/2;l++){
            for(int m=0;m<=l;m++){
                System.out.print(" ");
            }
            for(int k=1;k<=count;k++ ){
                System.out.print(k);
            }
            count=count-2;
            System.out.println();
        }

    }
}
