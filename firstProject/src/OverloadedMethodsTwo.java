public class OverloadedMethodsTwo {

    public static void main(String[] args) {

        StringBuilder first = new StringBuilder("This is a String");

        int a = 12;
        int b = 34;
        int c = 56;
// Example of Unnecessary using of String.valueOf
        first.append(String.valueOf(' '));
        first.append(String.valueOf(a));
        first.append(String.valueOf(' '));
        first.append(String.valueOf(3.45));
        first.append(String.valueOf(' '));
        first.append(String.valueOf(a == 12));
        first.append(String.valueOf(' '));
        first.append(String.valueOf(b > c));
        first.append(String.valueOf(' '));
        first.append("Java is great", 8, 13);

        System.out.println(first);
    }

}
