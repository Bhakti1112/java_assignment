import java.util.Scanner;

public class StudentRecordMGMT {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        StudentRecordSystem system = new StudentRecordSystem();

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Get Student by ID");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter ID:");
                    int id = sc.nextInt();
                    System.out.println("Enter Name:");
                    String name = sc.nextLine();
                    System.out.println("Enter Age:");
                    int age = sc.nextInt();
                    System.out.println("Enter Department :");
                    String department = sc.nextLine();
                    Student s1 = new Student(id, name, age, department);
                    system.addStudent(s1);
                    break;

                case 2:
                    system.displayAllStudents();
                    break;
                case 3:
                    System.out.println("Enter id");
                    int stdid = sc.nextInt();
                    Student retriveid = system.getStudent(stdid);
                    if (retriveid != null) {
                        System.out.println(retriveid.toString());
                    } else {
                        System.out.println("Not found");
                    }
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Try again!");

                    sc.close();
            }
        }

    }

}
