public class Question3Test {
public static void  main(String[] args){
    Question3 assignment1 = new Question3("abc",20,15);
    assignment1.calculateGrade();
    System.out.println("Assignment 1 results : \nStudent Mark : " + assignment1.getStudentMark() + "\nGrade : " + assignment1.getGrade());
}
}