
class Lecturer extends Teacher {
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;

    public Lecturer(int teacherId, String teacherName, String address, String workingType, String employmentStatus, String department, int yearsOfExperience, int workingHours, int gradedScore) {
        super(teacherId, teacherName, address, workingType, employmentStatus, workingHours);
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = gradedScore;
        this.hasGraded = false;
    }

    public String getDepartment() {
        return this.department;
    }

    public int getYearsOfExperience() {
        return this.yearsOfExperience;
    }

    public int getGradedScore() {
        return this.gradedScore;
    }

    public boolean getHasGraded() {
        return this.hasGraded;
    }

    public void setGradedScore(int gradedScore) {
        this.gradedScore = gradedScore;
    }

    public void gradeAssignment(int gradedScore, String department, int yearsOfExperience) {
        if (!hasGraded) {
            if (yearsOfExperience >= 5 && this.department.equals(department)) {
                if (gradedScore >= 70) {
                    System.out.println("Graded score = A");
                } else if (gradedScore >= 60) {
                    System.out.println("Graded score = B");
                } else if (gradedScore >= 50) {
                    System.out.println("Graded score = C");
                } else if (gradedScore >= 40) {
                    System.out.println("Graded score = D");
                } else {
                    System.out.println("Graded score = E");
                }
                hasGraded = true;
                System.out.println("Assignment has been graded");
            }
        } else {
            System.out.println("Lecturer has already graded the assignment.");
        }
    }
     public void display()//display method
    {
        super.display(); //displays method of Teacher class
        System.out.println("Department: " + department);
        System.out.println("Years Of Experience: " + yearsOfExperience);
        if (hasGraded)
        {
            System.out.println("Graded Score: " + gradedScore);
        }
        else
        {
            System.out.println("Score has not been graded yet.");
        }
        }
            @Override
    public String toString() {
        return super.toString() +
                "Department: " + department + "\n" +
                "Years of experience: " + yearsOfExperience + "\n" +
                (hasGraded ? "Graded score: " + gradedScore + "\n" : "Assignment not graded yet\n");
    }
}
    