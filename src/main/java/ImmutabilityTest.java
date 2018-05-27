import java.util.HashMap;
import java.util.Iterator;

public class ImmutabilityTest {


private final int id;

private final String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, String> getTestMap() {
         return testMap;
       // return (HashMap<String, String>) testMap.clone();
    }

    private final HashMap<String,String> testMap;

/*public ImmutabilityTest(int i , String sName , HashMap<String,String> hm){ //deep copy

    System.out.println("Performing Deep Copy for Object initialization");

    this.id = i;
    this.name = sName;

    String key;

    HashMap<String,String> testMaps = new HashMap<>();

    Iterator<String> it = hm.keySet().iterator();

    while(it.hasNext()){

        key = it.next();
        testMaps.put(key,hm.get(key));
    }
    this.testMap = testMaps;
}*/


public ImmutabilityTest(int i , String sName , HashMap<String,String> hm){ // shallow copy

    this.id = i;
    this.name = sName;
    this.testMap = hm;
}



public static void main(String []args){

    int id = 10;
    String name  = "Preetesh";

    HashMap<String,String> resultMap = new HashMap<>();
    resultMap.put("011","New Delhi");
    resultMap.put("022","Mumbai");
    resultMap.put("033","Kolkata");

    ImmutabilityTest immutabilityTest = new ImmutabilityTest(id,name,resultMap);

    //Lets see whether its copy by field or reference

    System.out.println(name == immutabilityTest.getName());
    System.out.println(resultMap == immutabilityTest.getTestMap());


    id = 15;
    name = "Shivam";
    resultMap.put("044","Chennai");

    System.out.println("id " + immutabilityTest.getId());
    System.out.println("name = " + immutabilityTest.getName());
    System.out.println("testMap = " + immutabilityTest.getTestMap());


    HashMap<String,String> hmTest = immutabilityTest.getTestMap();
    hmTest.put("080","Bengaluru");

    System.out.println("Map after alteration " + immutabilityTest.getTestMap());
    System.out.println("Map after alteration ++ " + hmTest );


/*  This is the output when constructor is performing deep copy
    Performing Deep Copy for Object initialization
    true
    false
    id 10
    name = Preetesh
    testMap = {011=New Delhi, 022=Mumbai, 033=Kolkata}
    Map after alteration {011=New Delhi, 022=Mumbai, 033=Kolkata}
    Map after alteration ++ {011=New Delhi, 022=Mumbai, 033=Kolkata, 080=Bengaluru}*/


  /* This is the output when constructor is performing shallow copy.
    true
    true
    id 10
    name = Preetesh
    testMap = {011=New Delhi, 022=Mumbai, 033=Kolkata, 044=Chennai}
    Map after alteration {011=New Delhi, 022=Mumbai, 033=Kolkata, 044=Chennai, 080=Bengaluru}
    Map after alteration ++ {011=New Delhi, 022=Mumbai, 033=Kolkata, 044=Chennai, 080=Bengaluru}*/





}


}
