import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;
public class CountRepeat {
    public static void main(String[] args) {
        List<String> data = readInput();
        StringBuilder result = new StringBuilder();
        String tmp;
        int col = 0;
for(int i =0; i<data.size(); i++)
{
    col =0;
   tmp = data.get(i);
   for(int j =0;j< data.size(); j++) {
       if (data.get(j) == tmp)
           col++;
   }
   result.append(tmp);
   result.append(col);
}

        System.out.println(result);
    }

    public static List<String> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return new Gson().fromJson(input, new TypeToken<List<String>>() {}.getType());
    }
}
