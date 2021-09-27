package lab1.task2;

public class task2 {
    public static void main(String[] args){

        Student student1 = new Student();
           student1.name = "Ion Codreanu";
           student1.age = 21;
           student1.mark = 7.8;

        Student student2 = new Student();
           student2.name = "Vasile Lașco";
           student2.age = 20;
           student2.mark = 8.3;

        Student student3 = new Student();
           student3.name = "Marius Bolea";
           student3.age = 20;
           student3.mark = 7.2;

        Student student4 = new Student();
           student4.name = "Natalia Popa";
           student4.age = 24;
           student4.mark = 8.6;


        Univer univer1 = new Univer();
           univer1.name = "UTM";
           univer1.foundationYear = 1987;
           univer1.listOfStudents = student1.name + ", " + student2.name;

        Univer univer2 = new Univer();
           univer2.name = "USM";
           univer2.foundationYear = 1991;
           univer2.listOfStudents = student3.name + ", " + student4.name;


        System.out.println ("Students of UTM are: " + univer1.listOfStudents + "\n" +
                            "Students of ULIM are: " + univer2.listOfStudents);
    }
}

class Univer {
    String name;
    int foundationYear;
    String listOfStudents;
}

class Student {
    String name;
    int age;
    double mark;
}
