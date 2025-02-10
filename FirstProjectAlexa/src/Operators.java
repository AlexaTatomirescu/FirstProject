public class Operators {

    public static void main(String[] args) {

//        int answer = (7 + 3) *4;
//        System.out.println(answer);
//
//        double radius = 12.0;
//        double area =  Math.PI * radius * radius;

        int x = 3;
//        int y = x++;
        int y = x;
        x++;
        System.out.printf("Using x++, x is %s and y is %s.%n" , x, y);
        // Using x++, x is 4 and y is 3.

         x = 3;
         y = ++x;
        System.out.printf("Using ++x, x is %s and y is %s.%n" , x, y);
        // Using ++x, x is 4 and y is 4.

        System.out.println("Don't do this!");
        x = 3;
        y = ++x - x++;
        System.out.printf("++x - x++ gives: x is %s and y is %s.%n" , x, y);
        // ++x - x++ gives: x is 5 and y is 0

        x = 3;
        y = x++ - ++x;
        System.out.printf("x++ - ++x gives: x is %s and y is %s.%n" , x, y);
        // x++ - ++x gives: x is 5 and y is -2
    }
}
