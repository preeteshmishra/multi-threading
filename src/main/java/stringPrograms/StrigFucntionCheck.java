package stringPrograms;

public class StrigFucntionCheck {

    public static void main(String []args){

        String str = "GOD";

        char []charAray = str.toCharArray();

        for(int j = 0;j<charAray.length;j++){
            System.out.print(charAray[j]);
        }

System.out.println();
        for(int i = str.length();i>0;i--){

            System.out.print(str.charAt(i-1));
        }
    }
}
