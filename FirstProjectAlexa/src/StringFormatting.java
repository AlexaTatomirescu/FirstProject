import java.text.NumberFormat;

public class StringFormatting {

    public static void main (String[] args) {

//        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
//        currencyFormat.setMinimumFractionDigits(3);
//
//        String apples = "Apples";
//        int appleQuantity = 8;
//        int applePrice = 100;
//        String oranges = "Oranges";
//        int orangeQuantity = 12;
//        int orangePrice = 80;
//
//        String column1Heading = "Fruit";
//        String column2Heading = "Quantity";
//        String column3Heading = "Prince";
//
//        System.out.printf("%-12s %8s %6s%n", column1Heading, column2Heading, coulmn3Heading);
////        System.out.printf("%-12s %-8d %6d cents %n", apples, appleQuantity, applePrice); PRIMA METODA DE PRINTARE
////        System.out.printf("%-12s %-8d %6d cents %n", oranges, orangeQuantity, orangePrice); PRIMA METODA DE PRINTARE
//        System.out.printf("%-12s %-8d %6s%n", apples, appleQuantity,
//                currencyFormat.format((applePrice) / 100.0));
//        System.out.printf("%-12s %-8d %6s%n", oranges, orangeQuantity,
//                currencyFormat.format((orangePrice) / 100.0));

        System.out.printf("PI is %f %n", Math.PI);
        System.out.printf("PI is %.3f %n", Math.PI);
        System.out.printf("PI is %.0f %n", Math.PI);
        System.out.printf("PI is %.12f %n", Math.PI);
        System.out.printf("PI is %.99f %n", Math.PI);
    }
}
