package com.company;

public class School {
    private int schoolNumber;
    private String location;
    private double area;
    private Teacher[] teachers;
    private Student[] students;
    private Human director;

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setDirector(Human director) {
        this.director = director;
    }

    public void printDirectorInfo(){
        System.out.println(director.getFirstName() + " " + director.getLastName());
    }
}
