package stringPrograms;

import java.util.*;

public class GetSmallestAndLargest {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

/*List<String> stringArray = new ArrayList<>();
        for(int i = 0;i<s.length() -k+1;i++){
            stringArray.add(s.substring(i,i+k));

        }
        Collections.sort(stringArray);

        Iterator it = stringArray.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + "  ");
        }

        smallest = stringArray.get(0);
        largest = stringArray.get(stringArray.size()-1);
        System.out.println();*/
StringBuilder sBuilder = new StringBuilder(s);

        smallest = sBuilder.substring(0,k);
        largest = sBuilder.substring(2,5);

for(int i = 0;i<sBuilder.length()-k+1;i++){

    if(sBuilder.substring(i,k+i).compareTo(smallest)<0)
        smallest = sBuilder.substring(i,i+k);
    else
        if (sBuilder.substring(i,i+k).compareTo(largest)>0)
            largest = sBuilder.substring(i,i+k);


}



        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
      //  StringBuilder sBuilder = new StringBuilder(s);
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
