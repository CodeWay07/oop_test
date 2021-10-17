package lab3.task1;

public class Main {
    public static void main(String[] args) {

        Editor y = new Editor();

        y.text = "Attempting to develop inventions he could patent and market, " +
                "Tesla conducted a range of experiments with mechanical oscillators/generators, " +
                "electrical discharge tubes, and early X-ray imaging. He also built a " +
                "wireless-controlled boat, one of the first-ever exhibited.";

        System.out.println ( "Number of words is: "+ y.Words() );
        System.out.println ( "Number of sentences is: "+ y.Sentences() );


    }
}
