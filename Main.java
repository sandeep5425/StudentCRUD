import java.util.Scanner;

class Student {
    String name;
    int mark1;
    int mark2;
    int mark3;

    Student(String name, int mark1, int mark2, int mark3) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
}

public class Main {
    static Student[] students;
    static int i = 0;
    static Scanner sc = new Scanner(System.in);

    static int getChoice() {
        System.out.println(
                "Enter your choice\n1.Add\n2.Remove\n3.Update\n4.Delete\n5.List\n6.Enter your option (Greater than 6 for exit)");
        return sc.nextInt();
    }

    static Student addStudent() {
        System.out.println("Enter Student details");
        System.out.println("Name");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Marks1");
        int mark1 = sc.nextInt();
        System.out.println("Marks2");
        int mark2 = sc.nextInt();
        System.out.println("Marks3");
        int mark3 = sc.nextInt();
        return new Student(name, mark1, mark2, mark3);
    }

    static void removeStudent(int id) {
        students[id] = null;
    }

    static void list() {
        for (Student s : students) {
            if (s != null)
                System.out.println(s.name + "  " + s.mark1 + "  " + s.mark2 + "  " + s.mark3);
        }
    }

    static Student updateStudent(int id) {
        Student updatedStudent = addStudent();
        students[id] = updatedStudent;
        return updatedStudent;
    }

    public static void main(String[] args) {
        System.out.println("Enter no. of Students");
        int N = sc.nextInt();
        int choice, id;
        students = new Student[N];
        do {
            choice = getChoice();
            switch (choice) {
                case 1:
                    if (i >= N) {
                        System.out.println("Capacity Full");
                        break;
                    }
                    students[i++] = addStudent();
                    System.out.println("Student added sucessfully");
                    break;
                case 2:
                case 4:
                    if (i == 0) {
                        System.out.println("No students present");
                        break;
                    }
                    System.out.println("Enter the id of student to delete/remove");
                    id = sc.nextInt();
                    if (id >= N) {
                        System.out.println("Invalid Id");
                        break;
                    }
                    removeStudent(id);
                    System.out.println("Student remove sucessfully");

                    break;
                case 3:
                    id = sc.nextInt();
                    if (id < 0) {
                        System.out.println("No students present");
                        break;
                    }
                    if (id >= N) {
                        System.out.println("Invalid student id");
                        break;
                    }
                    updateStudent(id);
                    System.out.println("Student updated sucessfully");
                    break;
                case 5:
                    System.out.println("List of students");
                    list();
                    break;
                default:
                    System.out.println("Program terminated Sucessfully");
                    break;
            }
            System.out.println("\n\n\n-------------------------------------------------\n\n\n");

        } while (choice < 6);
    }
}
