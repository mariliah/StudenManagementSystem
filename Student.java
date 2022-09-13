
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private static int courseCost = 600;
    private String courses = "";
    private int tuitionBalance = 0;
    private String studentStatus;
    private static int id =1000;

    //constructor: prompts user to enter student's name and year
public Student(){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter student first name: ");
    this.firstName = in.nextLine();

    System.out.print("Enter student last name: ");
    this.lastName = in.nextLine();

    System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior \nEnter student grade level: ");
    this.gradeYear = in.nextInt();

    setStudentID();
}


    //generate id: unique 5 digit
private void setStudentID(){
    // grade level + ID
    id++;
    this.studentID = gradeYear + "" + id;
}

    //enroll in courses
public void enroll(){
    // get inside of a loop, user hits 0 when they're done enrolling
do {
    System.out.print("Enter course to enroll (Q to quit): ");
    Scanner in = new Scanner(System.in);
    String course = in.nextLine();
    if (!course.equals("Q")) {
        courses = courses + "\n  " + course;
        tuitionBalance = tuitionBalance + courseCost;
    } else { break; }
} while (1 != 0);
}

    //view balance
public void viewBalance(){
    System.out.println("Your balance is: $" + tuitionBalance);
}

    //pay tuition
    public void payTuition(){
    viewBalance();
    System.out.print("Enter your payment: $");
    Scanner in = new Scanner(System.in);
    int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }



    //show status
    public String showStatus() {
    return "Name: " + firstName + " " + lastName +
            "\nGrade level: " + gradeYear +
            "\nStudent ID: " + studentID +
            "\nCourses Enrolled: " + courses +
            "\nBalance: $" + tuitionBalance;
    }
}
