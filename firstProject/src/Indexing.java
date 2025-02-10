public class Indexing {

    public static void main(String[] args) {
        //                             1         2         3
        //                   0123456789012345678901234567890123456
        String courseName = "Learn Java for Beginners Crash Course";
        String message = "Welcome to ";

        System.out.println(courseName.charAt(0));
        System.out.println(courseName.charAt(6));

        for (int i = 15; i < 23; i++) {
            System.out.print(courseName.charAt(i));
        }
        System.out.println();

    }
}
