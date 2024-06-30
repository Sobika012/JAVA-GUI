import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Label;

public class TeacherGUI extends JFrame{
    private ArrayList<Teacher> teachers = new ArrayList<>();

    private JTextField teacherIdField, teacherNameField, addressField, workingTypeField, employmentStatusField,
    workingHoursField, departmentField, yearsOfExperienceField, gradedScoreField, salaryField,
    specializationField, academicQualificationsField, performanceIndexField;

    public static void main(String[] args) {
        TeacherGUI teacherGui = new TeacherGUI(); // Create an instance of TeacherGui
        teacherGui.createAndShowGUI();
    }

    public void createAndShowGUI() {
        teachers = new ArrayList<>();
       
        JFrame frame = new JFrame("Teacher Management System");
        frame.setSize(1500, 1000);
        frame.setLayout(null);

        JLabel L23 = new JLabel("Teacher Management System");
        L23.setBounds(500, 10, 250, 30);
        frame.add(L23);

        JPanel mainPanel = new JPanel();
        mainPanel.setBounds(0, 120, 1500, 950);
        mainPanel.setLayout(new CardLayout());

        JPanel lecturerPanel = createLecturerPanel();
        JPanel tutorPanel = createTutorPanel();

        mainPanel.add(lecturerPanel, "Lecturer");
        mainPanel.add(tutorPanel, "Tutor");

        frame.add(mainPanel);

        JButton lecturerButton = new JButton("Lecturer");
        lecturerButton.setBounds(350, 60, 120, 30);
        frame.add(lecturerButton);

        JButton tutorButton = new JButton("Tutor");
        tutorButton.setBounds(750, 60, 120, 30);
        frame.add(tutorButton);

        CardLayout cardLayout = (CardLayout) mainPanel.getLayout();

        lecturerButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    cardLayout.show(mainPanel, "Lecturer");
                }
            });

        tutorButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    cardLayout.show(mainPanel, "Tutor");
                }
            });

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JPanel createLecturerPanel() {
        JPanel panel1 = new JPanel();
        Color lighterblue = Color.decode("#AEC6CF");
        panel1.setBackground(lighterblue);
        panel1.setLayout(null);

        JLabel L24= new JLabel("Lecturer Section");
        L24.setBounds(550,10,220,30);//(x-axis,y-axis,length,breadth)
        //(Right,down,length,breadth)
        panel1.add(L24);  

        JLabel L1= new JLabel("Teacher ID");
        L1.setBounds(50,100,120,30);//(x-axis,y-axis,length,breadth)
        //(Right,down,length,breadth)
        panel1.add(L1);  
        JTextField teacherIdField = new JTextField();
        teacherIdField.setBounds(150,100,140,30);
        panel1.add(teacherIdField);  

        JLabel L2= new JLabel("Teacher Name");
        L2.setBounds(50,150,120,30);//(x-axis,y-axis,length,breadth)
        //(Right,down,length,breadth)
        panel1.add(L2);  

        JTextField teacherNameField = new JTextField();
        teacherNameField.setBounds(170,150,140,30);
        panel1.add(teacherNameField);  

        JLabel L3= new JLabel("Address");
        L3.setBounds(50,200,120,30);//(x-axis,y-axis,length,breadth)
        //(Right,down,length,breadth)
        panel1.add(L3);  

        JTextField addressField= new JTextField();
        addressField.setBounds(150,200,140,30);
        panel1.add(addressField);  

        JLabel L4= new JLabel("Working hours");
        L4.setBounds(50,250,120,30);//(x-axis,y-axis,length,breadth)
        //(Right,down,length,breadth)
        panel1.add(L4);  

        JTextField workingHoursField = new JTextField();
        workingHoursField.setBounds(160,250,150,30);
        panel1.add(workingHoursField);  

        JLabel L5= new JLabel("Employment Status");
        L5.setBounds(50,300,140,30);//(x-axis,y-axis,length,breadth)
        //(Right,down,length,breadth)

        panel1.add(L5);  
        JTextField employmentStatusField = new JTextField();
        employmentStatusField.setBounds(200,300,150,30);
        panel1.add(employmentStatusField);

        JLabel L6= new JLabel("Working Type");
        L6.setBounds(50,350,140,30);//(x-axis,y-axis,length,breadth)
        //(right,down,length,breadth)
        panel1.add(L6);  

        JTextField workingTypeField= new JTextField();
        workingTypeField.setBounds(150,350,150,30);
        panel1.add(workingTypeField);  

        JLabel L7= new JLabel("Department");
        L7.setBounds(50,400,125,30);//(x-axis,y-axis,length,breadth)
        //(Right,down,length,breadth)
        panel1.add(L7);  

        JTextField departmentField= new JTextField();
        departmentField.setBounds(150,400,150,30);
        panel1.add(departmentField);

        JLabel L8= new JLabel("Years Of Experience");
        L8.setBounds(50,450,150,30);//(x-axis,y-axis,length,breadth)
        //(Right,down,length,breadth)
        panel1.add(L8);  

        JTextField yearsOfExperienceField= new JTextField();
        yearsOfExperienceField.setBounds(200,450,150,30);
        panel1.add(yearsOfExperienceField);

        JLabel l9 = new JLabel(" Graded Score");
        l9.setBounds(50,500,175,30);
        panel1.add(l9);

        JTextField gradedScoreField = new JTextField();
        gradedScoreField.setBounds(200,500,150,30);
        panel1.add(gradedScoreField);

        JButton b1= new JButton("Add a lecturer");
        b1.setBounds(600,250,150,30);
        panel1.add(b1);
     
        b1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
        try {
                        int TeacherId = Integer.parseInt(teacherIdField.getText());
                        String TeacherName = teacherNameField.getText();
                        String Address = addressField.getText();
                        String WorkingType = workingTypeField.getText();
                        String EmploymentStatus = employmentStatusField.getText();
                        int WorkingHours = Integer.parseInt(workingHoursField.getText());
                        String Department = departmentField.getText();
                        int YearsOfExperience = Integer.parseInt(yearsOfExperienceField.getText());
                        int GradedScore = Integer.parseInt(gradedScoreField.getText());
                        Lecturer lecture = new Lecturer(TeacherId, TeacherName, Address, WorkingType, EmploymentStatus, Department, YearsOfExperience, WorkingHours, GradedScore);
                        teachers.add(lecture);

                        

                        JOptionPane.showMessageDialog(null, "Lecturer added successfully!");
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Invalid input! Please enter valid numbers.");
                    } 
    }
});




JButton displayButton = new JButton("Display");
displayButton.setBounds(600, 300, 250, 30);
panel1.add(displayButton);
displayButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        

                    JTextArea textArea = new JTextArea();
                    textArea.setEditable(false);
                    JScrollPane scrollPane = new JScrollPane(textArea);
                    scrollPane.setPreferredSize(new Dimension(400, 300));

                    for (Teacher teacher : teachers) {
                        textArea.append(teacher.toString() + "\n");
                    }

                    JOptionPane.showMessageDialog(null, scrollPane, "Teacher Details", JOptionPane.PLAIN_MESSAGE);
                
        }
    });






        JButton b3= new JButton("Grade Assignment");
        b3.setBounds(600,350,350,30);
        panel1.add(b3);
        b3.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
    try {
                        int teacherId = Integer.parseInt(teacherIdField.getText());
                        int gradedScore = Integer.parseInt(gradedScoreField.getText());
                        String department = departmentField.getText();
                        int yearsOfExperience = Integer.parseInt(yearsOfExperienceField.getText());

                        for (Teacher teacher : teachers) {
                            if (teacher.getTeacherId() == teacherId && teacher instanceof Lecturer) {
                                ((Lecturer) teacher).gradeAssignment(gradedScore, department, yearsOfExperience);
                                JOptionPane.showMessageDialog(null, teacher.toString(), "Assignment Grading Result", JOptionPane.INFORMATION_MESSAGE);
                                System.out.println("Assignment has been graded successfullty");
                                System.out.println("The teacher id is : " + teacherId +"\n" + "The grade score is : " + gradedScore + "\n" + "The department is : " +department +"\n" );
                                return;
                                
                            }
                        }
                        JOptionPane.showMessageDialog(null, "No lecturer found with the provided ID!");
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Invalid input! Please enter valid numbers.");
                    }    
    }
});

        JButton b4= new JButton("Clear");
        b4.setBounds(600,400,100,30);
        panel1.add(b4);
        b4.addActionListener(new ActionListener()
{
  public void actionPerformed(ActionEvent e) {
    teacherIdField.setText("");
        teacherNameField.setText("");
                    addressField.setText("");
                    workingTypeField.setText("");
                    employmentStatusField.setText("");
                    workingHoursField.setText("");
                    departmentField.setText("");
                    yearsOfExperienceField.setText("");
                    gradedScoreField.setText("");

            }
            });
 

        return panel1;
    }

    private JPanel createTutorPanel() {
        JPanel panel2 = new JPanel();
        Color purple = Color.decode("#C8A2C8");
        panel2.setBackground(purple);
        panel2.setLayout(null);
        // Add components specific to lecturer

        JLabel L25= new JLabel("Tutor section");
        L25.setBounds(550,10,220,30);//(x-axis,gy-axis,length,breadth)
        //(Right,down,length,breadth)
        panel2.add(L25);

        JLabel L9= new JLabel("Teacher ID");
        L9.setBounds(50,100,100,30);//(x-axis,y-axis,length,breadth)
        //(Right,down,length,breadth)
        panel2.add(L9);  

        JTextField teacherIdField = new JTextField();
        teacherIdField.setBounds(120,100,140,30);
        panel2.add(teacherIdField);  

        JLabel l10= new JLabel("Teacher Name");
        l10.setBounds(50,150,100,30);//(x-axis,y-axis,length,breadth)
        //(Right,down,length,breadth)
        panel2.add(l10);  

        JTextField teacherNameField = new JTextField();
        teacherNameField.setBounds(140,150,140,30);
        panel2.add(teacherNameField);  

        JLabel L11= new JLabel("Address");
        L11.setBounds(50,200,100,30);//(x-axis,y-axis,length,breadth)
        //(Right,down,length,breadth)
        panel2.add(L11);  

        JTextField addressField= new JTextField();
        addressField.setBounds(120,200,140,30);
        panel2.add(addressField);  

        JLabel L12= new JLabel("Working Type");
        L12.setBounds(50,250,100,30);//(x-axis,y-axis,length,breadth)
        //(Right,down,length,breadth)
        panel2.add(L12);  

        JTextField workingTypeField= new JTextField();
        workingTypeField.setBounds(140,250,140,30);
        panel2.add(workingTypeField);  

        JLabel L13= new JLabel("Employment Status");
        L13.setBounds(50,300,150,30);//(x-axis,y-axis,length,breadth)
        //(Right,down,length,breadth)
        panel2.add(L13);  

        JTextField employmentStatusField = new JTextField();
        employmentStatusField.setBounds(200,300,140,30);
        panel2.add(employmentStatusField);

        JLabel L14= new JLabel("Working Hours");
        L14.setBounds(50,350,100,30);//(x-axis,y-axis,length,breadth)
        //(Right,down,length,breadth)
        panel2.add(L14);  

        JTextField workingHoursField= new JTextField();
        workingHoursField.setBounds(140,350,140,30);
        panel2.add(workingHoursField);  

        JLabel L15= new JLabel("Salary");
        L15.setBounds(50,400,100,30);//(x-axis,y-axis,length,breadth)
        //(Right,down,length,breadth)
        panel2.add(L15);  

        JTextField salaryField = new JTextField();
        salaryField.setBounds(120,400,140,30);
        panel2.add(salaryField);

        JLabel L16= new JLabel("Specialization");
        L16.setBounds(50,450,100,30);//(x-axis,y-axis,length,breadth)
        //(Right,down,length,breadth)
        panel2.add(L16);  

        JTextField specializationField = new JTextField();
        specializationField.setBounds(160,450,140,30);
        panel2.add(specializationField);

        JLabel L17= new JLabel("Academic Qualification");
        L17.setBounds(550,100,150,30);//(x-axis,y-axis,length,breadth)
        //(Right,down,length,breadth)
        panel2.add(L17);  

        JTextField academicQualificationsField= new JTextField();
        academicQualificationsField.setBounds(700,100,150,30);
        panel2.add(academicQualificationsField);

        JLabel L18= new JLabel("Performance Index");
        L18.setBounds(550,150,170,30);//(x-axis,y-axis,length,breadth)
        //(Right,down,length,breadth)
        panel2.add(L18);  

        JTextField performanceIndexField= new JTextField();
        performanceIndexField.setBounds(700,150,140,30);
        panel2.add(performanceIndexField);
       
         JLabel L26= new JLabel(" new Performance Index");
        L26.setBounds(550,200,170,30);//(x-axis,y-axis,length,breadth)
        //(Right,down,length,breadth)
        panel2.add(L26);
         
        JTextField newperformanceIndexField= new JTextField();
        newperformanceIndexField.setBounds(700,200,140,30);
        panel2.add(newperformanceIndexField);
       
        JLabel L27= new JLabel(" new Salary");
        L27.setBounds(550,230,170,30);//(x-axis,y-axis,length,breadth)
        //(Right,down,length,breadth)
        panel2.add(L27);
         
        JTextField newSalaryField= new JTextField();
        newSalaryField.setBounds(700,230,140,30);
        panel2.add(newSalaryField);
       
        JButton b6= new JButton("Add tutor");
        b6.setBounds(600,300,200,30);

        panel2.add(b6);
        b6.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
        try {
            int TeacherId = Integer.parseInt(teacherIdField.getText());
            String TeacherName = teacherNameField.getText();
            String Address = addressField.getText();
            String WorkingType = workingTypeField.getText();
            String EmploymentStatus = employmentStatusField.getText();
            int WorkingHours = Integer.parseInt(workingHoursField.getText());
            double Salary = Double.parseDouble(salaryField.getText());
            String Specialization = specializationField.getText();
            String AcademicQualifications = academicQualificationsField.getText();
            int PerformanceIndex = Integer.parseInt(performanceIndexField.getText());

            Tutor tutor = new Tutor(TeacherId, TeacherName, Address, WorkingType, EmploymentStatus, WorkingHours, Salary, Specialization, AcademicQualifications, PerformanceIndex);
            teachers.add(tutor);
            System.out.println("Tutor added successfully.");
            JOptionPane.showMessageDialog(null, "Tutor added successfully.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input, try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
});


        JButton b5= new JButton("Remove Tutor");
        b5.setBounds(600,350,250,30);
        panel2.add(b5);
        b5.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae) {
                    try {
                        int TeacherId = Integer.parseInt(teacherIdField.getText());

                        // Logic to find and remove tutor using teacherId
                        for (Teacher teacher : teachers) {
                            if (teacher instanceof Tutor && teacher.getTeacherId() == TeacherId) {
                                teachers.remove(teacher);
                                JOptionPane.showMessageDialog(null, "Tutor removed successfully.");
                                System.out.println("Tutor removed successfully.");
                                return;
                            }
                        }

                        JOptionPane.showMessageDialog(null, "Invalid teacher ID. Please check the input and try again.", "Error", JOptionPane.ERROR_MESSAGE);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please check the fields and try again.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

        JButton b7= new JButton("Clear");
        b7.setBounds(600,400,250,30);
        panel2.add(b7);
        b7.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e) {
                    teacherIdField.setText("");
                    teacherNameField.setText("");
                    addressField.setText("");
                    workingTypeField.setText("");
                    employmentStatusField.setText("");
                    workingHoursField.setText("");
                    salaryField.setText("");
                    specializationField.setText("");
                    academicQualificationsField.setText("");
                    performanceIndexField.setText("");
                }
            });
       

 // Inside your ActionListener for setting salary in TeacherGUI
JButton b8 = new JButton("Set Salary");
b8.setBounds(600, 450, 250, 30);
panel2.add(b8);

 b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            try {
                        int teacherId = Integer.parseInt(teacherIdField.getText());
                        double salary = Double.parseDouble(salaryField.getText());
                        int performanceIndex = Integer.parseInt(performanceIndexField.getText());

                        for (Teacher teacher : teachers) {
                            if (teacher.getTeacherId() == teacherId && teacher instanceof Tutor) {
                                ((Tutor) teacher).setSalary(salary, performanceIndex);
                                JOptionPane.showMessageDialog(null,teacher.toString(),"Tutor Salary Updated", JOptionPane.INFORMATION_MESSAGE);
                                return;
                            }
                        }
                        JOptionPane.showMessageDialog(null, "No tutor found with the provided ID!");
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Invalid input! Please enter valid numbers.");
                    }    
            }
        });
     

       






       
JButton displayButton = new JButton("Display");
displayButton.setBounds(600, 500, 250, 30);
panel2.add(displayButton);
displayButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
      
                    JTextArea textArea = new JTextArea();
                    textArea.setEditable(false);
                    JScrollPane scrollPane = new JScrollPane(textArea);
                    scrollPane.setPreferredSize(new Dimension(400, 300));

                    for (Teacher teacher : teachers) {
                        textArea.append(teacher.toString() + "\n");
                    }

                    JOptionPane.showMessageDialog(null, scrollPane, "Teacher Details", JOptionPane.PLAIN_MESSAGE); 
        }
        
    });

       
        return panel2;
    }
   
}