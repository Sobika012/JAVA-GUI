class Teacher {
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;

    public Teacher(int teacherId, String teacherName, String address, String workingType, String employmentStatus, int workingHours) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
        this.workingHours = workingHours;
    }

    public int getTeacherId() {
        return this.teacherId;
    }

    public String getTeacherName() {
        return this.teacherName;
    }

    public String getAddress() {
        return this.address;
    }

    public String getWorkingType() {
        return this.workingType;
    }

    public String getEmploymentStatus() {
        return this.employmentStatus;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return this.workingHours;
    }

   public void display()//Display method
   {
     System.out.println("Teacher Id: " + teacherId);
     System.out.println("Teacher Name: " + teacherName);
     System.out.println("Address: " + address);
     System.out.println("Working Type: " + workingType);
     System.out.println("Employment Status: " +employmentStatus);
     if(workingHours==-1)
     {
      System.out.println("Working Hours: " + workingHours);  
     }
     else
     {
         System.out.println("Working Hours: Not assigned");
     }
   }
       @Override
    public String toString() {
        return "Teacher id: " + this.getTeacherId() + "\n" +
                "Teacher name: " + this.getTeacherName() + "\n" +
                "Address: " + this.getAddress() + "\n" +
                "Working type: " + this.getWorkingType() + "\n" +
                "Employment status: " + this.getEmploymentStatus() + "\n" +
                "Working hours: " + this.getWorkingHours() + "\n";
    }
}

