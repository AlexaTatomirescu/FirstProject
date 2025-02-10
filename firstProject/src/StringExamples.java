public class StringExamples {

    public static void main(String[] args) {

        String courseName = "Learn Java for Beginners Crash Course";
        String message = "Welcome to ";

        //concatenate courseName and message to create a new String
        String fullMessage = message + courseName;
        System.out.println(fullMessage);

        //use string format
        String fullmessage2 = String.format("%s%s", message, courseName);
        System.out.println(fullmessage2);

        //use printf
        System.out.printf("Hello, and %s the %s.%n", message, courseName);

        for (int i = 0; i < 37; i++){
            char character = courseName.charAt(i);
            System.out.println(character); //one char on each line
        }

    }
}
