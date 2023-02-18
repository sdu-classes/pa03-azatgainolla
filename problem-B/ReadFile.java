import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File f = new File("C:\\java\\AZAT.txt");
            Scanner scan = new Scanner(f);
            ArrayList<String> arr = new ArrayList<>();
            while (scan.hasNext()) {
                arr.add(scan.nextLine());
            }
            for (int i = 0; i < arr.size(); i++) {
                System.out.println("["+ i+ "]: "+ arr.get(i));
            }
        }
        catch (FileNotFoundException f){
            System.out.println("Wrong "  + f.getMessage());
        }
    }

}
