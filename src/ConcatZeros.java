import com.google.gson.Gson;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatZeros {
    public static void main(String[] args) {
        Triple<Integer, String, List<Integer>> input = readInput();
        int size = input.getFirst();
        String position = input.getSecond();
        List<Integer> data = input.getThird();
        String result = fillArray(size, position, data);
        System.out.println(result);
    }

    public static String fillArray(int size, String position, List<Integer> data) {
        String result ="";
        if(position.equals("left") || position.equals("right"))
        {
            if(data.size()>size)
                result = "Неверный размер";
            else
            if(data.size()==size)
                result = data.stream().collect(Collectors.toList()).stream().map(String::valueOf).collect(Collectors.joining(", "));
            else
            {
                List<Integer> tmp = new ArrayList<Integer>();
                for(int i=0; i<size-data.size();i++)
                {
                    tmp.add(0);
                }
                switch(position)
                {
                    case "left":
                        result = Stream.concat(tmp.stream(), data.stream())
                        .collect(Collectors.toList()).stream().map(String::valueOf).collect(Collectors.joining(", "));


                    break;
                    case "right":
                        result =  Stream.concat(data.stream(), tmp.stream())
                                .collect(Collectors.toList()).stream().map(String::valueOf).collect(Collectors.joining(", "));
                    break;
                }
            }
        }
        else
            result = "Неверная позиция";
        return result;
    }

    public static Triple<Integer, String, List<Integer>> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] values = input.split(" \\| ");
        int size = Integer.parseInt(values[0]);
        String position = values[1];
        List<Integer> data = new Gson().fromJson(values[2], new com.google.gson.reflect.TypeToken<List<Integer>>() {}.getType());

        return new Triple<>(size, position, data);
    }
}

class Triple<F, S, T> {
    private final F first;
    private final S second;
    private final T third;

    public Triple(F first, S second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }
}
