public class StAppendDelChaining {

    public static void main (String[] args) {

        StringBuilder first = new StringBuilder("This is a String");
        StringBuilder second = new StringBuilder("This is a String");

        System.out.printf("first: %s %n", first);

        System.out.println("clearing first");
//        first.delete(0, first.length());
//        System.out.printf("first: *%s* %n", first);
//
//        first.append("Another String");
        first.delete(0, first.length());
        first.append("Another String");
        first.delete(0, first.length()).append("Another String").append(" ").append(second);
        System.out.printf("first: *%s* %n", first);

    }
}
