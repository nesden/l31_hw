import java.util.Arrays;
import java.util.Scanner;

public class ElectronicsStore {

    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
        String[] electronics = {"pc", "screen", "mouse", "keyboard"};
        System.out.println(Arrays.toString(electronics));
        int price = calc(electronics);
        System.out.println("your purchase will be: " + price);
        System.out.println("how will you pay?");
//        String paymth = "card";
//        String paymth = "cash";
        String paymth = "check";
        System.out.println(paymth);

        payment(price, paymth, null);
    }

    public static int calc(String[] purchase) {
        int result = 0;
        for (String item : purchase) {
            switch (item) {
                case "pc":
                    result += 2500;
                    break;
                case "screen":
                    result += 1200;
                case "mouse":
                    result += 250;
                    break;
                case "printer":
                    result += 500;
                    break;
                case "keyboard":
                    result += 350;
                    break;
                default:
                    System.out.println("not available in our store");
                    break;
            }

        }
        return result;
    }

    public static void payment(int cost, String paymentMethod, String isCreditCardGood) {
        boolean isGood = false;
        if (isCreditCardGood != null) {
            isGood = Boolean.parseBoolean(isCreditCardGood);
            System.out.println(isGood);
        }

        switch (paymentMethod) {
            case "cash":
                System.out.println("please give " + cost + " to the cashier");
                break;
            case "card":
                if (isGood) {
                    System.out.println(cost + " will be taken from your card");

                } else {
                    System.out.println("your card has expired");
                //burgewr
                }
                break;
            case "check":
                System.out.println("write a check for " + cost);
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
