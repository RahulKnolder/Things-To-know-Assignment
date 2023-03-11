package numOfStudents;

public class Student {
    private String name;
    private int id;
    private static int numOfStudents;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        numOfStudents++;
    }

    public static int getNumOfStudents() {
        return numOfStudents;
    }

    public static void main(String[] args) {
        Student s1 = new Student("John", 1001);
        Student s2 = new Student("Jane", 1002);
        Student s3 = new Student("Bob", 1003);

        int totalStudents = Student.getNumOfStudents();
        System.out.println("Total number of students enrolled: " + totalStudents);
    }
}
