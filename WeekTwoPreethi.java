/**
 * Week 2 in-class activity
 * name: Preethi Kulkarni
 * email: kulkarni.preethi@snhu.edu
 * studentID: 2436127
 */

/* Write a program that reads integers userNum and divNum as input (using Scanner),
and outputs userNum divided by divNum three times.
Note: End with a newline.

For example, if the input is
2000 2

then the output should be
1000 500 250

 */

import java.util.Scanner;

public class WeekTwoPreethi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any two numbers: ");
        int userNum = scanner.nextInt();
        int divNum = scanner.nextInt();

        scanner.close();
        System.out.println(userNum / divNum + " " + userNum / (divNum * 2) + " " + userNum / (divNum * 4));
    }
}
