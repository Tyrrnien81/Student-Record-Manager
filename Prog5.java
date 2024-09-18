import java.util.Scanner;

/* In this program, I will show the grade and GPA by using 
 * MyStudent class. Put ID, Last name, First name, 
 * Total grade points, Total credits, then 
 * user can get results.
 * @Yeongjun Jeong
 * @2022.05.13
 */
public class Prog5 {
    public static final int UPDATE = 1;
    public static final int PRINT = 2;
    public static final int EXIT = 3;

    private static String line = "----------------------------------------";

    // Don't have any other public/private data defined in this
    // section.

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Prog5.");
        System.out.println("Press ENTER to continue...");
        in.nextLine();

        // Call createStudent, passing in the provided Scanner and
        // point myStudent at the return value:
        MyStudent myStudent = createStudent(in);

        int choice;
        do {
            printMenu();
            choice = getChoice(in);
            if (choice == UPDATE) {
                doUpdate(in,myStudent);
            }
            else if (choice == PRINT) {
                doPrint(myStudent);
            }
        } while (choice != EXIT);
        System.out.println("Done. Normal termination.");
    }

    /**
     * print different options to user
     */
    public static void printMenu() {
        System.out.println(line);
        System.out.println("Here are your options:");
        System.out.println("1. UPDATE student.");
        System.out.println("2. PRINT student.");
        System.out.println("3. EXIT");
    }

    /**
     * If user enters anything other than 1 , 2 or 3
     * It will show error and prompt for entering again
     * @param in
     * @return
     */
    public static int getChoice(Scanner in) {
        System.out.print("Enter your choice: ");
        int choice;
        do {
            choice = Integer.parseInt(in.next());
            if(choice < 1 || choice > 3) {
                System.out.println("ERROR -- Invalid choice.");
                System.out.print("Enter your choice: ");
            }
        } while(choice < 1 || choice > 3);
        return choice;
    }

    /**
     * Read student related info from user, 
     * create a MyStdent object out of it and returnthe same
     * @param in
     * @return
     */
    public static MyStudent createStudent(Scanner in) {
        System.out.println(line);

        System.out.println("CREATE a new student...");
        String first, last, ID;
        double gradePoints;
        int credits;

        System.out.print("Enter identification (ID) number: ");
        ID = in.next();

        System.out.print("Enter LAST name: ");
        last = in.next();

        System.out.print("Enter FIRST name: ");
        first = in.next();

        System.out.print("Enter total grade points: ");
        gradePoints = Double.parseDouble(in.next());

        System.out.print("Enter total credits: ");
        credits = Integer.parseInt(in.next());

        //crate objectand return
        return new MyStudent(ID,first,last,gradePoints,credits);
    }

    /**
     * It will update the existing student object 
     * by reading data from user
     * @param in
     * @param myStudent
     */
    public static void doUpdate(Scanner in, MyStudent myStudent ) {

        System.out.println(line);

        System.out.println("Enter credits: ");
        int numCredits = in.nextInt();
        System.out.println("Enter letter grade: ");
        String letterGrade = in.next();

        myStudent.takeClass(numCredits, letterGrade);
    }

    /**
     * Print student info
     * @param myStudent
     */
    public static void doPrint(MyStudent myStudent) {
        System.out.println(line);
        System.out.println("ID: " + myStudent.getID());
        System.out.println("Name: " + myStudent.getLastName() + ", " + myStudent.getFirstName());
        System.out.println("GPA: "+ ((int)(100 * myStudent.getGPA()) / 100.0));
    }
}