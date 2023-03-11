package numOfStudents;

import java.util.Scanner;

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
          int count=1;
        Scanner read = new Scanner(System.in);
        System.out.println(count+" enter the name and id");

        Student student1 = new Student(read.nextLine(), read.nextInt());

        count++;
        System.out.println(count+" enter the name and id");
        read.nextLine();
        Student student2 = new Student(read.nextLine(), read.nextInt());

        count++;
        System.out.println(count+" enter the name and id");
        read.nextLine();
        Student student3 = new Student(read.nextLine(), read.nextInt());

        int totalStudents = Student.getNumOfStudents();
        System.out.println("Total number of students enrolled: " + totalStudents);
    }
}
