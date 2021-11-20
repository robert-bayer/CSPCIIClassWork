import java.util.Scanner;
import java.io.FileWriter;
import java.io.Writer;
import java.io.IOException;

public class FileIO02 {

    FileWriter out = null;

    public static void closeWriter (Writer file) {
        try {
            if (file != null) {
                file.close();
            }
        } catch (IOException e) {
            System.out.println("ERROR: IOException when trying to close: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeArrayToFile(String[] myArray, String fileName){
        try{
            out = new FileWriter(fileName);

            for(String term : myArray){
                String line = term;
                out.write(term + "\n");
            }
        }
        catch(IOException e){
            System.out.println("IOException: " + e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            closeWriter(out);
        }
    }
}
