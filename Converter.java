import java.util.HashMap;
import java.util.Scanner;
import java.time.LocalTime;

public class Converter {

    public static void main(String[] args) {
        LocalTime myObj = LocalTime.now();
        HashMap<String, Double> rates = new HashMap<String, Double>();
        rates.put("GBP/EUR", 1.18);
        rates.put("GBP/USD", 1.17);
        rates.put("EUR/GBP", 0.85);
        rates.put("EUR/USD", 1.00);
        rates.put("USD/EUR", 1.00);
        rates.put("EUR/CHF", 0.96);
        rates.put("CHF/EUR", 1.04);
        System.out.println(rates +" " + "as of" + " " + myObj );
        System.out.println("Please enter the rate to check (GBP, EUR, USD, CHF)");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        System.out.println("Please enter the rate you are transferring from (GBP, EUR, USD, CHF)");
        Scanner baseCurrencyInput = new Scanner (System.in);
        String baseCurrency = baseCurrencyInput.nextLine();

        String s = userInput + ("/") + baseCurrency;
        if (rates.containsKey(s)) {
            System.out.println("Please enter the amount you would like to transfer.");
            Scanner originalInput = new Scanner(System.in);
            double originalInputValue = originalInput.nextDouble();
            double newOutputValue = Math.floor((double) originalInputValue * rates.get(s));
            System.out.println("Your converted currency is" +" "+ newOutputValue);
            System.out.println(s);
        } else {
        System.out.println("It could not be found!");
        }
        };
    }






