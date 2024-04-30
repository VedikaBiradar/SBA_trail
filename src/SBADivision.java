import java.util.Scanner;

public class SBADivision {
    public void division(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.next();

        char[] ch=s.toCharArray();
        int div=Character.getNumericValue(ch[0]);
        for(int i=1;i<ch.length;i++){
            div=div/Character.getNumericValue(ch[i]);
        }

        System.out.println("Division is: "+div);


    }
}
