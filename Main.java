import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<Integer,String> keyvalue = new HashMap<Integer, String>();
        keyvalue.put(1,"lili");

        try {
            String t1 = keyvalue.get(2);
            System.out.println("tttt:" + t1);
        }
        catch(NullPointerException e){
            System.out.println("p1 is null point");
        }
    }
}
