package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication { //Create a class named GradesApplication with a main method.

    static Input input = new Input();

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>(); //Inside the main method, create a HashMap named students.
        //It should have keys that are strings that represent github usernames, and values that are Student objects.
        Student Mathew = new Student("| Mathew |");
        Student Mark = new Student("| Mark |");
        Student Luke = new Student("| Luke |");
        Student John = new Student("| John |");

        Mathew.addGrade(100);
        Mathew.addGrade(90);
        Mathew.addGrade(80);
        Mathew.addGrade(70);


        Mark.addGrade(95);
        Mark.addGrade(85);
        Mark.addGrade(75);
        Mark.addGrade(65);


        Luke.addGrade(80);
        Luke.addGrade(70);
        Luke.addGrade(60);
        Luke.addGrade(65);


        John.addGrade(85);
        John.addGrade(75);
        John.addGrade(65);
        John.addGrade(55);


        //Create at least 4 student objects with at least 3 grades each, and add them to the map.
        students.put("Mathew1234", Mathew);
        students.put("Mark1234", Mark);
        students.put("Luke1234", Luke);
        students.put("John1234", John);

        String prompt = "";
        do {
            System.out.println(" Welcome!");
            System.out.println("~~~~~~~~~~");
            //Create the command line interface
            System.out.println("1. View all students information: ");
            System.out.println("2. View all students names: ");
            System.out.println("3. View a student: ");
            System.out.println("4. View student attendance: ");
            System.out.println("5. Exit");

            int option = input.getInt(1, 5);

            switch (option) {
                case 1:
                    System.out.println("Here are the GitHub usernames of our students:\n");
                    printAll(students, "information");
                    break;
                case 2:
                    printAll(students, "names");
                    break;
                case 3:
                    System.out.println("Input the students GitHub Username:");
                    printOne(students, input.getString());
                    break;
                case 4:
                    System.out.println("Attendance");
                case 5:
                    System.out.println("Goodbye, and have a wonderful day!");
                    System.exit(0);
                    break;
            }
            System.out.println("Would you like to continue? y or n");
        } while (input.yesNo());
    }

    public static void printAll(HashMap<String, Student> students, String option) {

        for (String key : students.keySet()) {

        Student curStudent = students.get(key);

        if (option.equals("information")) {
        System.out.println("Student Name: " + curStudent.getName() + " - Github Username: " + key + "\n"
                            + "Current Grade Average: " + curStudent.getGradeAverage() + "\n");
        } else if (option.equals("names")) {
        System.out.print(" " + curStudent.getName() + " ");
        }
    }
    System.out.println();
}

    public static void printOne(HashMap<String, Student> students, String username) {
        Student one = students.get(username);

    System.out.println("Student Name: " + one.getName() + " - Github Username: " + username + "\n"
                        + "Current Average: " + one.getGradeAverage() + "\n");

    }

}

