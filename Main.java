import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> phoneNumber = new HashMap<>();

        phoneNumber.put("| Greta", "| 453 3431 1533 |");
        phoneNumber.put("| Karin", "| 634 2341 2344 |");
        phoneNumber.put("| Kevin", "| 324 5430 1222 |");


        System.out.println("| Name " + "|" +  " Phonenumber |");

        for (String name : phoneNumber.keySet()) {
            System.out.print(name);
            System.out.println(phoneNumber.get(name));
        }
    }
}