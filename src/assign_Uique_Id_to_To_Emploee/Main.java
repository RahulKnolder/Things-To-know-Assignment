package assign_Uique_Id_to_To_Emploee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner readName = new Scanner(System.in);
        System.out.println("Enter name");
        Employee emp1 = new Employee(readName.nextLine());
        System.out.println("ID: " + emp1.getId() + ", Name: " + emp1.getName()); // Output: ID: 1, Name: John



        System.out.println("Enter Seconde name name");
        Employee emp2 = new Employee(readName.nextLine());
        System.out.println("ID: " + emp2.getId() + ", Name: " + emp2.getName()); // Output: ID: 2, Name: Jane

    }
}
