package premium;

import java.util.Set;

public class RemoveVowels {
    public static void main(String[] args) {
        String n = "leetcodeisacommunityforcoders";
        String res = removeVowels(n);
        System.out.println(res);

        String resEff = removeVowelsEff(n);
        System.out.println(resEff);
    }

    private static String removeVowelsEff(String n)
    {
       // public static final Set<Character> vowels=Set.of('a',e,)
        return null;
    }

    public static String removeVowels(String n) {

        String vowels="aeiouAEIOU",z="";
        char x;
        for (int i = 0; i < n.length(); i++) {
            x=n.charAt(i);

            if(!(x=='a' ||x=='e' ||x=='i' ||x=='o' ||x=='u' ||
                    x=='a' ||x=='e' ||x=='i' ||x=='o' ||x=='u' ))
            {
                z=z+x;

            }

        }
        System.out.println(z);
     //2.   return n.replaceAll("[aeiouAEIOU]","");
        return z;
    }
}
