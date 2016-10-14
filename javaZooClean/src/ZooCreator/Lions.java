package ZooCreator;

import java.util.Scanner;
/**
 * Created by rodneytressler on 10/12/16.
 */
public class Lions extends Animals {
    public static Scanner scanner = new Scanner(System.in);
    String gender;
    public Lions(String n, String s, String a, String g) {
        super(n, s, a);
        gender = g;
    }

    public static String getName() {
        System.out.println("What is the Lion's Name?");
        String name1 = scanner.nextLine();
        return name1;
    }
    public static String getAge() {
        System.out.println("What is the Lion's Age?");
        String age1 = scanner.nextLine();
        return age1;
    }

    public static String getSpecies() {
        String species1 = "Lion";
        return species1;
    }

    public static String getGender() {
        System.out.println("What is the Lion's Gender?");
        String gender1 = scanner.nextLine();
        return gender1;
    }

    public String displayInfo() {
        return "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Species: " + species + "\n" +
                "Exhibit: " + Exhibits.LION.exhibitz + "\n" +
                "Gender: " + gender;
    }
    public static void buildLion() {
        Lions l1 = new Lions(getName(), getSpecies(), getAge(), getGender());
        list.add(l1.displayInfo());
    }
}
