package ZooCreator;
import java.util.Scanner;

/**
 * Created by rodneytressler on 10/12/16.
 */
public class Employee extends People{
    String id;
    String position;
    String department;
    public static Scanner scanner = new Scanner(System.in);

    public Employee(String n, String a, String i, String p, String d) {
        super(n, a);
        id = i;
        position = p;
        department = d;
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
    public static String getId() {
        System.out.println("What is the id Number of the Employee?");
        String id1 = scanner.nextLine();
        return id1;
    }
    public static String getPosition() {
        System.out.println("What is the Employee's Position?");
        String position1 = scanner.nextLine();
        return position1;
    }
    public static String getDepartment() {
        System.out.println("Which Department do they work in?");
        String department1 = scanner.nextLine();
        return department1;
    }
    public String displayInfo() {
        return  "Role: Employee" + "\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "ID: " + id + "\n" +
                "Position: " + position + "\n" +
                "Department: " + department;
    }
    public static void buildPerson() {
        Employee e1 = new Employee(getName(), getAge(), getId(), getPosition(), getDepartment());
        list.add(e1.displayInfo());
    }
}
