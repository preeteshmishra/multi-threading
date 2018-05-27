package stringPrograms;

import java.util.StringTokenizer;

public class TestStringTokenizer {


    public static void main(String []args){

        StringTokenizer str = new StringTokenizer("Hello there , I am your personal assistant , call me Wily"," ",false);

        while(str.hasMoreTokens()){

            System.out.println(str.nextToken());
        }


    }

}
