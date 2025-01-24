package day_05.multilevelinheritance.educationalcoursehierarchy;

public class Course {
        // Instance variables to store course name and duration
          String courseName;
          String duration;

        // Constructor to initialize the name and age attributes
        public Course(String courseName, String duration) {
            this.courseName = courseName;
            this.duration = duration;
        }
        // Method to display the course details
        public void displayInfo() {
            System.out.println("The course name is: " + courseName);
            System.out.println("The duration of course is: " + duration);
        }
    }

