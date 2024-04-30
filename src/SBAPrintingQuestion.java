import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SBAPrintingQuestion {

    Scanner sc = new Scanner(System.in);
    String s=sc.next();

    public void usingArrays(){
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.println("Number "+(i+1)+" is "+ch[i]);
        }
    }

    public void usingString(){
        for(int i=0;i<s.length();i++) {
            System.out.println("Number "+(i+1)+" is "+s.charAt(i));
        }
    }

    public void usingCharacter(){
        for(int i=0;i<s.length();i++) {
            System.out.println("Number "+(i+1)+" is "+Character.getNumericValue(s.charAt(i)));
        }
    }

}
