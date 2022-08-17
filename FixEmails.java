package SetsAndMapsAdvanced.Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //name -> email
        LinkedHashMap<String, String> emailDataMap = new LinkedHashMap<>();
        String name = scanner.nextLine();

        while (!name.equals("stop")) {
            //име на човек
            String email = scanner.nextLine();
            //добавяме имейли само ако не завършват на: "us", "uk" or "com"
            if (!email.endsWith("us") && !email.endsWith("uk") && !email.endsWith("com")) {
                //валиден мейл и не завършва на "us", "uk" or "com"

                emailDataMap.put(name, email);
            }
            name = scanner.nextLine();
        }
        emailDataMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
