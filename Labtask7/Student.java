package Labtask7;

class Student extends Person {

    String subject;
    int rollNo;

    Student(String name, String subject, int rollNo) {
        super(name);
        this.subject = subject;
        this.rollNo = rollNo;
    }

    @Override
    void displayRole() {
        System.out.println(name + " is a Student | Roll No: " + rollNo + " | Subject: " + subject);
    }
}