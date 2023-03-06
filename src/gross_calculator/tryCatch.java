package gross_calculator;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class tryCatch {
    public static void main(String[] args) {
        File file = new File("resources/textfile.txt");

        try{
            file.createNewFile();
        }catch(Exception e) {
            System.out.println("An error has occured " + e.getMessage());
//            e.printStackTrace();
        }
    }
}
