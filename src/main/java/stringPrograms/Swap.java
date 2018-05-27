package stringPrograms;

import java.util.*;

class Swap implements java.io.Serializable
{
    public static void main(String args[])
    {
        // Declare two strings
        String a = "Hello1";
        String b = "World123";

        System.out.println(a.replace('l','p'));

        // Print String before swapping
        System.out.println("Strings before swap: a = " +
                a + " and b = "+b);

        // append 2nd string to 1st
        a = a + b;

        // store intial string a in string b
        b = a.substring(0,a.length()-b.length());

        // store initial string b in string a
        a = a.substring(b.length());

        // print String after swapping
        System.out.println("Strings after swap: a = " +
                a + " and b = " + b);
    }
}
