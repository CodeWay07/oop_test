package lab3.task2;

public class Editor {

    int letterCounter = 0;
    int vowelCounter = 0;
    String s;

    int Letters() {
        for (int i = 0; i < s.length(); i++){
            if ( (s.charAt(i)!=' ') && (s.charAt(i)!='.') && (s.charAt(i)!=',') && (s.charAt(i)!='/') && (s.charAt(i)!='-') ){
                letterCounter++;
            }
        }
        return letterCounter;
    }

    int Vowels(){
        for (int i = 0; i < s.length(); i++){
            if ( (s.charAt(i)=='a') || (s.charAt(i)=='o') || (s.charAt(i)=='e') || (s.charAt(i)=='i') || (s.charAt(i)=='u') || (s.charAt(i)=='y') ||
                    (s.charAt(i)=='A') || (s.charAt(i)=='O') || (s.charAt(i)=='E') || (s.charAt(i)=='I') || (s.charAt(i)=='U') || (s.charAt(i)=='Y')){
                vowelCounter++;
            }
        }
        return vowelCounter;
    }

    int Consonants(){
        return letterCounter-vowelCounter;
    }
}
