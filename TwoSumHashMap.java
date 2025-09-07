import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMap {
    public static void main(String[] args) {
        int arr[]={3,6,5,8,11};
        int target=11;
        Map <Integer, Integer> hash=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int need = target-arr[i];
            if( hash.containsKey(need)){
//                System.out.print(arr[i]+" "+need);
               System.out.println(i+" "+hash.get(need));
            }
            System.out.println();
            hash.put(arr[i],i);

        }



    }
}
