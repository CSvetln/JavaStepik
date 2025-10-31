import java.util.*;
import java.util.stream.Collectors;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        List<String> tags = readInput();
        String n;
        HashMap<String, Integer> set = new LinkedHashMap<>();
        int t;

        for(int i = 0; i < tags.size(); i++)
        {
            t = 0;
            n= tags.get(i).toString();

            if(!set.containsKey(n.toString())) {
                set.put(n.toString(), t);

                for (int j = 0; j < tags.size(); j++) {
                    if (n.equals(tags.get(j))) {
                        t += 1;
                        set.replace(tags.get(j).toString(), t);
                    }
                }
            }

        }

        StringBuilder result = new StringBuilder();
        boolean first = true;

        for (Map.Entry<String, Integer> entry : set.entrySet()) {
            if (!first) {
                result.append(", ");
            }
            result.append(entry.getKey()).append(": ").append(entry.getValue());
            first = false;
        }

        System.out.println(result.toString());
    }

    public static List<String> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input;
        if (scanner.hasNextLine()) {
            input = scanner.nextLine();
            Gson gson = new Gson();
            String[] dataArray = gson.fromJson(input, String[].class);
            return Arrays.asList(dataArray);
        }
        scanner.close();
        return null;
    }
}