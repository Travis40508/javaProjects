package ZooCreator;

import java.util.Scanner;
/**
 * Created by rodneytressler on 10/12/16.
 */
public class Tigers extends Animals {
    public static Scanner scanner = new Scanner(System.in);
    String weight;
    public Tigers(String n, String s, String a, String w) {
        super(n, s, a);
        weight = w;
    }

    public static String getName() {
        System.out.println("What is the Tiger's Name?");
        String name1 = scanner.nextLine();
        return name1;
    }
    public static String getAge() {
        System.out.println("What is the Tiger's Age?");
        String age1 = scanner.nextLine();
        return age1;
    }

    public static String getSpecies() {
        String species1 = "Tiger";
        return species1;
    }

    public static String getWeight() {
        System.out.println("What is the Tigers's Weight?");
        String weight1 = scanner.nextLine();
        return weight1;
    }

    public String displayInfo() {
        return "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Species: " + species + "\n" +
                "Exhibit: " + Exhibits.TIGER.exhibitz + "\n" +
                "Weight: " + weight;
    }
    public static void buildTiger() {
        Tigers t1 = new Tigers(getName(), getSpecies(), getAge(), getWeight());
        list.add(t1.displayInfo());
    }
}
