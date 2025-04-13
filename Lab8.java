import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        try {
            Scanner scanner = new Scanner(new File(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            //Writes a header to output file
            writer.write("EmpID,Rate,Hours,Weekly Pay");
            writer.newLine();

            int lineNumber = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineNumber++;

                //Skips empty lines
                if (line.trim().isEmpty()) {
                    continue;
                }

                //Skips the header line
                if (lineNumber == 1 && line.toLowerCase().contains("payrate")) {
                    continue;
                }

                String[] parts = line.split(",");

                //Skips if the line doesn't have exactly 3 values
                if (parts.length != 3) {
                    System.out.println("Skipping malformed line " + lineNumber + ": " + line);
                    continue;
                }

                try {
                    String empId = parts[0].trim();
                    double rate = Double.parseDouble(parts[1].trim());
                    double hours = Double.parseDouble(parts[2].trim());

                    double weeklyPay;
                    if (hours <= 40) {
                        weeklyPay = rate * hours;
                    } else {
                        double overtime = (hours - 40) * rate * 1.5;
                        weeklyPay = (40 * rate) + overtime;
                    }

                    DecimalFormat df = new DecimalFormat("$#,##0.00");
                    String formattedPay = df.format(weeklyPay);

                    String outputLine = empId + "," + rate + "," + hours + "," + formattedPay;
                    writer.write(outputLine);
                    writer.newLine();

                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid number format on line " + lineNumber + ": " + line);
                }
            }

            scanner.close();
            writer.close();
            System.out.println("output.csv has been created successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("pay.csv not found.");
        } catch (IOException e) {
            System.out.println("Problem writing to output file.");
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}


