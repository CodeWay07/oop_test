package lab1.task3;

public class Main {
    public static void main(String[] args){

        Student student1 = new Student();
        //student1.name = "Ion Codreanu";
        student1.media = 7.8;

        Student student2 = new Student();
        //student2.name = "Maria Olaru";
        student2.media = 8.16;

        Student student3 = new Student();
        //student3.name = "Ion Codreanu";
        student3.media = 6.75;

        Student student4 = new Student();
        //student4.name = "Vlad Mocriciuc";
        student4.media = 7.96;

        Student student5 = new Student();
        //student5.name = "Iulia Bodiul";
        student5.media = 8.54;

        Student student6 = new Student();
        //student6.name = "Valeria Onica";
        student6.media = 8.25;


        Univer univer1 = new Univer();
        univer1.name = "UTM";
           /* univer1.listOfStudents = student1.name + ", " + student2.name;
           univer1.averageMedia = (student1.media + student2.media)/2; */

        Univer univer2 = new Univer();
        univer2.name = "ULIM";
           /* univer2.listOfStudents = student3.name + ", " + student4.name;
           univer2.averageMedia = (student3.media + student4.media)/2; */

        Univer univer3 = new Univer();
        univer3.name = "USMF";
           /* univer3.listOfStudents = student5.name + ", " + student6.name;
           univer3.averageMedia = (student5.media + student6.media)/2; */


        Calculator calculator = new Calculator();
        double averageMedia1 = calculator.getAverageMedia(student1.media, student2.media);
        double averageMedia2 = calculator.getAverageMedia(student3.media, student4.media);
        double averageMedia3 = calculator.getAverageMedia(student5.media, student6.media);
        double averageUniMedia = calculator.getAverageUniMedia(averageMedia1, averageMedia2, averageMedia3);


        System.out.println ("Media studentilor UTM : " + averageMedia1 + "\n" +
                            "Media studentilor ULIM : " + averageMedia2 + "\n" +
                            "Media studentilor USMF : " + averageMedia3 + "\n" +
                            "Media pentru toate 3 universitati : "+ averageUniMedia);
    }
}