package Tests;

public class Testing {
    public static void main(String[] args) {
        char[] test = getAbs();
    }

    public static char[] getAbs(){
        char[] abc = new char[26];
        char letra = 'a';

        for (int i = 0; i < 26; ++i) {
            System.out.print("");
            abc[i] = letra;
            System.out.print(letra+" ");
            letra++;
        }
        return abc;
    }
}
