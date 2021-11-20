import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;


public class FileIO04 {

    public ArrayList<String> readFileToArrayList(String fileAName) {

        BufferedReader reader = null;
        ArrayList<String> myArray = new ArrayList<String>();
        String line;

        try {
            reader = new BufferedReader(new FileReader(fileAName));

            while ((line = reader.readLine()) != null) {
                myArray.add(line);
            }

        }

        catch (FileNotFoundException e) {
            System.err.println("File doesnt exsist: " + e.getMessage());
        }

        catch (InputMismatchException e) {
            System.err.println("Unable to parse data: " + e.getMessage());
        }

        catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }

        finally {

            if (reader != null) {
                try {
                    reader.close();
                }
                catch (Exception e) {
                    System.err.println("Error closing reader: " + e.getMessage());
                }
            }
        }
        return myArray;
    }
}

