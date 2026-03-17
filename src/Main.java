import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Main {
    public static void readFirstFileLine(String fileName){
        try{
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            if(scanner.hasNext()){
                String firstLine = scanner.nextLine();
                System.out.println("Первая строка файла: " + firstLine);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
    public static void main(String[] args) {
        readFirstFileLine("data.txt");
    }
}
