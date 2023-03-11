package assign_Uique_Id_to_To_Emploee;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John");
        System.out.println("ID: " + emp1.getId() + ", Name: " + emp1.getName()); // Output: ID: 1, Name: John

        Employee emp2 = new Employee("Jane");
        System.out.println("ID: " + emp2.getId() + ", Name: " + emp2.getName()); // Output: ID: 2, Name: Jane

    }
}
