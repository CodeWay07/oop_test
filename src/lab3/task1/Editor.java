package lab3.task1;

public class Editor {
    String text;
    int count = 0;

    int Words() {
        String[] s = text.trim().split("\\s+");

        if (s.length!=0) {
            return s.length;
        }
        else return 0;
    }

    int Sentences(){
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)=='.' || text.charAt(i)=='?' || text.charAt(i)=='!') {
                count++;
            }
        }
        return count;
    }
}
