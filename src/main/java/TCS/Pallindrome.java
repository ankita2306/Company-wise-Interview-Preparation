package TCS;

public class Pallindrome {
    public static void main(String[] args) {
       int x=1221;
       if (x < 0 || (x % 10 == 0 && x != 0))
            System.out.println(false);

        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + (x % 10);
            x = x / 10;
        }
        System.out.println(x == rev || x == rev / 10);
    }
}




/* String n=String.valueOf(s);

        int i=0,j=n.length()-1;

        boolean res=true;
        while (i<j)
        {
            if(n.charAt(i)!=n.charAt(j))
            {
                res=false;
                break;
            }
            //res=true;
            i++;
            j--;
        }
        System.out.println(res);*/





/*  String rev="";
        char x;

        for (int i = 0; i < n.length(); i++) {
            x=n.charAt(i);
            rev=x+rev;
        }
        if (rev.equals(n))
            System.out.println(true);
        else
            System.out.println(false);*/

