import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        //scanner voor gebruikers invoer
        Scanner userInput = new Scanner(System.in);

        //String-Array met valuta benamingen + een double-Array met conversie ratios
                String[] currencies = {"Euro", "US Dollar", "GB Pond", "Bitcoin", "Ethereum", "Solana"};
                double[][] conversionRates = {
                {0.85, 0.86, 0.000025, 0.035, 15.88}, // EUR
                {0.85, 0.73, 0.000021, 0.03, 13.5}, // USD
                {0.86, 1.37, 0.000032, 0.044, 20.76}, // GBP
                {54000, 62000, 31000, 22, 1050000}, // BTC
                {3500, 4000, 3000, 0.05, 500}, // ETH
                {35, 40, 30, 0.000037, 0.2} // SOL
        };

            //vraag : Welke valuta wilt u omrekenen ?

            System.out.println("Welke valuta wilt u omrekenen ?");

            //begin van buitenste loop

        while (true) {


                //for loop om een valuta te selecteren
                for (int i = 0; i < currencies.length; i++) {
                System.out.println((i + 1) + ". " + currencies[i]);
                }

                //Scanner labelen met int variable om een waarde aan te kunnen koppelen
                int userChoice;
                userChoice = userInput.nextInt();

                //interne loop voor ongeldige invoer
                if (userChoice < 1 || userChoice > currencies.length) + (InputMismatchException) {
                System.out.println("Geen geldige invoer. Selecteer aub een valuta (1-6)..");
                userInput.next();
                continue;
         }




                    //vraag : Wat is het bedrag ?;


   }
}
