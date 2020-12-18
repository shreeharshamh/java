import java.util.Scanner;

public class doWhileLoop {
    public static  void main(String[] args) {
        Scanner intObject = new Scanner(System.in);
        int value = 0;

        do {
            System.out.println("Enter a number: ");
            value = intObject.nextInt();
        }
        while (value != 5);
        System.out.println("Got 5!");
    }
}

