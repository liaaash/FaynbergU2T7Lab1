import java.util.Scanner;
public class Class {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a string: ");
       String myString = scan.nextLine();
       System.out.println("Length: " + myString.length());
       int half = myString.length() / 2;
       System.out.println("First half: " + myString.substring(0, half));
       System.out.println("Second half: " + myString.substring(half));
       System.out.println("Enter a second string: ");
       String myString2 = scan.nextLine();
       if (myString.length() == myString2.length()) {
           System.out.println("Your strings are equal in length.");
       }
       if (myString.length() > myString2.length()) {
            System.out.println(myString + " is longer than " + myString2);
       }
       if (myString.length() < myString2.length()) {
            System.out.println(myString2 + " is longer than your first string " + myString);
       }

       if (myString.equals(myString2)) {
           System.out.println("Your strings have the exact same characters.");
       } else {
           int compare1 = myString.compareTo(myString2);
           if (compare1 < 0){
               System.out.println(myString + " is first alphabetically.");
           } else {
               System.out.println(myString2 + " is first alphabetically.");
           }
        }

       int index = myString.indexOf(myString2);
       if (index != -1){
           System.out.println(myString2 + " is found at index " + index + " of " + myString);
       } else {
           System.out.println(myString2 + " is NOT found within " + myString);
       }

    }
}
