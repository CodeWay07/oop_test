package lab3.task3;

public class Main {
    public static void main(String[] args) {

        String a = "Attempting to develop inventions he could patent and market, " +
                "Tesla conducted a range of experiments with mechanical oscillators/generators, " +
                "electrical discharge tubes, and early X-ray imaging. He also built a wireless-controlled boat, " +
                "one of the first-ever exhibited.";

        a = a.trim();
        a = a + " ";
        int ll = 0;
        String b = "";
        String f = "";

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c != ' ') {
                b = b + c;
            }
            else {
                int lt = b.length();

                if (lt > 11) {
                    ll = lt;
                    f = b;
                }
                b = "";
            }
        }
        System.out.println("Longest word is: "+ f + " with length: "+ ll);
    }
}