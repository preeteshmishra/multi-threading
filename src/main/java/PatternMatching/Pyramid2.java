package PatternMatching;

public class Pyramid2
{

    public static void print(int n){

        int k = 2*n -2;

        for(int i = 0;i<n;i++){

            for(int j = 0;j<k;j++){
                System.out.print(" ");
            }


            k = k -2;
            for(int m = 0;m<=i;m++){
                System.out.print(" *");
            }
            System.out.println();

        }

    }

    public static void main(String []args){

        print(5);
    }

}
