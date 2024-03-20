package Ejercicio_propuesto;

import java.util.Scanner;

public class ExtractorAnoCorregido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the identification number: ");
        long idNumber = scanner.nextLong();
        
        // Call the method to extract the year from the ID number
        int year = extractYear(idNumber);
        
        // Display the extracted year
        System.out.println("The extracted year is: " + year);
        
        scanner.close(); // Close the scanner to free up resources
    }
    
    // Method to extract the year from the given ID number
    public static int extractYear(long idNumber) {
        // Convert the ID number to a string for easy extraction
        String idString = Long.toString(idNumber);
        
        // Extract the first two digits representing the year
        String yearStr = idString.substring(0, 2);
        
        // Convert the year string to an integer
        int year = Integer.parseInt(yearStr);
        
        return year; // Return the extracted year
    }
}
