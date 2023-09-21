// I have neither given nor received any unauthorized aid on this piece of work

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //int addedNum = add(Scanner scanInt = new scanner(system.in), Scanner scanInt2 = new scanner(system.in));
        System.out.println("Please enter two numbers, each value followed by the return key:");
        Scanner myNumOne = new Scanner(System.in);
        int myNumberOne = myNumOne.nextInt();
        Scanner myNumTwo = new Scanner(System.in);
        int myNumberTwo = myNumTwo.nextInt();
        int sum = add(myNumberOne,myNumberTwo);
        System.out.println("The sum of both numbers is " + sum);
        //First Method, for adding both user entered values.

        System.out.println("\nPlease enter your name, followed by the return key, for a greeting:");
        Scanner userName = new Scanner(System.in);
        String usersName = userName.next();
        String usersGreeting = greeting(usersName);
        System.out.println(usersGreeting);
        //Second method, for the user's greeting (with entered name).

        System.out.println("\nPlease enter four values to find a sum, each value followed by the return key:");
        Scanner myIntOne = new Scanner(System.in);
        int myIntegerOne = myIntOne.nextInt();
        Scanner myIntTwo = new Scanner(System.in);
        int myIntegerTwo = myIntTwo.nextInt();
        Scanner myIntThree = new Scanner(System.in);
        int myIntegerThree = myIntThree.nextInt();
        Scanner myIntFour = new Scanner(System.in);
        int myIntegerFour = myIntFour.nextInt();
        int sumOfFour = add(myIntegerOne,myIntegerTwo,myIntegerThree,myIntegerFour);
        System.out.println(sumOfFour);
        //Third Method, Four value sum


        System.out.println("\nPlease now enter something to be printed, followed by the return key:");
        Scanner userPrint = new Scanner(System.in);
        String userToBePrinted = userPrint.nextLine();
        printMe(userToBePrinted);
    }
    public static int add(int a,int b){
        return a + b;
    }
    public static String greeting(String name){
        return "Bonjour, " + name;
    }

    public static int add(int numOne, int numTwo, int numThree, int numFour){
        int firstAns = add(numOne,numTwo);
        int secondAns = add(numThree,numFour);
        return add(firstAns,secondAns);
    }

    public static void printMe(String toBePrinted){
        System.out.println("\n" + toBePrinted);
    }

}
