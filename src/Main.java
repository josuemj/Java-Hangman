import javax.swing.text.View;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        boolean playing = true;

        while(playing){
            Scanner scanner = new Scanner(System.in);
            Viewers.showOptions();
            System.out.println("Ingresa tu opcion: ");
            String option = scanner.nextLine();

            switch (option){
                case "1":
                    System.out.println("op 1");
                    System.out.print("Introduce the word: ");
                    String wordIntroduced = scanner.nextLine();
                    Controller.validChars(wordIntroduced.toLowerCase());
                    break;
                case "2":
                    System.out.println("Op 2");
                    break;
                case "3":
                    System.out.println("Op 3");
                    playing = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }

    }
}
