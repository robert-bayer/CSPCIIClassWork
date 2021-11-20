import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class FileIO05 {

    public double calculateAverage(String filename){
        double total = 0;
        int n = 0;
        double value;
        Scanner reader = null;

        try{
            reader = new Scanner(new FileReader(filename));


            while(reader.hasNextDouble()) {
                total += reader.nextDouble();
                n += 1;
            }
            total = total / n;
        }
        catch (FileNotFoundException e){
            System.err.println("Cannot open file: " + e.getMessage());
        }
        catch (InputMismatchException e){
            System.err.println("Invalid data parsing: " + e.getMessage());
        }
        catch (ArithmeticException e){
            System.err.println("Calculation error: " + e.getMessage());
        }
        catch (Exception e){
            System.err.println("ERROR: " + e.getMessage());
        }
        finally{
            if(reader != null){
                try{
                    reader.close();
                }
                catch (Exception e){
                    System.err.println("Error closing reader: " + e.getMessage());
                }
            }
        }
        return total;
    }
}
