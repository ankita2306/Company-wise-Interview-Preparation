package TCS;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String n = "   fly me   to   the moon   ";

        String arr[]=n.split(" ");
       /* for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        String lastWord=arr[arr.length-1];
        System.out.println(lastWord);
    }
}
