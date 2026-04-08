package Labtask7;

class Teacher extends Person {

    String subject;

    Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    void displayRole() {
        System.out.println(name + " is a Teacher of " + subject);
    }

    void teach() {
        System.out.println(name + " is teaching " + subject);
    }
}