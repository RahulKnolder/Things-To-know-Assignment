package assign_Uique_Id_to_To_Emploee;

public class Employee {
    private static int nextId = 1;
    private int id;
    private String name;

    public Employee(String name) {
        this.name = name;
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
