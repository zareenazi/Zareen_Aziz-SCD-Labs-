package Labtask7;

public class task7Main {
    public static void main(String[] args) {

        Teacher t = new Teacher("Mr. Seemab Shoukat", "Software Construction Development-Lab");
        t.displayRole();
        t.teach();

        Student s = new Student("Zareen", "Software Engineering", 5044);
        s.displayRole();

        HOD h = new HOD("Adil Butt", "Data Structure And Algorithm", "Computing Sciences");
        h.displayHOD();

        Person p = new Person("Maroof");
        p.displayRole();
    }
}