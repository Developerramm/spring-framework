package com.app.beans;

// target class
public class Student {

    private String name;
    private String username;
    private String email;

    private Course course;

    public Student() {
        System.out.println("Student.Student()");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void startMyCourse() {
        System.out.println("Student.startMyCourse()");
        course.startCourse();
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", username=" + username + ", email=" + email + ", course=" + course + "]";
    }

}
