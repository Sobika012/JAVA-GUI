class Tutor extends Teacher {
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;

    public Tutor(int teacherId, String teacherName, String address, String workingType, String employmentStatus, int workingHours, double salary, String specialization, String academicQualifications, int performanceIndex) {
        super(teacherId, teacherName, address, workingType, employmentStatus, workingHours);
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
    }
    public double getSalary()
    {
        return salary;
    }
    public int getIndex() {
        return this.performanceIndex;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public String getAcademicQualifications() {
        return this.academicQualifications;
    }

    public int getPerformanceIndex() {
        return this.performanceIndex;
    }

    public boolean getIsCertified() {
        return this.isCertified;
    }

    public void setSalary(double newSalary, int newPerformanceIndex) {
        if (newPerformanceIndex > 5 && getWorkingHours() > 20) {
            double appraisal = 0.0;
            if (newPerformanceIndex >= 5 && newPerformanceIndex <= 7) {
                appraisal = 0.05;
            } else if (newPerformanceIndex >= 8 && newPerformanceIndex <= 9) {
                appraisal = 0.1;
            } else if (newPerformanceIndex == 10) {
                appraisal = 0.2;
            }
            this.salary = newSalary + (appraisal * newSalary);
            this.isCertified = true;
        } else {
            System.out.println("Salary can't be approved since the tutor has not been certified yet");
        }
    }

    public void removeTutor() {
        if (!isCertified) {
            this.salary = 0;
            this.specialization = "";
            this.academicQualifications = "";
            this.performanceIndex = 0;
            this.isCertified = false;
        }
    }

    public void display()//display method
    {
        if(isCertified)
        {
            super.display();
        }
        else{
            super.display();
            System.out.println("Salary:" + salary);
            System.out.println("Specialization:" + specialization);
            System.out.println("Academic Qualifications:"+ academicQualifications);
            System.out.println("Performance Index:"+ performanceIndex);
        }
    }

 @Override
    public String toString() {
        return super.toString() +
                (isCertified ? "Salary: " + salary + "\n" : "Salary not set yet\n") +
                "Specialization: " + specialization + "\n" +
                "Academic qualifications: " + academicQualifications + "\n" +
                "Performance index: " + performanceIndex + "\n";
    }
}