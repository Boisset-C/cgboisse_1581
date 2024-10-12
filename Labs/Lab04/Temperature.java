//Cosme Boisset - Lab04 - Problem 4: Temperature

/*
static double celsiusToFahrenheit(double celsius)
              Returns degrees Fahrenheit from degrees Celsius, F=95C+32

 static double celsiusToKelvin(double celsius)
               Returns degrees Kelvin from degrees Celsius, K=C+273.15

 static double fahrenheitToCelsius(double fahrenheit)
               Returns degrees Celsius from degrees Fahrenheit, C=59(F−32)

 static double fahrenheitToKelvin(double fahrenheit)
               Returns degrees Kelvin from degrees Fahrenheit, K=59(F+459.67)

 static double kelvinToFahrenheit(double kelvin)
               Returns degrees Fahrenheit from degrees Kelvin, F=95 K−459.67

 static double kelvinToCelsius(double kelvin)
               Returns degrees Celsius from degrees Kelvin, C=K−273.15 
              
 */

public class Temperature {
    public static double celsiusToFahrenheit(double celsius) {
        return 9.0 / 5 * celsius + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9  ;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit + 459.67);
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (9.0 / 5 * kelvin) - 459.67;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

}
