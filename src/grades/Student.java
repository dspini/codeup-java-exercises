package grades;

import java.util.ArrayList;

public class Student { //Create a class named Student.

    private final String name;//Private properties for the student's name, and grades.
    private final ArrayList<Integer> grades;
    private String date;
    private String value;

    public Student(String name){          //The grades property should be an ArrayList of integers.
        this.name = name;                 //The student class should have a constructor that sets name property,
        this.grades = new ArrayList<>();  //and initializes the grades property as an empty ArrayList.
    }
    //The Student class should have the following methods
    public String getName(){
        return this.name; // returns the student's name
    }

    public void addGrade(int grade){
        this.grades.add(grade); // adds the given grade to the grades property
    }

    public void recordAttendance(String date, String value) {
        this.date = date;
        this.value = value;
    }

    public double getGradeAverage(){
        double gradeTotal = 0;
        for (Integer grade : grades){
            gradeTotal += grade;
        }
        return gradeTotal / grades.size(); // returns the average of the students grades

    }
}
