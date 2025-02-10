public class StrgBuildingTwo {

    public static void main(String[] args) {

        StringBuilder first = new StringBuilder("This is a String");
        StringBuilder second = new StringBuilder("This is a String");

        String firstString = first.toString();
        String secondString = second.toString();

        System.out.printf("firstString: %s %n", firstString);
        System.out.printf("secondString: %s %n", secondString);
        System.out.printf("firstString is the same as secondString: %s %n", firstString == secondString);
        System.out.printf("firstString.equals(secondString): %s %n", firstString.equals(secondString));
    }

}