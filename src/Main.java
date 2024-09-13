import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a 4 digit year");
        int year = myScan.nextInt();
        /* using MATHEMATICAL operations (no Strings), split a year
        Example: if the user enters 1989, the output would be:
        1
        9
        8
        9

         */
        int digit1 = year - (year % 1000);
        System.out.println(digit1 / 1000);
        int digit2 = (year - digit1 - (year % 100));
        System.out.println(digit2/ 100);
        int digit3 = year - (digit1 + digit2) - (year % 10);
        System.out.println(digit3/ 10);
        int digit4 = year - (digit1 + digit2 + digit3);
        System.out.println(digit4);
    }
}
//Comment on how you tested the code to make sure it works in all situations
//include tests that you ran

// I just tests on some random 4 digit years
/* tests
Enter a 4 digit year
1989
1
9
8
9

Enter a 4 digit year
2874
2
8
7
4

Enter a 4 digit year
1002
1
0
0
2
 */