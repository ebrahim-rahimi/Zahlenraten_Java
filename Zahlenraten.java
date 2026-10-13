import java.util.Scanner;

public class Zahlenraten {

    // Java Minispiel: Zahlenraten

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int geheimZahl = (int) (Math.random() * 100) +1;
        int versuch = 0;
        int anzahl = 0;

        System.out.println("=== ZAHLENRATEN ===");
        System.out.println("Bitte geben Sie einen Zahl ein!");

        while(versuch != geheimZahl){

            versuch = scanner.nextInt();
            anzahl++;
            if (versuch < geheimZahl) {
                System.out.println("Zu klein!");
            } else if (versuch > geheimZahl) {
                System.out.println("Zu groß!");
            } else {
                System.out.println("Richtig geraten!!");
                System.out.println("Versuche: " + anzahl);
            }
            System.out.println("Versuche Nochmal!");
        }


    }
}
