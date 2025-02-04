package MakeMyTrip;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String n="loveleetcode";
        int index=firstUniqChar(n);
        System.out.println(index);
    }

    public static int firstUniqChar(String s) {
        Map<Character,Integer> maps=new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if(maps.containsKey(s.charAt(i)))
                maps.put(s.charAt(i),maps.get(s.charAt(i))+1);
            else
                maps.put(s.charAt(i),1);
        }

        for (int i = 0; i < s.length(); i++) {
            if(maps.get(s.charAt(i))==1) {
                System.out.println(s.charAt(i));
                return i;
            }
        }
        return -1;
    }
}
