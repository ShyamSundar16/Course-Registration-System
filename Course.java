/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistration;

/**
 *
 * @author LENOVO
 */
public class Course {

private String code;
private String name;
private String department;
private String credits;
private String faculty1;
private String faculty2;
private String faculty3;

    public Course(String code, String name, String department, String credits, String faculty1, String faculty2, String faculty3) {
        this.code = code;
        this.name = name;
        this.department = department;
        this.credits = credits;
        this.faculty1 = faculty1;
        this.faculty2 = faculty2;
        this.faculty3 = faculty3;
    }
    
     public Course(String name, String code, String department, String credits) {
        this.code = code;
        this.name = name;
        this.department = department;
        this.credits = credits;
    }

  

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getCredits() {
        return credits;
    }

    public String getFaculty1() {
        return faculty1;
    }

    public String getFaculty2() {
        return faculty2;
    }

    public String getFaculty3() {
        return faculty3;
    }

    @Override
    public String toString() {
        return "Course [ code= " + code + ", name=" + name +"] Sure?";
    }
    
   
    
}
