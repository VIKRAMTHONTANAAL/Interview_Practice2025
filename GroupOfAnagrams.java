import java.util.*;

public class GroupOfAnagrams {
    public static void main(String[] args) {
        Map<String, List<String>> list=new HashMap<>();

        for(String str: args){
            char c[]=str.toCharArray();
            Arrays.sort(c);
            String sorted =new String(c);
            if(!(list.containsKey(sorted))){
                list.put(str,new ArrayList<>());
            }
            list.get(sorted).add(str);

        }

        for(Map.Entry<String, List<String>> entry: list.entrySet()){
            System.out.println(entry.getValue());
        }


    }
}
