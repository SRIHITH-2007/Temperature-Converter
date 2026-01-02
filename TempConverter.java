import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double value = sc.nextDouble();

        System.out.print("Enter unit (C/F/K): ");
        char unit = sc.next().toUpperCase().charAt(0);

        double celsius, fahrenheit, kelvin;

        if (unit == 'C') {
            celsius = value;
            fahrenheit = (value * 9/5) + 32;
            kelvin = value + 273.15;
        }
        else if (unit == 'F') {
            fahrenheit = value;
            celsius = (value - 32) * 5/9;
            kelvin = celsius + 273.15;
        }
        else if (unit == 'K') {
            kelvin = value;
            celsius = value - 273.15;
            fahrenheit = (celsius * 9/5) + 32;
        }
        else {
            System.out.println("Invalid unit entered!");
            return;
        }

        System.out.println("\n-- Converted Temperatures --");
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
    }
}

