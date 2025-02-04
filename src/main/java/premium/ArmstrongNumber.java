package premium;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=9474;

        boolean res=isArmstrong(n);
        System.out.println(res);
    }

    public static boolean isArmstrong(int n) {

        if(n<10)
            return true;

        String stringForm=String.valueOf(n);
        int  length=stringForm.length();

        int b=n,x;
        double s=0;

        while(b!=0)
        {
          x=b%10;
          s=s+Math.pow(x,length);
          b=b/10;
        }
        System.out.println(s);
        if(s==n)
            return true;
        else
            return false;
    }
}
