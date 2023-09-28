package data_structure;

import java.util.*;//utility package for Scanner class and ArrayList
import java.io.*;//Input Output package
//importing necessary packages

class Student {
    //Data Structures to store information about student
    public String name;//storing student name
    public int id;//storing student regestration id
    public double grade;//storing grades

    //Default Constructor: intialization
    public Student(){
        name="";
        id=0;
        grade=0.0;
    }

    //Parametrized Constructor
    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    //returning the name of the student in string
    public String getName() {
        return name;
    }

    //returning the id of the student in int
    public int getId() {
        return id;
    }

    //returning grade of the student in double
    public double getGrade() {
        return grade;
    }

    public String toString() {
        return "\n\nName: " + name + "\n ID: " + id + "\n Grade: " + grade;
    }
}

public class studentRecordSystem {
    public static void main(String[] args) {
        ArrayList<Student> stList = new ArrayList<>();//To store student information
        Scanner sc = new Scanner(System.in);//Scanner class

        while (true) {
            System.out.println("\nStudent Record System Menu:");
            System.out.println("By Divyanshi Maurya.");
            System.out.println("1. Add a student record");
            System.out.println("2. Display all students records");
            System.out.println("3. Generate Report according to grades of students");
            System.out.println("4. Exit");
            System.out.print("Please enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character because skipping happens in scanner class when we work with String in scanner class

            //Switching choices
            switch (choice) {
                    //Adding information of student in records.
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter student ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter student grade(Percentage): ");
                    double grade = sc.nextDouble();

                    Student st = new Student(name, id, grade);//st is object//inheritance
                    stList.add(st);//Adding information in ArrayList
                    break;

                case 2:
                    //Listing Records
                    System.out.println("\nList of Students:");
                    for (Student s : stList) {//for each loop
                        System.out.println(s);
                    }
                    break;

                    //generating reports
                case 3:
                    while(true){
                        System.out.println("\nGenerate Report Menu:");
                        System.out.println("1. Average Grade");
                        System.out.println("2. Highest Grade");
                        System.out.println("3. Lowest Grade");
                        System.out.println("4. Exit");
                        System.out.println("Enter your report choice: ");

                        int reportChoice = sc.nextInt();

                        switch (reportChoice) {
                            case 1:
                                //finding average grade
                                double totalGrade = 0.0;
                                for (Student s : stList) {
                                    totalGrade += s.getGrade();
                                }

                                double averageGrade = totalGrade / stList.size();
                                System.out.println("Average Grade: " + averageGrade);
                                break;

                            case 2:
                                //finding maximum grade
                                double highestGrade = -1;
                                String highestName="";
                                for (Student s : stList) {
                                    if (s.getGrade() > highestGrade) {
                                        highestGrade = s.getGrade();
                                        highestName = s.getName();
                                    }
                                }
                                System.out.println("Highest Grade: " + highestGrade+" of "+highestName);
                                break;

                            case 3:
                                //finding minimum grade
                                double lowestGrade = 101;// Assuming grades are between 0 and 100
                                String lowestName="";
                                for (Student s : stList) {
                                    if (s.getGrade() < lowestGrade) {
                                        lowestGrade = s.getGrade();
                                        lowestName = s.getName();
                                    }
                                }
                                System.out.println("Lowest Grade: " + lowestGrade+" of "+lowestName);
                                break;

                            case 4:
                                System.out.println("Exiting the report.");
                                System.exit(0);
                                break;

                            default:
                                System.out.println("Invalid choice. Please try again.");
                        }
                    }
            

                    case 4:
                        System.out.println("Thanks for using this program.");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice. Please try again.");
                    }
                }
            }
        }
    
//By divyanshi Maurya
