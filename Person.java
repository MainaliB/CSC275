/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class Person {
    private String FirstName;
    private String LastName;
    private int UIN;
    
    public Person(){
    
    }
    
    public Person( String FirstName, String LastName, int UIN){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.UIN = UIN;
    }
    
    public String getFirstName(){
        return FirstName;
    }
    
    public void setFirstName(String word){
        FirstName = word;
    }
    
    
    public String getLastName(){
        return LastName;
    }
    
    public void setLastName(String word){
        LastName = word;
    }
    public int getUIN(){
        return UIN;
    }
    
    public void setUIN(int number){
        UIN = number;
    }
    public String toString(){
        return FirstName + " "+LastName + " " + UIN ;
        
    }
}
//Staff subclass
class Staff extends Person{
    private String Department;
    private String Title;
    
    
    public Staff(String FirstName, String LastName, int UIN, String Department, String Title){
        super(FirstName, LastName, UIN);
        this.Department = Department;
        this.Title = Title;
        
    }
    
    public String getDepartment(){
        return Department;
    }
    
    public void setDepartment(String word){
        Department = word;
    }
    
    public String getTitle(){
        return Title;
    }
    
    public void setTitle(String word){
        Title = word;
    }
    
    
    public String toString(){
        return getFirstName() + " "+getLastName()+" "+ Department + " "+ Title + " " + getUIN();
        
    }
}

//Faculty subclass
class Faculty extends Person{
    private String Department;
    
    
    public Faculty(String FirstName, String LastName, int UIN, String Department ){
        super(FirstName, LastName, UIN);
        this.Department = Department;
        
    }
    
    public String getDepartment(){
        return Department;
    }
    
    public void setDepartment(String word){
        Department = word;
    }
    
    
    public String toString(){
        return getFirstName() + " "+getLastName()+" "+ Department + " "+ getUIN();
        
    }
}


//Student subclass 
class Student extends Person{
    private String Major;
    private String Minor;
    private double Gpa;
    
    
    public Student(String FirstName, String LastName, int UIN, String Major,
            String Minor, double Gpa){
        super(FirstName, LastName, UIN);
        
        this.Major = Major;
        this.Minor = Minor;
        this.Gpa = Gpa;
        
    }
    
    public String getMajor(){
        return Major;
    }
    
    public void setMajor(String word){
        Major = word;
    }
    
    public String getMinor(){
        return Minor;
    }
    
    public void setMinor(String word){
        Minor = word;
    }
    
    public double getGpa(){
        return Gpa;
    }
    
    public void setGpa(double number){
        Gpa = number;
    }
    
    
    
    public String toString(){
        return getFirstName() + " "+ getLastName() +" " + Major + " "+ Minor +" "+
                getUIN() + " "+ Gpa;
    }
}

//UndergraduateStudent subclass of Student

class UndergraduateStudent extends Student{
    
    public UndergraduateStudent(String FirstName, String LastName, int UIN, String Major,
            String Minor, double Gpa){
        super(FirstName, LastName, UIN, Major, Minor, Gpa);
    }
    
    public double calculateFinalGrade(double grade1, double grade2, double grade3){
        return (0.33 * grade1 + 0.33 * grade2 + 0.33*grade3);
    }
    
    public String toString(){
        return "FirstName:  "+getFirstName() + "\n LastName: "+ getLastName() + "\n Major: "+ getMajor() + "\n Minor: " + getMinor() 
                + "\n UIN: " + getUIN()
                + "\n GPA: " + getGpa();
    }
}

class GraduateStudent extends Student{
    public GraduateStudent(String FirstName, String LastName, int UIN, String Major,
            String Minor, double Gpa){
        super(FirstName, LastName, UIN, Major, Minor, Gpa);
    }
    
    public double calculateFinalGrade(double grade1, double grade2, double grade3){
        return (0.25 * grade1 + 0.25 * grade2 + 0.5*grade3);
    }
    
    public String toString(){
        return "FirstName:  "+getFirstName() + "\n LastName: "+ getLastName() + "\n Major: "+ getMajor() + "\n Minor: " + getMinor() 
                + "\n UIN: " + getUIN()
                + "\n GPA: " + getGpa();
    }
}