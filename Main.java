import java.util.*;
public class Main {

        public static void main(String[] args) {
            String s="aabbdecdda";

            //a3b2c1d3e1
            Map <Character, Integer> map=new HashMap<>();
            Integer count=1;
            for(int i=0;i<s.length();i++){

                map.put((char)s.charAt(i),map.getOrDefault(s.charAt(i),0)+count);

            }

            Character c='a';

            while(c>='a' && c <='z'){

                if(map.containsKey(c)){
                    System.out.print(c+" "+map.get(c)+" ");
                }
                c++;
            }



        }
    }

