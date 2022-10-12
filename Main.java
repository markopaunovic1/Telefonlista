import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Map<String, String> phoneNumber = new HashMap<>();

        phoneNumber.put("Greta", "453 3431 1533");
        phoneNumber.put("Karin", "634 2341 2344");
        phoneNumber.put("Kevin", "324 5430 1222");


        System.out.println("| Name " + " |" + " Phonenumber |");
        System.out.println("--------|--------");


        for (String name : phoneNumber.keySet()) {
            System.out.print(name);
            System.out.println(phoneNumber.get(name));
        }

        System.out.println("Enter the name you want number from: (Greta, Karin, Kevin)");

        String searchName = input.nextLine();

        String number1 = phoneNumber.get("Greta");
        String number2 = phoneNumber.get("Karin");
        String number3 = phoneNumber.get("Kevin");

        if (searchName.equalsIgnoreCase("Greta")) {
            System.out.println("Greta's number: "+  number1);

        }  if (searchName.equalsIgnoreCase("Karin")) {
            System.out.println("Karin's number: " + number2);

        }  if (searchName.equalsIgnoreCase("Kevin")) {
            System.out.println("Kevin's number: " + number3);
        } else {
            System.exit(0);
        }
    }
}
