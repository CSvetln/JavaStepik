
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;
public class FinderPng {

    public static void main(String[] args) {
        List<String> data = readInput();
        List<String> result = findPNGFiles(data);
        System.out.println(new Gson().toJson(result));
    }

    public static List<String> findPNGFiles(List<String> files) {
        List<String> result = new ArrayList<String>();
        for(String file: files){
            if(file.matches("\\w*.png"))
            result.add(file);
        }
        return result;
    }

    public static List<String> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return new Gson().fromJson(input, new TypeToken<List<String>>() {}.getType());
    }
}
