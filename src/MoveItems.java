import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveItems {
    public static void execute() {
        Pair<Integer, List<Integer>> input = readInput();
        int n = input.getFirst();
        List<Integer> data = input.getSecond();
        String result = moveItems(n, data);
        System.out.println(result);
    }

    public static String moveItems(int n, List<Integer> items) {
        List<Integer> frontItems =  new ArrayList<>();
        List<Integer> backItems =  new ArrayList<>();
        for(int i =0; i < n; i++)
        {
            frontItems.add(items.get(i));
        }
        for(int i =n; i < items.size(); i++)
        {
            backItems.add(items.get(i));
        }
        return Stream.concat(backItems.stream(), frontItems.stream())
                .collect(Collectors.toList()).stream().map(String::valueOf).collect(Collectors.joining(", "));

    }

    public static Pair<Integer, List<Integer>> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Gson gson = new Gson();
        Type listType = new TypeToken<List<Integer>>(){}.getType();
        List<Integer> data = gson.fromJson(input.split(" \\| ")[1], listType);
        int n = Integer.parseInt(input.split(" \\| ")[0]);

        return new Pair<>(n, data);
    }
}

class Pair<F, S> {
    private final F first;
    private final S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
