package stringPrograms;

import java.util.ArrayList;
import java.util.StringJoiner;

public class TestStringJoiner {


    public static void main(String []args){


        ArrayList<String> al = new ArrayList<String>();

        al.add("Pk");
        al.add("Gk");
        al.add("Rs");
        al.add("Ac");

        StringJoiner str = new StringJoiner(" , ");

        str.setEmptyValue("Empty string Joiner");
        System.out.println(str.toString());
        str.add(al.get(0)).add(al.get(1));

        System.out.println(str.toString());

        StringJoiner str2= new StringJoiner(" : ");

        str2.add(al.get(2)).add(al.get(3));

        str.merge(str2);

        System.out.println(str2.toString());

        System.out.println(str.toString());


       // System.out.println(str);


    }
}
