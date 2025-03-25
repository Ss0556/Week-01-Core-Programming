public class TemperatureAndWeightUnitConverter {
    // Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Pounds to Kilograms
    public static double convertPoundsToKg(double pounds) {
        double pounds2kg = 0.453592;
        return pounds * pounds2kg;
    }

    // Kilograms to Pounds
    public static double convertKgToPounds(double kg) {
        double kg2pounds = 2.20462;
        return kg * kg2pounds;
    }

    // Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
}