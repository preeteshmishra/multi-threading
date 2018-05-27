package stringPrograms;

public class StringFunCheck {

    public static void main(String []args){

        StringBuffer s = new StringBuffer("GeeksForGeeks");
        StringBuffer s1 = new StringBuffer("GeeksForGeeks");
        StringBuffer s2 = new StringBuffer("GeeksForGeeks");
        System.out.println(s.delete(0,5));

        System.out.println(s1.delete(1,5));
        System.out.println(s2.delete(2,5));

        String s5 = "Ram";
        String s6= "Ram";

        System.out.println(s5==s6);

    }
}
