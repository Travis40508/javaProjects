package ZooCreator;

import java.util.Scanner;
/**
 * Created by rodneytressler on 10/12/16.
 */
public class Bears extends Animals {
    public static Scanner scanner = new Scanner(System.in);
    String height;
    public Bears(String n, String s, String a, String h) {
        super(n, s, a);
        height = h;
    }
    public static String getName() {
        System.out.println("What is the Bear's Name?");
        String name1 = scanner.nextLine();
        return name1;
    }
    public static String getAge() {
        System.out.println("What is the Bear's Age?");
        String age1 = scanner.nextLine();
        return age1;
    }

    public static String getSpecies() {
        String species1 = "Bear";
        return species1;
    }

    public static String getHeight() {
        System.out.println("What is the Bear's Height?");
        String height1 = scanner.nextLine();
        return height1;
    }

    public String displayInfo() {
        return "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Species: " + species + "\n" +
                "Exhibit: " + Exhibits.BEAR.exhibitz + "\n" +
                "Height: " + height;
    }
    public static void buildBear() {
        Bears b1 = new Bears(getName(), getSpecies(), getAge(), getHeight());
        list.add(b1.displayInfo());
    }
}
