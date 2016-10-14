package ZooCreator;

import java.util.Scanner;
/**
 * Created by rodneytressler on 10/12/16.
 */
public class Visitor extends People {
    String location;
    public static Scanner scanner = new Scanner(System.in);
    public Visitor(String n, String a, String l) {
        super(n, a);
        location = l;
    }
    public static String getName() {
        System.out.println("What is the Person's Name?");
        String name1 = scanner.nextLine();
        return name1;
    }
    public static String getAge() {
        System.out.println("What is the person's Age?");
        String age1 = scanner.nextLine();
        return age1;
    }
    public static String getLocation() {
        System.out.println("What is the Last Known Location of the Visitor?");
        String location1 = scanner.nextLine();
        return location1;
    }

    public String displayInfo() {
        return  "Role: Visitor" + "\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Last Known Location: " + location;
    }
    public static void buildPerson() {
        Visitor v1 = new Visitor(getName(), getAge(), getLocation());
        list.add(v1.displayInfo());
    }
}
