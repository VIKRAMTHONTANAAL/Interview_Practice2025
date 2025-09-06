public class Pattern11 {
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
    }
}
