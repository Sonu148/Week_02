package Day_01.Level_2;
class StudentsReportDetails{
     private String name;
     private int rollNumber;
     private int marks;
     
     // Create a constructor.
     public StudentsReportDetails(String name, int rollNumber, int marks){
       this.name=name;
       this.rollNumber=rollNumber;
       this.marks=marks;

     }
     //Create a method for grade based on marks.  
     public void findGrade (int marks){
          if(marks>90){
            System.out.println("The grade is:\"A+\"");
          }
          else if(90>marks&& marks>80){
            System.out.println("The grade is:\"A\"");
          }
          else if(80>marks&& marks>70){
            System.out.println("The grade is:\"B+\"");
          }
          else{
            System.out.println("The grade is:\"B\"");
          }

     }
     // Method for display the grade and student details.
     public void displayStudentDetails(){
        System.out.println("The student name is: "+name);
        System.out.println("The student rollNumber is: "+rollNumber);
        System.out.println("The student marks is: "+marks);
        findGrade(marks);
     }
}
class StudentsReport{
    public static void main(String[]args){
       StudentsReportDetails student1= new StudentsReportDetails("Mohan", 13, 98);
       StudentsReportDetails student2= new StudentsReportDetails("Sohan", 20, 84);
     
       System.out.println("The details of the student1: ");
       student1.displayStudentDetails();

       System.out.println("The details of the student2: ");
       student2.displayStudentDetails();

    }

}