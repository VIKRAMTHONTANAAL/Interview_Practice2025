public class Pattern14 {
    public static void main(String[] args) {
        int n=5;
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=count;k++){
                if(i==1 || i==n){
                System.out.print("*");
                }else{
                    if(k==1||k==count){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }

                }
            }
            count=count+2;
            System.out.println();

        }
    }
}
