import java.util.Scanner;
public class Sum {


    public static void main(String[] args) {
        String s = "Hello World! 3 + 3.0 = 6 ";

        // create a new scanner with the specified String Object
        Scanner scanner = new Scanner(s);

        while (scanner.hasNext()) {

            // check if the scanner's next token is an int
            System.out.println("" + scanner.hasNextInt()); //returns true if the next token in this scanner's input can be interpreted as an int value

            // print what is scanned
            System.out.println("" + scanner.next());
        }

        // close the scanner
        scanner.close();

//use either nextInt for both values or nextLine for both values!
//        int sum = 0;
//        int operand1 = 0;
//        int operand2 = 0;
//
//
//        Scanner myScanner = new Scanner(System.in);
//
//
//        String stringOperand1 = "";
//        String stringOperand2 = "";
//
//        System.out.println("Please enter the first number to be added:");
////        stringOperand1 = myScanner.nextLine();
////        operand1 = Integer.parseInt(stringOperand1);
//        operand1 = myScanner.nextInt();
//
//        System.out.println("Please enter the second number to be added:");
////        stringOperand2 = myScanner.nextLine();
////        operand2 = Integer.parseInt(stringOperand2);
//        operand2 = myScanner.nextInt();
//
//        sum = operand1 + operand2;
//        System.out.println("Sum is: " + sum);
    }
}
