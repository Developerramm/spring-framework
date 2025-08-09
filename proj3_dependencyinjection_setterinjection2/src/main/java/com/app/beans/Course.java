package com.app.beans;

// dependent class
public class Course {

    public Course(){
        System.out.println("Course.Course()");
    }

    public void startCourse() {
        System.out.println("Your course is loading....");
    }

}
