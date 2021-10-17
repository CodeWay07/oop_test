package lab3.task2;

public class Main {
    public static void main(String[] args){

        Editor text = new Editor();

        text.s = "Attempting to develop inventions he could patent and market, " +
                "Tesla conducted a range of experiments with mechanical oscillators/generators, " +
                "electrical discharge tubes, and early X-ray imaging. He also built a " +
                "wireless-controlled boat, one of the first-ever exhibited.";

        System.out.println("The number of letters is: "+ text.Letters());
        System.out.println("The number of vowels is: "+ text.Vowels());
        System.out.println("The number of consonants is: "+ text.Consonants());
    }
}



