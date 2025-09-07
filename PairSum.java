public class PairSum {
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target= 9;


        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(i!=j){
                   if(target== nums[i]+nums[j]){
                       System.out.print(nums[i]+" "+nums[j]+" "+i+" "+j);
                   }
                }
            }
            System.out.println();
        }

    }
}
