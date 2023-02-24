/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 10 2022
 * Description: Exercise 2 - HTML
 */


package strings3;

import java.util.Scanner;
import java.util.HashMap;

public class Ex2_HTML {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            HashMap<String, String> html = new HashMap<>() {{
                put("Bold", "b");
                put("Italics", "i");
                put("Underline", "i");
            }};

            String str;
            do {
                System.out.print("Enter string: ");
                str = sc.nextLine();
                if (!str.equals("0")) {
                    System.out.print("Enter formatting: ");
                    String formatting = sc.nextLine();

                    for (String type : html.keySet().toArray(new String[0])) {
                        if (formatting.equals(type)) {
                            System.out.printf("<%s>%s<\\%s>\n", html.get(type), str, html.get(type));
                        }
                    }
                }
            } while (!str.equals("0"));
            System.out.print("Goodbye");
        }
    }
}
