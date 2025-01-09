import java.util.Map;
import java.util.HashMap;

class demo{

    public static void main(String a[]){

        Map<String,Integer> student= new HashMap<>();

        student.put("Ashwin",58);
        student.put("Rohit",26);
        student.put("Shantanu",18);
        student.put("Rachana",40);

        System.out.println(student.keySet());
        
           

    }
}