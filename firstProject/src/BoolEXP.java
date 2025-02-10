public class BoolEXP {
    public static void main(String[] args) {
        int apples = 6;
        int oranges = 9;
        double applePrice = 12.60;
        double orangePrice = 4.50;


        System.out.println(apples == oranges);
        System.out.println(apples != oranges);

        System.out.format ("%d > %d is %s %n", apples, oranges, apples > oranges);
        System.out.format ("%d < %d is %s %n", apples, oranges, apples < oranges);
        System.out.format ("%d >= %d is %s %n", apples, oranges, apples >= oranges);
        System.out.format ("%d <= %d is %s %n", apples, oranges, apples <= oranges);

        System.out.printf ("Reducing apple cost: %s %n", (apples > oranges) && (applePrice > orangePrice));



    }
}
