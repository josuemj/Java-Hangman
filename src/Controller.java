public class Controller {
    public static boolean validChars(String userString){

        int validChars = 0;
        char[] abc = getAbs();

        for(String currentWordChar: getSplitedString(userString)){
            for(char currentAbcChar: getAbs()){
                if(String.valueOf(currentAbcChar).equals(currentWordChar)){
                    System.out.println("VALID WORD CHAR: "+currentWordChar);
                    validChars++;
                }
            }
        }
        System.out.println("user input: "+userString);
        System.out.println("word length: "+userString.length());
        System.out.println("Total valid char: "+validChars);

        if(validChars==userString.length()){
            return true;
        }
        return false;
    }

    public static char[] getAbs(){
        char[] abc = new char[26];
        char letra = 'a';

        for (int i = 0; i < 26; ++i) {
            System.out.print("");
            abc[i] = letra;
            letra++;
            System.out.print(letra+" ");
        }
        return abc;
    }

    public static String[] getSplitedString(String userString){
        String[] splitedWord = userString.split("");
        return splitedWord;
    }
}
