import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        secondMethod(args);
    }

    public static void secondMethod(String[] args) {
        try (Scanner num = new Scanner(System.in)) {
            System.out.print("Enter your number: ");
            String number = num.nextLine();
            System.out.print("\nSearch for even (true(1)/false(0)): ");
            String searchEvenStr = num.next();

            boolean searchEven = searchEvenStr.equals("1");
            int result = oddEvenCounter(number, searchEven);
            System.out.print("Result: " + result);
        }
    }

    public static int oddEvenCounter(String number, boolean searchTF) {
        int odd = 0;
        int even = 0;
        char[] charNumArray = number.toCharArray();
        int[] intNumArray = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            intNumArray[i] = charNumArray[i] - '0';
            if (searchTF) {
                if (intNumArray[i] % 2 == 0) {
                    even++;
                }
            } else {
                if (intNumArray[i] % 2 != 0) {
                    odd++;
                }
            }
        }
        return searchTF ? even : odd;
    }
}