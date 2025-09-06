public class Pattern13 {
    public static void main(String[] args) {
        int n=5;
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=count;k++){
                System.out.print("*");
            }
            count=count+2;
            System.out.println();

        }

         count=n*2-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=count;k++){
                System.out.print("*");
            }
            count=count-2;
            System.out.println();

        }
    }
}
