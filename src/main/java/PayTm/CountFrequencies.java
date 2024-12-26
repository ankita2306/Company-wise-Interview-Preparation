package PayTm;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencies {
    //in O(1) extra space and O(n) time
    public static void main(String[] args) {
        int a[]={5,3,2,7,5,1,6,6,5,3,3,3};
        count(a);
    }

    private static void count(int[] a) {

    }
   /* public static void count(int[] a)
    {
        Map<Integer,Integer> maps=new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if (maps.containsKey(a[i]))
                maps.put(a[i],maps.get(a[i])+1);

            else
                maps.put(a[i],1);
        }

        for (Map.Entry<Integer,Integer> entry:maps.entrySet())
        {
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }
    }*/
}
