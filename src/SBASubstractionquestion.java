public class SBASubstractionquestion {

    public void printSubStraction() {
        String s = "824";
        char ch[]=s.toCharArray();
        int sub=Character.getNumericValue(ch[0]);
        for(int i=1;i<ch.length;i++){
            sub=sub-Character.getNumericValue(ch[i]);
        }
        System.out.println("sub is "+ sub);
    }
}