import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class FileIO03 {


    public static void main(String[] args){
        Scanner stdinScanner = new Scanner(System.in);
        String fileName;
        Scanner reader = null;



        try{
            System.out.print("Please enter the desired file to print: ");
            fileName = stdinScanner.next();

            reader = new Scanner( new FileReader (fileName) );

            while(reader.hasNext()){
                System.out.println(reader.next());
            }
        }
        catch(FileNotFoundException e){
            System.err.println("That is an invalid file name: " + e.getMessage());
            return;
        }
        catch(InputMismatchException e){
            System.err.println("Unable to parse input");
            return;
        }
        catch (Exception e){
            System.err.println("ERROR: " + e.getMessage());
        }
        finally {
            if (reader != null){
                reader.close();
            }
        }
    }
}
