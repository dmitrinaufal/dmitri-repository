import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int ID;
    String name;
    String major;
    int semester;
    int year;
    String gender;

    public Student(int ID, String name, String major, int semester, int year, String gender) {
        this.ID = ID;
        this.name = name;
        this.major = major;
        this.semester = semester;
        this.year = year;
        this.gender = gender;
    }

    public String toString() {
        return "ID: " + ID + ", Name: " + name + ", Major: " + major + ", Semester: " + semester + ", Year: " + year + ", Gender: " + gender;
    }
}

public class Assigment2_1 {
    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter ID: ");
        int ID = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Major: ");
        String major = scanner.nextLine();
        System.out.print("Enter Semester: ");
        int semester = scanner.nextInt();
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Gender: ");
        String gender = scanner.nextLine();

        Student newStudent = new Student(ID, name, major, semester, year, gender);
        students.add(newStudent);
        System.out.println("Student added successfully.");
    }

    public void updateStudent() {
        System.out.print("Enter ID of the student to update: ");
        int ID = scanner.nextInt();
        int index = findStudentIndexByID(ID);

        if (index != -1) {
            System.out.print("Enter new Name: ");
            String name = scanner.nextLine();
            students.get(index).name = name;
            System.out.println("Student information updated successfully.");
        } else {
            System.out.println("Student with ID " + ID + " not found.");
        }
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    public void displayStudentByID() {
        System.out.print("Enter ID of the student to display: ");
        int ID = scanner.nextInt();
        int index = findStudentIndexByID(ID);

        if (index != -1) {
            System.out.println(students.get(index).toString());
        } else {
            System.out.println("Student with ID " + ID + " not found.");
        }
    }

    private int findStudentIndexByID(int ID) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).ID == ID) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Assigment2_1 manager = new Assigment2_1();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student\n2. Update Student\n3. Display All Students\n4. Display Student by ID\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    manager.addStudent();
                    break;
                case 2:
                    manager.updateStudent();
                    break;
                case 3:
                    manager.displayAllStudents();
                    break;
                case 4:
                    manager.displayStudentByID();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}