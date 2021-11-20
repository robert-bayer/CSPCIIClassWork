import java.io.FileWriter;
import java.io.Writer;
import java.io.IOException;


public class FileIO01 {
    FileWriter out = null;
    public static void closeWriter (Writer file) {
        try{
            if(file != null){
                file.close();
            }
        }
        catch (IOException e){
            System.out.println("ERROR: IOException when trying to close: " + e.getMessage());
        }
        catch (Exception e ){
            System.out.println( e.getMessage() );
        }

    }
    public void writeMessage( String message, String filename ){
        try{
            out = new FileWriter(filename);

            for(int i = 0; i < message.length(); ++i){
                char ch = message.charAt(i);
                out.write(ch);
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
