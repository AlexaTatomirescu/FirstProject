public class OperatorsSecond {

    public static void main(String[] args) {
        double a = 12 * 3 / 4;
        double b = (12*3) / 4;
        double c = 12 * (3 / 4);
        System.out.printf("%s %s %s", a, b, c);
        System.out.println();

        double d = 12.0 / 3.0 /4.0;
        double e = (12.0 / 3.0 ) / 4.0;
        double f = 12.0 / (3.0 / 4.0);
        System.out.printf("%s %s %s %n", d, e, f);
        System.out.println();

        int x = 12 + 3 * 4;
        int y = (12 + 3) * 4;
        int z = 12 + (3  * 4);
        System.out.printf("%s %s %s %n", x, y, z);

    }
}
