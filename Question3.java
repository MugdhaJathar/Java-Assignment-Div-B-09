public class Question3{
    String sn;
    double am;
    double sm;
    private String g;

    public String getGrade() {
        return g;
    }

    public double getStudentMark() {
        return sm;
    }

    public Question3(){
        this.sn = "abc";
        this.sm = 30;
        this.am = 100;
    }

    public Question3(String studentName, double assignmentMark, double studentMark){
        this.sn = studentName;
        this.sm = studentMark;
        this.am = assignmentMark;
    }

    public void setStudentMark(double studentMark){
        if(studentMark < 0 || studentMark > this.am)
            System.out.println("Student mark should be between 0 and " + this.am);
        else
            this.sm = studentMark;
    }

    public void calculateGrade(){
        double percentage = this.sm / this.am * 100;
        
        if(percentage < 50.00)
            this.g = "Fail";
        else if(percentage >= 50.00 && percentage<= 64.00)
            this.g = "Pass";
        else if(percentage >= 65.00 && percentage<= 74.00)
            this.g = "Credit";
        else if(percentage >= 75.00 && percentage<= 84.00)
            this.g = "Distinction";
        else if(percentage >= 85)
            this.g = "High Distinction";
    }
}


