import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meters = 0;
        String trash = "";
        System.out.println("Provide any amount in meters: ");
    //The system starts out with asking the user any amount in meters
        if (in.hasNextInt())
        {
            meters = in.nextDouble();
            System.out.println("You have this many in feet: " + (meters * 3.28));
            System.out.println("You have this many in miles:" + (meters/1609.344));
            System.out.println("You have this many in inches: " + (meters * 39.3701));
        }
        //The system gives the user the 3 different conversions at once
        else
        {
            trash = in.nextLine();
            System.out.println("Please enter correct value: " + trash);
            //Formulating the code for when anything other than a double is typed in
        }
    }
}