// Loops
// 1.while loop

// public class Main {
// public static void main(String[] args) {
// int counter = 0;
// while (counter <= 5) {
// System.out.println("Hello ");
// counter++;

// }
// }
// }

// 2.for loop
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hii Pratik");
        }
    }
}

// 3.do while loop
/**
 * Main
 */
// public class Main {

// public static void main(String[] args) {
// int counter = 0;
// do {
// System.out.println("hii");
// counter++;
// } while (counter <= 5);
// }
// }

// Print number from 1 to 10 in while loop
/**
 * Main
 */
// public class Main {

// public static void main(String[] args) {
// int number = 1;
// while (number <= 10) {
// System.out.println(number);
// number++;
// }
// }
// }

// print the number from 1 to n from rhe user by using a while loop
/**
 * Main
 */
// import java.util.*;

// public class Main {

// public static void main(String[] args) {
// System.out.println("Please Enter the last number =");
// Scanner sc = new Scanner(System.in);
// int number = sc.nextInt();
// int counter = 1;
// while (counter <= number) {
// System.out.println(counter);
// counter++;

// }
// }
// }

// sum of print frist natural number
/**
 * Main
 */
// import java.util.*;

// public class Main {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int sum = 0;
// int i = 1;
// while (i <= n) {
// sum += i;
// i++;
// }
// System.err.println("sum is :" + sum);
// }
// }

/**
 * Main
 */
// public class Main {

// public static void main(String[] args) {
// for (int j = 1; j <= 5; j++) {
// System.out.println("* * * *");
// }

// }
// }

// Print the reserve number
/**
 * Main
 */
// public class Main {

// public static void main(String[] args) {
// int n = 10899;
// while (n > 0) {
// int lastdigit = n % 10;
// System.out.print(lastdigit + " ");
// n = n / 10;

// }
// System.out.println();
// }
// }

// Another method to the given number is reverse
// public class Main {

// public static void main(String[] args) {
// int n = 10899;
// int rev = 0;
// while (n > 0) {
// int lastdigit = n % 10;
// rev = (rev * 10) + lastdigit;
// n = n / 10;

// }
// System.out.println(rev);
// }
// }

// Print Hello world 10 time using a do while loop
/**
 * Main
 */
// public class Main {

// public static void main(String[] args) {
// int string = 0;

// do {
// System.out.println("Hello World");
// string++;

// } while (string <= 10);
// }
// }

// Example of Break
// Frist Will you used in the switch statement;
/**
 * Main
 */
// import java.util.*;

// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the value of a=");
// int a = sc.nextInt();
// System.out.print("Enter the value of b=");
// int b = sc.nextInt();

// char operator = sc.next().charAt(0);
// switch (operator) {
// case '+':
// System.out.println(a + b);
// break;

// default:
// System.out.println("no");
// break;
// }
// }

// }

// Print 1 to 10 by using a while loop and break in 6
/**
 * Main
 */
// public class Main {

// public static void main(String[] args) {
// int n = 1;
// while (n <= 10) {
// if (n == 6) {
// break;

// }
// System.out.println(n);
// n++;

// }
// }
// }

// public class Main {

// public static void main(String[] args) {
// int n = 1;
// while (n <= 10) {
// if (n == 6) {
// continue;

// }
// System.out.println(n);
// n++;

// }
// }
// }

// Enter the user value .vlaue is mutilple by 10 then exist
/**
 * Main
 */
// import java.util.*;;

// public class Main {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// do {
// System.out.println("Enter your number=");
// int n = sc.nextInt();
// if (n % 10 == 0) {
// break;
// }
// // System.out.println(n);

// } while (true);

// }
// }

// Continue keyword;

/**
 * Main
 */
// public class Main {

// public static void main(String[] args) {
// for (int i = 0; i <= 5; i++) {
// if (i == 3) {
// continue;
// }
// System.out.println(i);
// }
// }
// }

/**
 * Main
 */
// import java.util.*;

// public class Main {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// do {
// System.out.print("Enter your number=");
// int n = sc.nextInt();
// if (n % 10 == 0) {
// continue;
// }
// System.out.println("number was = " + n);
// } while (true);

// }
// }

/**
 * Main
 */
// import java.util.*;

// public class Main {

// public static void main(String[] args) {
// System.out.print("Enter the value =");
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// if (n % 2 == 0) {
// System.out.println(" Not Prime Number");
// } else {
// System.out.println("prime number ");
// }

// }
// }

// print sum of n number from a user
// import java.util.*;

// /**
// * Main
// */
// public class Main {

// public static void main(String[] args) {
// System.out.print("Enter the value of a=");
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int sum = 0;
// int i = 1;

// while (i <= n) {
// sum = sum + i;
// i++;

// }
// System.out.println(sum);
// }
// }
