package MakeMyTrip;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String n = "I am a star";
        String reverse = reverseString(n);
        System.out.println(reverse);
    }


    public static String reverseString(String str) {
        //Write your code here

        String n[] = str.trim().split(" ");
        String z = "";
        for (int i = 0; i < n.length; i++) {
            z = n[i] + " " + z;
            // System.out.println(z);
        }
        return z.trim();
    }
}
